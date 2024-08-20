package day09;

import java.sql.*;

public class DBTest {
	
	// 1. 빌드 패스
	
	public static void main(String[] args) {
		
		Connection con = null;
		
		try {
		
			
			// 2. JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			// 3. DB 연결
			// 지역변수로 구성하는게 좋음 (길어서)
			String url = "jdbc:mysql://localhost:3306/DBExam"; // 드라이버/DB 서버 ip:포트 번호/DB명
			String id = "root"; // DB 아이디
			String pwd = "1234"; // DB 비밀번호
			
			con = DriverManager.getConnection(url, id, pwd); // DriverManager는 getter메소드임
	
			
		
			
			System.out.println("DB 연결 성공");
			
			
			
			
			// 4. SQL문 실행을 위한 Statement, PreparedStatement 객체 생성
			
			// Statement 활용
//			String sql = "INSERT INTO person VALUES ('이자바', '010-1443-4331', 'Lee@a.com', 19)";
			
			// new 키워드 X -> con 을 통해 접근
//			Statement st = con.createStatement();
			
			
			// PreparedStatement 활용 -> 값과 분리
			String sql2 = "INSERT INTO person VALUES (?, ?, ?, ?)";

			PreparedStatement ps = con.prepareStatement(sql2);
			
			ps.setString(1, "장길동"); // DB는 1인덱스로 시작 -> 첫 번째 인덱스 자리에 값 넣기
			ps.setString(2, "010-5555-3333");
			ps.setString(3, "jang@a.com");
			ps.setInt(4, 21);
			
			PreparedStatement ps2 = con.prepareStatement(sql2);
			ps2.setString(1, "박길동");
			ps2.setString(2, "010-5534-3434");
			ps2.setString(3, "park@a.com");
			ps2.setInt(4, 44);
			
			
			
			// 데이터 추가 명령 전송
//			int row = st.executeUpdate(sql);
			/*
			 * int row2 = ps.executeUpdate(); // SQL문 실행
			 * 
			 * if(row2 > 0) System.out.println("저장 성공"); else {
			 * System.out.println("데이터 저장 실패"); }
			 */
			
			int row3 = ps2.executeUpdate(); // SQL문 실행
			
			if(row3 > 0)
				System.out.println("저장 성공");
			else {
				System.out.println("데이터 저장 실패");
			}
			
			
			
			
			
			
			
		} catch (Exception e) {
		System.out.println("드라이버 로딩 실패");
		
		
		} finally {
			try {
				con.close();
				
			} catch (SQLException e2) {
				
			}
		}
		
	}

}
