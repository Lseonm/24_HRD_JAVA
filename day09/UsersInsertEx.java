package day09;

import java.sql.*;

public class UsersInsertEx {
	
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
			
			
			// PreparedStatement 활용 -> 값과 분리
			String sql = "INSERT INTO users VALUES (?, ?, ?, ?, ?)";

			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, "hong"); // DB는 1인덱스로 시작 -> 첫 번째 인덱스 자리에 값 넣기
			ps.setString(2, "홍길동");
			ps.setString(3, "1234");
			ps.setInt(4, 21);
			ps.setString(5, "hong@a.com");
			
			
			
		
			
		
			// 데이터 추가 명령 전송
			
			int row = ps.executeUpdate(); // SQL문 실행
			
			if(row > 0)
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
