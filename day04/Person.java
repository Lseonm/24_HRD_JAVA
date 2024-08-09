package day04;

public class Person { // 사람
	
	// 객체 모델링 (클래스 멤버)
	
	// 추상화 개념 (핵심 내용만)
	
	// 속성(필드) : has - a 관계 ex) 사람은 나이를 가진다. (멤버 변수)
	String name;
	int age;
	char gender; // 'F' , 'M'
	String tel;
	
	
	
	// 기본 생성자
	public Person() {
		
	}
	
	
//	// 메소드 (동작)
	
	void getInfo() {
		System.out.println("****** " + name + " 님 정보 ******");
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age );
		System.out.println("성별 : " + this.gender);
		System.out.println("전화 번호 : " + this.tel);
		System.out.println("****************************");
	}

}
