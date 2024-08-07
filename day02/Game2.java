package day02;

import java.util.Random;
import java.util.Scanner;

public class Game2 {

	public static void main(String[] args) {
		// 369 게임
		// 1~10 중 3,4,9 일 때 박수 소리 출력
		
		for (int i =1; i<=10; i++) {
			
			if(i==3 || i ==6 || i ==9) {
			System.out.println("짝");
			continue;
			}
			
			System.out.println(" " + i);
		}
	}

}
