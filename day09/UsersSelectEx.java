package day09;

import java.sql.*;

public class UsersSelectEx {
	
	// 1. 빌드 패스
	
	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet row = null;
		
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
			
			
			
			
			// 4. SQL문 조회
			
			
			String sql = "SELECT * From users WHERE userid = ? ";
			
			ps = con.prepareStatement(sql);
			ps.setString(1, "hong");
			
			row = ps.executeQuery();
			
			if(row.next()) {
				System.out.println("데이터 조회 성공");
				String name = row.getString("username");
				int age = row.getInt("userage");
				
				System.out.println("유저 이름 : " + name);
				System.out.println("유저 나이 : " + age);
			}
			else {
				System.out.println("데이터 조회 실패..");
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
