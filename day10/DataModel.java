package day10;


import java.sql.*;
import java.io.*;
import java.util.*;
import day09.Users;

// 1. DB 연결
// 2. 데이터 입출력 담당 메소드 구현

public class DataModel {

	// 필요 멤버 변수
	static Connection conn = null;
	static PreparedStatement ps = null;
	static ResultSet result = null;
	static ConnectDB cdb = null;
	static Board board = null;
	static Users user = null;
	static Scanner scan = null;
	static BoardMain be = null;

	
	
	public DataModel() {

		cdb = new ConnectDB();
		conn = cdb.getConn();

		if (conn != null) {
			System.out.println("연결 성공");
		} else {
			System.out.println("연결 실패");
		}
		
		scan = new Scanner(System.in);
	}
	
	
	
	// 데이터 추가 메소드 (INSERT INTO ~ VALUES)
	// 매개변수로 bo 받는 것이 중요
	public void insertData(Board board) throws SQLException {
		int row = 0;
		
		this.board = board;
		
		String sql = "INSERT INTO boards(btitle, bcontent, bwriter, bdate) VALUES(?, ?, ?, now())";
		
		ps = conn.prepareStatement(sql);
		
		ps.setString(1, board.getBtitle());
		ps.setString(2, board.getBcontent());
		ps.setString(3, board.getBwriter());
		
		row = ps.executeUpdate();
		
		if(row > 0)
			System.out.println("데이터 저장 성공");
		else 
			System.out.println("데이터 저장 실패");
	}
	
	
	
	
	// Users 에 데이터 삽입
	public void insertData(Users user) throws SQLException {
		int row = 0;
		
		this.user = user;
		
		String sql = "INSERT INTO users VALUES(?, ?, ?, ?, ?)";
		
		ps = conn.prepareStatement(sql);
		
		ps.setString(1, user.getUserid());
		ps.setString(2, user.getUsername());
		ps.setString(3, user.getUserpassword());
		ps.setInt(4, user.getUserage());
		ps.setString(5, user.getUseremail());
		
		row = ps.executeUpdate();
		
	}
	
	
	
	
	
