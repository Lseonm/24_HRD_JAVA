package day01;

public class VarTest3 {

	public static void main(String[] args) {
		// 숫자 연산
		int result = 10 + 2 + 8;
		System.out.println("result1 : " + result); // 20
		
		// 결합 연산
		int result2 = 10 + 2 + Integer.parseInt("8"); 
		System.out.println("result2 : " + result2); // 128  --> 20s
		
		String result3 = 10 + "2" + 8;
		System.out.println("result3 : " + result3); // 1028
		
		String result4 = "10" + 2 + 8;
		System.out.println("result4 : " + result4); // 1028
		
		String result5 = "10" + (2 + 8);
		System.out.println("result5 : " + result5); // 1010

		
		
	}

}
