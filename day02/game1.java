package day02;

import java.util.Random;
import java.util.Scanner;

public class game1 {
	public static void main(String[] args) {
		
		// 참조형 변수로 객체 생성
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
	while(true) {
		System.out.println("1. 가위 | 2. 바위 | 3. 보 | 0. 종료");
		System.out.print("번호 입력 : ");
		int MY = scan.nextInt();
		
		System.out.println();
		if(MY == 0) {
			System.out.print("게임 종료");
			break;
		}
		int PC = rand.nextInt(3) + 1;
		System.out.println("나 : " + MY + "\t컴퓨터 : " + PC);
		
		
		if(MY == PC)
			System.out.println("동점");
		
		/* 내가 짠 코드
		if((MY == 1) && (PC == 2)) {
				System.out.println("MY 패배 | PC 승리");
			}else if((MY == 1) && (PC == 3)) {
					System.out.println("MY 승리 | PC 패배");
				}
		
		if((MY == 2) && (PC == 1)) {
				System.out.println("MY 승리 | PC 패배");
			}else if((MY == 2) && (PC == 3)) {
					System.out.println("MY 패배 | PC 승리");
				}
		
		if((MY == 3) && (PC == 1)) {
				System.out.println("MY 패배 | PC 승리");
			}else if((MY == 3) && (PC == 2)) {
					System.out.println("MY 승리 | PC 패배");
				} 
				*/
		
		
		// 교수님이 보여주신 코드
		if((MY==1) && (PC==3) || (MY==2) && (PC==1) || (MY==3) && (PC==2))
			System.out.println("MY 승리 | PC 패배");
		else {
			System.out.println("MY 패배 | PC 승리");
		}
		
		System.out.println("\n");
			}
	}
}
