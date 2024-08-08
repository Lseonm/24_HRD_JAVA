package day03;

public class ArrayEx {

	public static void main(String[] args) {
		
		// 자바 교재 p.170 예제
		// 배열 선언 및 초기화
		String[] season = {"Srping", "Summer", "Fall", "Winter"};
		
		// 배열의 항목값 읽기
		// System.out.println("season[0] : " + season[0]);
		// System.out.println("season[1] : " + season[1]);
		// System.out.println("season[2] : " + season[2]);
		// System.out.println("season[3] : " + season[3]);

		for(int i =0; i < season.length; i++)
			System.out.println("season[" + i + "] : " + season[i]);
		
		System.out.println();
		
		// 인덱스 1번 항목의 값 변경
		season[1] = "여름";
		System.out.println("season[1] : " + season[1]);
		
		
		// 이름 문자열 3개를 저장할 배열 선언 및 초기화
		String[] names = null;
		names = new String[] {"홍길동", "장난감", "김자바"};
		
		
	}

}
