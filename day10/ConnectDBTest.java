package day10;

import java.sql.*;

public class ConnectDBTest {
	
	static Connection conn;

	public static void main(String[] args) {
		
		ConnectDB cdb = new ConnectDB();
		conn = cdb.getConn();
		
		
		if(conn == null) {
			System.out.println("연결 객체 생성 실패");
		} else {
			System.out.println("연결 객체 생성 성공");
		}
		
	}

}
