package day03;

import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 생성자 호출
		Calculator cal = new Calculator();
		
		System.out.print("정수 2개 입력 : ");
		cal.a = scan.nextInt();
		cal.b = scan.nextInt();
		
		// 메소드 호출
		// 더하기
		System.out.println("더하기 : " + cal.add(cal.a, cal.b));
		
		// 빼기
		cal.minus(cal.a, cal.b);
		
		// 곱하기
		System.out.println("곱하기 : " + cal.mult());
		
		// 나누기
		cal.div();
		
		
		System.out.println();
		
		
		// 정사각형 넓이 구하기
		double result1 = 10 * 10 * Calculator.pi;
		
		
		// 직사각형 넓이 구하기
		double result2 = cal.areaRect(cal.a, cal.b);
		
		System.out.println("정사각형의 넓이 : " + result1);
		
		System.out.println("직사각형의 넓이 : " + result2);
		
	}

}
