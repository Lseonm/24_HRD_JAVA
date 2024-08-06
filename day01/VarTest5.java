package day01;

import java.util.Scanner;

public class VarTest5 {

	public static void main(String[] args) {
		// 4칙 연산과 나머지 연산을 하는 간단한 계산기 예제
		Scanner sc = new Scanner(System.in);
		
		// 1. 4칙 연산을 입력 받아 저장하는 변수 선언
		System.out.println("연산자 입력 : ");
		String Cal = sc.next();
		
		// 2. 2개 정수 입력 받아 저장하는 변수 선언
		int x,y;
		System.out.println("x, y 정수 입력 : ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		int result = 0;
		
		// 3. +, -, *, /, % 연산
		if(Cal.equals("+")) {
			result = x + y;
			System.out.println("x + y = " + result );
		} else if(Cal.equals("-")) {
			result = x - y;
			System.out.println("x - y = " + result);
		} else if(Cal.equals("*")) {
			result = x * y;
			System.out.println("x * y = " + result);
		} else if(Cal.equals("/")) {
			result = x / y;
			System.out.println("x / y = " + result);
		} else if(Cal.equals("%")) {
			result = x % y;
			System.out.println("x % y = " + result);
		}
	}
}
