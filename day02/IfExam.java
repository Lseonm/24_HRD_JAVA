package day02;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int score = 0;
		
		System.out.println("점수를 입력해주세요 : ");
		score = scan.nextInt();
		
		if(score >= 90) {
			System.out.println("학점 : A");
		} else if(score >= 80) {
			System.out.println("학점 : B");
		} else if(score >= 70) {
			System.out.println("학점 : C");
		} else if(score >= 60) {
			System.out.println("학점 : D");
		} else {
			System.out.println("학점 : F");
		}
		
		}
		
	}