	// 게시물 데이터 입력 받는 메소드 (Board)
	public void create() throws SQLException {
		Board board = new Board();
		
		System.out.println("[새 게시물 입력]");
		
		System.out.print("제목 : ");
		board.setBtitle(scan.nextLine());
		
		System.out.print("내용 : ");
		board.setBcontent(scan.nextLine());
		
		System.out.print("작성자 : ");
		board.setBwriter(scan.nextLine());
		
		/////////////////////////////////////////
		insertData(board); //// DB에 데이터 저장 메소드 호출
		////////////////////////////////////////
		
		list();
	}
	
	
	
	
	// 게시물 데이터 입력 받는 메소드 (Users)
		public void join() throws SQLException {
			user = new Users();
			
			System.out.println("[새 사용자 입력]");
			
			System.out.print("아이디 : ");
			user.setUserid(scan.nextLine());
			
			System.out.print("이름 : ");
			user.setUsername(scan.nextLine());
			
			System.out.print("비밀번호 : ");
			user.setUserpassword(scan.nextLine());
			
			System.out.print("나이 : ");
			user.setUserage(scan.nextInt());
			
			System.out.print("이메일 : ");
			user.setUseremail(scan.next());
			

			insertData(user); //// DB에 데이터 저장 메소드 호출
			
			System.out.println("-----------------------------------------------");
			System.out.println("보조 메뉴 : 1. OK | 2.Cancel");
			System.out.print("메뉴 선택 : ");
			String menuNum = scan.nextLine();
			
			
			if(menuNum.equals("1")) {
				System.out.println("데이터 저장 성공");
			} else if(menuNum.equals("2")) {
				System.out.println("데이터 저장 실패");
			}
			

		}
			
			
	// 게시물 데이터 전체 조회 하는 메소드
	public void list() {
		System.out.println();
		System.out.println("[게시물 목록]");
		System.out.println("-----------------------------------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "   date", "   title");
		System.out.println("-----------------------------------------------------------");

		// boards 테이블에서 게시물 정보를 가져와서 출력하기
		try {
			
			String sql = "SELECT bno, btitle, bcontent, bwriter, bdate FROM boards";
			
			ps = conn.prepareStatement(sql);
			result = ps.executeQuery();
			
			while(result.next()) {
				board = new Board();
				board.setBno(result.getInt("bno"));
				board.setBtitle(result.getString("btitle"));
				board.setBcontent(result.getString("bcontent"));
				board.setBwriter(result.getString("bwriter"));
				board.setBdate(result.getDate("bdate"));
				
				System.out.printf("%-6s%-12s%-16s%-40s \n", 
						board.getBno(),
						board.getBwriter(),
						board.getBdate(),
						board.getBtitle());
			}
			
			be = new BoardMain();
			be.mainMenu();
//			result.close();
//			ps.close();

		} catch (SQLException e) {
			e.printStackTrace();
			
		}
	}
	
	// 조건(작성자)있는 데이터만 검색하는 메소드 (메소드 오버로딩)
	public void list(String name) {
		System.out.println();
		System.out.println("[게시물 목록]");
		System.out.println("-----------------------------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
		System.out.println("-----------------------------------------------------");

		// boards 테이블에서 게시물 정보를 가져와서 출력하기
		try {
			
			String sql = "SELECT bno, btitle, bcontent, bwriter, bdate FROM boards WHERE bwriter = ?";
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			
			result = ps.executeQuery();
			
			while(result.next()) {
				board = new Board();
				board.setBno(result.getInt("bno"));
				board.setBtitle(result.getString("btitle"));
				board.setBcontent(result.getString("bcontent"));
				board.setBwriter(result.getString("bwriter"));
				board.setBdate(result.getDate("bdate"));
				
				System.out.printf("%-6s%-12s%-16s%-40s\n", 
						board.getBno(),
						board.getBwriter(),
						board.getBdate(),
						board.getBtitle());
			}
			
			result.close();
			ps.close();

		} catch (SQLException e) {
			e.printStackTrace();
			
		}
	}
	
	
	
	// 게시물 읽기 메소드 (조건 : bno를 입력받아서 해당 조건의 게시물만 읽어옴)
	// --> 매개변수 활용
	
	public void read() throws SQLException {
		System.out.println();
		System.out.println("[게시물 조회]");
	
		System.out.print("bno : ");
		int bno = Integer.parseInt(scan.nextLine());

		String sql = "SELECT bno, btitle, bcontent, bwriter, bdate FROM boards WHERE bno = ? ";
		
		ps = conn.prepareStatement(sql);
		ps.setInt(1, bno);
		
		result = ps.executeQuery();
		
		if(result.next()) {
			board = new Board();
			board.setBno(result.getInt("bno"));
			board.setBtitle(result.getString("btitle"));
			board.setBcontent(result.getString("bcontent"));
			board.setBwriter(result.getString("bwriter"));
			board.setBdate(result.getDate("bdate"));
			
			System.out.println("#################################");
			System.out.println("번호 : " + board.getBno());
			System.out.println("제목 : " + board.getBtitle());
			System.out.println("내용 : " + board.getBcontent());
			System.out.println("작성자 : " + board.getBwriter());
			System.out.println("날짜 : " + board.getBdate());
			System.out.println("#################################");
		}
		result.close();
		ps.close();
			
			// 보조 메뉴 출력
			System.out.println("----------------------------------------");
			System.out.println("보조 메뉴 : 1.UPDATE | 2.DELETE | 3.List");
			System.out.print("메뉴 선택 : ");
			String menuNum = scan.nextLine();
			System.out.println();
			
			if(menuNum.equals("1")) {
				update(board);
			} else if(menuNum.equals("2")) {
				delete(board);
			} else if(menuNum.equals("3")) {
				list();
			
		}
	}
	
	
	public void update(Board board) throws SQLException {
		// 수정 내용 입력 받기
		System.out.println("[수정 내용 입력]");
		System.out.print("제목 : ");
		board.setBtitle(scan.nextLine());
		System.out.print("내용 : ");
		board.setBcontent(scan.nextLine());
		System.out.print("작성자 : ");
		board.setBwriter(scan.nextLine());
		
		// 보조 메뉴
		System.out.println("----------------------------------");
		System.out.println("보조 메뉴 : 1.OK | 2.Cancel");
		System.out.print("메뉴 선택 : ");
		String menuNum = scan.nextLine();
		
	
		
		if(menuNum.equals("1")) {
			// boards 테이블에서 게시물 정보 수정
			try {
				String sql = "UPDATE boards SET btitle = ?, bcontent = ?, bwriter = ? WHERE bno = ?";
				
				ps = conn.prepareStatement(sql);
				
				ps.setString(1, board.getBtitle());
				ps.setString(2, board.getBcontent());
				ps.setString(3, board.getBwriter());
				ps.setInt(4, board.getBno());
				

				ps.executeUpdate();
				ps.close();
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if(menuNum.equals("2")) {
			System.out.println("취소");
		}
		list(); 
	}
	
		
	
	
	public void delete(Board board) {
		// boards 테이블에 게시물 정보 삭제
		
		try {
			String sql = "DELETE FROM boards WHERE bno = ?";
			
			ps = conn.prepareStatement(sql);
			
			ps.setInt(1, board.getBno());
			
			ps.executeUpdate();
			ps.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		list();
	}
	
	
	public void clear() {
		System.out.println();
		System.out.println("[게시물 전체 삭제]");
		System.out.println("--------------------------------------");
		System.out.println("보조 메뉴 : 1.OK | 2.Cancel");
		System.out.print("메뉴 선택 : ");
		String menuNum = scan.nextLine();
		
		if(menuNum.equals("1")) {
			try {
				String sql = "TRUNCATE TABLE boards";
				
				ps = conn.prepareStatement(sql);
				
				ps.executeUpdate();
				ps.close();
				
			} catch (Exception e) {
				e.printStackTrace();
				exit();
			}
		}
		list();
	}
	
	
	public void exit() {
		if(conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				
			}
		}
		System.out.println("** 게시판 종료 **");
		System.exit(0);
	}
	
	
	
	public static void main(String[] args) throws SQLException {
		DataModel dm = new DataModel();
		
//		dm.create();
		dm.list();
//		dm.update(board);
//		dm.read(6);
	
	}

}
