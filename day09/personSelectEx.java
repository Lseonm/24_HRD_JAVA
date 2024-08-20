package day09;

import java.sql.*;
import java.util.ArrayList;

public class personSelectEx {
	
	// 1. 빌드 패스
	
	public static void main(String[] args) {
		
		Connection con = null;
		Statement st = null;
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
			
			
			
			
			
			
			// 데이터 조회 명령
			
			String sql = "SELECT name, phone FROM person";
			
			// 이름이 홍길동인 사람의 정보 출력
			String sql2 = "SELECT * FROM person ORDER BY age";
			
			
			st = con.createStatement();		
			row = st.executeQuery(sql2); // SQL문 실행 (executeQuery)
			
			
			Person person = null;
			ArrayList<Person> arList = new ArrayList<Person>();
			
			while(row.next()) {
				String name = row.getString("name");
				String phone = row.getString("phone");
				String email = row.getString("email");
				int age = row.getInt("age");
				
				
				// Person 클래스 객체 생성
				person = new Person(name, phone, email, age);
				
				arList.add(person);
				
			}
			
			for(Person p : arList) {
			System.out.println("이름 : " + p.getName());
			System.out.println("전화번호 : " + p.getPhone());
			System.out.println("이메일 : " + p.getEmail());
			System.out.println("나이 : " + p.getAge());
			System.out.println();
			}
			
			
		} catch (Exception e) {
		System.out.println("드라이버 로딩 실패");
		
		
		} finally {
			try {
				con.close();
				st.close();
				row.close();
				
			} catch (SQLException e2) {
				
			}
		}
		
	}

}
