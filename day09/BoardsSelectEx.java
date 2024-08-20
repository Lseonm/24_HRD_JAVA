package day09;

import java.sql.*;
import java.io.*;

public class BoardsSelectEx {
	
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
			
			
			
			
			// 4. SQL문 실행을 위한 Statement, PreparedStatement 객체 생성
			
			
			
			String sql = "SELECT * FROM boards WHERE bwriter = ?";
			ps = con.prepareStatement(sql);
			
			ps.setString(1, "winter");
			
			
			row = ps.executeQuery();
			
			while(row.next()) {
				System.out.println("조회 성공");
				
				int no = row.getInt("bno");
				String title = row.getString("btitle");
				String content = row.getString("bcontent");
				String writer = row.getString("bwriter");
				String date = row.getDate("bdate").toString();
				String filename = row.getString("bfilename");
				
//				String filedata = null;
				Blob blob = row.getBlob("bfiledata");
				
				InputStream is = blob.getBinaryStream();
				OutputStream os = new FileOutputStream("snow.jpg");
				is.transferTo(os);
				
				System.out.println("번호 : " + no);
				System.out.println("제목 : " + title);
				System.out.println("내용 : " + content);
				System.out.println("작성자 : " + writer);
				System.out.println("날짜 : " + date);
				System.out.println("파일 이름 : " + filename);
//				System.out.println("파일 정보 : " + );
				
				
				os.flush();
				os.close();
				is.close();
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
