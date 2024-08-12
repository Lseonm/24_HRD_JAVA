package day05;

import java.util.ArrayList;
import java.util.Scanner;

public class SchoolApp {
	
	
	
	
	
	

	public static void main(String[] args) {
		Person person;
		ArrayList<Person> personList = new ArrayList<Person>();
		
		person = new Student(20240812, "정보보안학과", "홍길동", 20); // 학생 객체 생성
		personList.add(person);
		
		personList.add(new Staff(20101023, "HRD 사업단", "김사업", 32)); // 익명 클래스 추가
		personList.add(new Teacher(20020301, "자바프로그래밍", "장교사", 42)); // 익명 클래스 추가
		
		// person.inputPerson(); // 오버라이딩 해야함
		
		
		for(Person p : personList) {
			
			// Student의 id 정보만 출력
			if(p instanceof Student) 
			System.out.println(((Student) p).getId()); // 자식 타입으로 형변환 (다운캐스팅)
			else if(p instanceof Teacher)
				System.out.println(((Teacher) p).getId()); // Teacher의 id 정보만 출력
			else if(p instanceof Staff)
				System.out.println(((Staff) p).getId()); // Staff의 id 정보만 출력
			
			// 모든 정보 출력 방식
//			System.out.println(p.personInfo() + "\n"); // 방식 1
			
//			p.printAll(); //방식 2
//			System.out.println();
		}
		
		
		
	}

}
