package day03;

public class Book_Ex13 {
	
	// 속성
	String name;
	String id;
	String password;
	int age;
	
	
	// 생성자
	public Book_Ex13() {
		
	}
	
	public Book_Ex13(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	
	// 메소드
	public boolean login(String id, String password) {
		
		boolean result = false;
		
		if(id.equals("hong") && password.equals("12345")) {
			result = true; 
			}
		return result;
	}
	
	public void logout(String id) {
		System.out.println(id + " 님이 로그아웃 되었습니다.");
	}

}
