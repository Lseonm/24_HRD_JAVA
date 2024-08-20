package day09;

import java.sql.*;
import java.io.*;

public class BoardsInsertEx {
	
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
			String sql = "INSERT INTO boards (btitle, bcontent, bwriter, bdate, bfilename, bfiledata) VALUES (?, ?, ?, now(), ?, ?)";

			PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			ps.setString(1, "눈 오는 날"); // DB는 1인덱스로 시작 -> 첫 번째 인덱스 자리에 값 넣기
			ps.setString(2, "함박눈이 내려요");
			ps.setString(3, "winter");
			ps.setString(4, "snow.jpg");
			ps.setBlob(5, new FileInputStream("snow.jpg"));
			
			
			
		
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
				System.out.println("연결 끊기");
				
			} catch (SQLException e2) {
				System.out.println(e2.getMessage());
			}
		}
		
	}

}
