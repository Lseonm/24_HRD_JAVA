package day02;

import java.util.Scanner;

public class WhileExam2 {

	public static void main(String[] args) {
		/**
		 * 1. 증속 | 2. 감속 | 3. 중지
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		boolean run = true;
		
		int speed = 50;
		
		while (run) {
			System.out.println("--------번호를 입력해주세요.---------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("-------------------------------------");
			System.out.print("번호 : ");
			
			num = scan.nextInt();
			
			if(num == 1) {
				speed++;
				System.out.println("현재 속도 : " + speed);
			} else if(num == 2) {
				speed--;
				System.out.println("현재 속도 : " + speed);
			} else if(num == 3) {
				run = false;
			}
		}
		System.out.println("--중지--");
	}

}
