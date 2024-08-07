package day02;

public class RefType {

	public static void main(String[] args) {
		
		RefType ref = new RefType(); // 클래스 생성
		RefType ref2 = new RefType();
		
		if(ref == ref2) {
			System.out.println("동일한 주소를 갖는 객체");
		}else {
			System.out.println("서로 다른 주소를 갖는 객체");
			
			System.out.println();
			
			String st = new String("참조 타입");
			System.out.println(st);
			
			String st2 = "기본 타입";
			System.out.println(st2);
			
		
		}
		
		
		System.out.println();
		
		
		int[] score = new int[5];
		score[0] = 10;
		score[1] = 20;
		score[2] = 30;
		score[3] = 40;
		score[4] = 50;
		
		
		int result = 0;
		
		for (int i = 0; i < score.length; i++) {
			result += score[i];
		}
		System.out.println("총합 : " + result);
	}
}
