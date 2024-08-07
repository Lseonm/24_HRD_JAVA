package day02;

public class ForExam1 {

	public static void main(String[] args) {
		// for(초기식; 조건식; 증감식) { 수행할 반복 명령문 }
		
		for (int i = 1; i <= 9; i++) {
			System.out.println("------ " + i + "단 ------");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + i * j);
			}
		}
		
	
		
		
	}

}
