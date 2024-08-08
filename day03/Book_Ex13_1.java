package day03;

import java.util.ArrayList;

public class Book_Ex13_1 {

	public static void main(String[] args) {
		
		Book_Ex13 user1 = new Book_Ex13("hong", "12345");
		
		boolean result = user1.login("hong", "12345");
		
		// 객체를 저장하는 리스트
		ArrayList<Book_Ex13> memList = new ArrayList<Book_Ex13>();
		
		memList.add(user1);
		memList.add(new Book_Ex13("Kim", "9876"));
		
		for(Book_Ex13 m : memList) {
			System.out.println(m.name + "\t" + m.id);
		}
		
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			user1.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}

}
