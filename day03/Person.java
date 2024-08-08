package day03;

public class Person { // 사람
	
	// 객체 모델링 (클래스 멤버)
	
	// 추상화 개념 (핵심 내용만)
	
	// 속성(필드) : has - a 관계 ex) 사람은 나이를 가진다.
	int age;
	String name;
	String blood;
	// (멤버 변수)
	
	
	// 기본 생성자
	public Person() {	}
	
	
	// 메소드 (동작)
	void smile() {
		System.out.println("웃는다.");
	}
	
	void eat() {
		System.out.println("먹는다.");
	}
	

}
