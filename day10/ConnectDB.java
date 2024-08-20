package day10;

import java.sql.*;
import java.io.*;

public class ConnectDB {

	// DB 연결 및 해제만 담당 (단일 책임 원칙)

	static Connection conn = null;

	public ConnectDB() {

		try {

			// JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");

			// DB 연결
			// 지역변수로 구성하는게 좋음 (길어서)
			String url = "jdbc:mysql://localhost:3306/DBExam"; // 드라이버/DB 서버 ip:포트 번호/DB명
			String id = "root"; // DB 아이디
			String pwd = "1234"; // DB 비밀번호

			conn = DriverManager.getConnection(url, id, pwd); // DriverManager는 getter메소드임

			System.out.println("DB 연결 성공");
			

		} catch(Exception e) {
			System.out.println("DB 연결 실패 : " + e.getMessage());
		}

	} // 생성자 끝
	
	
	
	// 반환타입이 Connection인 메소드
	Connection getConn() {
		return conn;
	}
	
	
	
	
	
}
