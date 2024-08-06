package day01;

import java.util.Scanner;

public class VarTest1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		
		// 1. 정수 변수
		// int (4byte)
		int x;
		
		// 변수 초기화
		x = 3;
		
		System.out.print("첫 번째 정수 입력 : ");
		x = scan.nextInt();
		
		
		
		int y = 5;
		
		System.out.print("두 번째 정수 입력 : ");
		y = scan.nextInt();
		
		
		int result = x + y;
		System.out.println("x + y = " + result);
		
		
		System.out.println();
		
		
		// 2. 실수 변수
		// float (4byte), double(8byte)
		double height = 177.5;
		float weight = 77.3f;
		
		System.out.print("키 입력(실수형) : ");
		height = scan.nextDouble();
		
		System.out.print("몸무게 입력(실수형) : ");
		weight = scan.nextFloat();
		
		System.out.println("키 : " + height + "\t몸무게 : " + weight);
	
		
		// 3. 문자형 변수
		// char (1byte)
		char blood = 'B';
		System.out.println("혈액형은 " + blood + "형 입니다.");
		
		
		// 4. 문자열 변수
		// String
		String name = "이선민";
		
		System.out.print("이름을 입력하세요 : ");
		name = scan.next();
		System.out.println("이름은 " + name + " 입니다.");
		
		
		// 5. 논리형 변수
		// boolean형
		boolean stop = true;
		
		if (stop == true) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
	
	}

}
