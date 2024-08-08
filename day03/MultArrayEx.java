package day03;

public class MultArrayEx {

	public static void main(String[] args) {
		
		// 2차원 배열
		int [][] score = new int[2][3];
		
		score[0][0] = 90;
		score[0][1] = 50;
		score[0][2] = 80;
		
		score[1][0] = 100;
		score[1][1] = 70;
		score[1][2] = 90;
		
		int sum = 0;
		int avg = 0;
		int count = 0;
		
		for(int i=0; i < score.length; i++) {
			count += score[i].length;
			
			for(int j=0; j < score[i].length; j++) {
				System.out.println("score[" + i + "]" + "[" + j + "] : " + score[i][j]);
	
				sum += score[i][j];
				avg = sum / count;
			}
		}
		
		System.out.println();
		System.out.println("score의 합계 : " + sum);
		System.out.println("avg : " + avg);
		
	}

}
