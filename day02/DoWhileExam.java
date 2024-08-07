package day02;

import java.util.Scanner;
import java.util.Random;

public class DoWhileExam {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String ms = "";
		
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		do {
			System.out.print("-> ");
			ms = scan.nextLine();
			System.out.println(ms);
		} while(! ms.equals("q"));
		
		System.out.println();
		System.out.println("종료");
		
		
		System.out.println();
		
		
		for (int i =1; i <= 10; i++) {
		if(i % 2 != 0)
			continue;

		System.out.println(i);
		}
		
	}
}
