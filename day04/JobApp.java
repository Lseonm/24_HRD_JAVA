package day04;

import java.util.Scanner;
import static java.lang.System.out; // out.println 만 써도 출력됨
import java.util.ArrayList;

public class JobApp {
	
	static Person p1 = new Person();; // 전역에서 사용하는 객체 // 사용할 곳에서 생성
	
	ArrayList<Person> arrList = new ArrayList<Person>();; // 전역에서 사용할 리스트
	
	public void showMenu() {
		System.out.println("=======JOB v1.1=======");
		System.out.println("-- 1. 구직 등록 --");
		System.out.println("-- 2. 구인 등록 --");
		System.out.println("-- 3. 구직자 정보 출력 --");
		System.out.println("-- 4. 구인 회사 정보 출력 --");
		System.out.println("-- 5. 종료 --");
		System.out.println("======================");
		System.out.println("메뉴 번호를 입력하세요=>");
		System.out.println("======================");
	}
	
	
	// 1. 구직 등록 메소드
	public void inputPerson() {
		Scanner sc = new Scanner(System.in);
		p1 = new Person();
		
		System.out.println("-- 구직 등록 start ----");
		System.out.println("이름 입력 > ");
		String nm = sc.next();
		p1.name = nm;
		System.out.println("나이 입력 > ");
		int a = sc.nextInt();
		p1.age = a;
		
		System.out.println("-- 성별 메뉴 --");
		System.out.println(" 1. 남자  2. 여자");
		System.out.println("---------------");
		System.out.println("성별 메뉴번호 입력 > ");
		int s = sc.nextInt();
		
		if(s==1) {
			p1.gender = 'M';
		} else if(s==2) {
			p1.gender = 'F';
		} else
			System.out.println("지원되지 않는 메뉴 번호입니다.");
		
		System.out.println("전화번호 입력 > ");
		String t = sc.next();
		p1.tel = t;
		
		
		
//		arrList = new ArrayList<Person>();
		arrList.add(p1);
		
		
			
		System.out.println("정보 입력 완료\n");
	}
	
	
	// 3. 구직자 정보 출력 메소드
	void showInfo() {
		for(Person p : arrList) {
			p.getInfo();
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		JobApp ja = new JobApp();
		
		while(true) {
		ja.showMenu();
		int no = sc.nextInt();
		if(no==1) {
			ja.inputPerson(); // static(정적) 메소드는 클래스 이름으로 접근가능함
		} else if(no == 2) {
			
		} else if(no == 3) { 
			ja.showInfo();
			
		} else if(no == 4) {
			
		} else if(no == 5) {
			System.exit(0);
		}
		
		
		}
		
	}

}
