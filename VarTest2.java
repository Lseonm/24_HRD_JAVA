package day01;

public class VarTest2 {

	public static void main(String[] args) {
		// 정수형 변수 2개 선언하기. i,j
		int i, j;
		i = 10;
		j = 20;
		
		// 문자열 변수 1개 선언하기. var1
		String var1 = "홍길동";
		
		
		// 문자형 변수 1개 선언하기. var2
		String var2 = "A";
		
		
		// 정수형 변수 1개와 문자열 변수 연결해서 출력하기.
		System.out.println(i + var2);
	
		// 문자열 변수 출력하기.
		System.out.println(var1);
		
		
		// 강제 형 변환
		double k = 3.141592;
		
		System.out.println("j : " + j);
		j = j + (int)k;
		System.out.println("j : " + j + "\t k : " + k);
		
	}

}
