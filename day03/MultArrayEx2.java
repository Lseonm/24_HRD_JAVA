package day03;

public class MultArrayEx2 {

	public static void main(String[] args) {
		
		// 2차원 배열
		
		int [][] scores = {
				{80, 90, 96},
				{76,88}
		};
		
		int count = 0;
		
		for(int i =0; i<scores.length; i++)
		count += scores[i].length;
		System.out.println("count : " +count);
		
		// 배열 길이
		System.out.println("1차원 배열 길이 (행의 수)(가로) : " + scores.length);
		System.out.println("2차원 배열 길이 (1열의 수)(세로) : " + scores[0].length);
		System.out.println("2차원 배열 길이 (2열의 수)(세로) : " + scores[1].length);
		
		// 첫 번째 반의 세 번째 학생의 점수 읽기
		System.out.println("첫 번째 반의 세 번째 학생의 점수 읽기 : " + scores[0][2]);
		
		// 두 번째 반의 두 번째 학생의 점수 읽기
		System.out.println("두 번째 반의 두 번째 학생의 점수 읽기 : "+ scores[1][1]);
		
		
		// 첫 번째 반 평균 점수 구하기
		int class1Sum = 0;
		for(int i =0; i < scores[0].length; i++) {
			class1Sum += scores[0][i];
		}
		
		double class1Avg = (double)class1Sum / scores[0].length;
		System.out.println("첫 번째 반의 평균 점수 : " + class1Avg);
	
		
		// 두 번째 반 평균 점수 구하기
		int class2Sum = 0;
		for(int i =0; i < scores[1].length; i++) {
			class2Sum += scores[1][i];
		}
		
		double class2Avg = (double)class2Sum / scores[1].length;
		System.out.println("두 번째 반의 평균 점수 : " + class2Avg);
	
	
	}

}
