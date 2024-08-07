package day02;

public class ForExam2 {

	public static void main(String[] args) {
		
		// 0 ~ 100 까지 짝수들의 합
		int result = 0;
		
		for (int i = 0; i <= 100; i++) {
			if(i % 2 == 0) {
				result += i;
			}
		}
		System.out.println("0 ~ 100 까지 짝수들의 합 : " + result);
	
		
		
		System.out.println();
	
		
		
		String Result = "";
		int sum = 0;
	
		for(int i=1; i<=10; i++) {
		if(i == 10) {
			
			Result += " = ";
		} else {
			Result += i + " + ";
		}
		sum += i;
		
	}
		System.out.println(Result + sum);
		

		
	}
}
