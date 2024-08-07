package day02;

import java.util.Scanner;

public class IfExam2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String id = "";
		int num = 0;
		
		System.out.println("## 로그인 (admin 혹은 임의 아이디) ##");
		System.out.print("# 로그인 아이디 : ");
		
		id = scan.next();
		
		
		if(id.equals("admin")) {
		System.out.println("관리자 로그인 !!");
		} else {
			System.out.println("일반 사용자 | " + id + " 로그인 !!");
		}
			
		System.out.println();
		
		System.out.println("## 메뉴를 선택하세요 (1~2) ## ");
		System.out.print("# 메뉴 선택 : ");
		
		num = scan.nextInt();
		
		if(num == 1 && id.equals("admin")) {
		System.out.println("관리자 " + num + "번 선택함" );
		} else if(num == 1 && !id.equals("admin")) {
			System.out.println(id + " " + num + "번 선택함");
		} else if (num ==2 && id.equals("admin")) {
			System.out.println("관리자 " + num + "번 선택함");
		} else if (num == 2 && !id.equals("admin")) {
			System.out.println(id + " " + num + "번 선택함");
		}
		
		
	}

}
