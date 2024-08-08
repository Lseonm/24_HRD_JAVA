package day03;

import java.util.Scanner;

public class ScoreProgramming {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int students = 0;
		int[] score = null;
		
		int max = 0;
		int sum = 0;
		double avg = 0;

		
		while(true) {
			System.out.println("------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------------");
			
			System.out.print("선택 > ");
			int num = Integer.parseInt(scan.nextLine());
			
			if(num == 1) {
				System.out.print("학생 수 : ");
				students = Integer.parseInt(scan.nextLine());
					score = new int[students];
				
			} else if(num == 2) {
				for(int i =0; i < score.length; i++) {
					System.out.print("score[" + i + "] : ");
					score[i] = Integer.parseInt(scan.nextLine());
				}
				
			} else if(num ==3) {
				for(int i =0; i < score.length; i++) 
					System.out.println("score[" + i + "] : " + score[i]);
				
			} else if(num ==4) {
				max = score[0]; // 가상의 값 최고 점수로 설정
				for(int i=0; i < score.length; i++) {
					if(score[i] > max) {
						max = score[i];
					}
					sum += score[i];
				}
				avg = sum / students;
				
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
				
			}else if(num == 5) {
				System.out.print("프로그램 종료");
					break;
				}
			
		}
		
		
	}

}
