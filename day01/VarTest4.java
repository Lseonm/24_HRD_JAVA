package day01;

import java.util.Scanner;

public class VarTest4 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("연도 입력 : ");
	        int year = sc.nextInt();
	        
	        System.out.println("나이 형태 입력 : ");
	        String age_type = sc.next();
	        
	        int answer = 0;
	        
	        if(age_type.equals("Korea")) {
	        	answer = 2030 - year + 1;
	        } else if(age_type.equals("Year")) {
	        	answer = 2030 - year;
	        }
	        
	        System.out.println(answer);

	
	 }
}