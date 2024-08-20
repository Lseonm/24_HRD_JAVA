package day10;

import java.sql.SQLException;
import java.util.*;

public class BoardMain {
	
	DataModel dm = null;
	
	// 필드
	private Scanner scan = new Scanner(System.in);
	
	
	// 생성자
	public BoardMain() {
		dm = new DataModel();
	}
	
	
	// 메소드
	public void mainMenu() throws SQLException {
		System.out.println();
		
		System.out.println("--------------------------------------------------");
		System.out.println("메인 메뉴 : 1.CREATE | 2.READ | 3.CLEAR | 4.EXIT | 5.JOIN");
		System.out.print("메뉴 선택 : ");
		String menuNum = scan.nextLine();
		System.out.println();
		
		switch (menuNum) {
		case "1":
			dm.create();
			break;
			
		case "2":
			dm.read();
			break;
			
		case "3":
			dm.clear();
			break;
			
		case "4":
			dm.exit();
			break;
		case "5":
			dm.join();
			break;
		}
	}
	
	
	public static void main(String[] args) throws SQLException {
		BoardMain be = new BoardMain();
		be.mainMenu();
		
	}

}
