package day02;

public class WhileExam1 {

	public static void main(String[] args) {
		
		int i=0, sum = 0;
		
		while (i <= 100) {
			if (i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("0 ~ 100 까지 짝수들의 합 : " + sum);
		
		
		System.out.println();
		
		
		int num = 20;
		
	     /* while (num > 0) {
			System.out.println("num 값 : " + num);
			if(num == 3) {
				System.out.println("num == 3 종료");
			}
			num--;
		} */
		
		boolean flag = true;
		while(flag) {
			System.out.println("num 값 : " + num);
			num--;
			if(num == 3) {
				System.out.println("num == 3");
				break;
			}
		}
		System.out.println("종료");
	}

}
