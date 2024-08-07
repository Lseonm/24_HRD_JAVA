package day02;

import java.util.Random;

public class RandomExam {
	
	public static void main(String[] args) {
	
	// 임의의 수를 생성하고 수를 다루는 내장 객체 -> Random
	
	// 참조형 변수로 객체 생성
	Random rand = new Random();
	
	// 1~45번까지 수 생성
	for(int i = 1; i <= 6; i++) {
	int num = rand.nextInt(45) + 1;
	System.out.println(num);
	}

	}
}
