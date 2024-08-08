package day03;

import java.util.Calendar;

public class EnumEx {

	public static void main(String[] args) {
		
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		
		int week = cal.get(Calendar.DAY_OF_WEEK); // 오늘이 무슨 요일인지 숫자로 알려줌
		System.out.println("week : " + week);
		
		switch(week) {
		case 1 :
			today = Week.SUNDAY;
			System.out.println(today);
			break;
			
		case 2 :
			today = Week.MONDAY;
			System.out.println(today);
			break;
			
		case 3 : 
			today = Week.TUESDAY;
			System.out.println(today);
			break;
			
		case 4 :
			today = Week.WENDESDAY;
			System.out.println(today);
			break;
			
		case 5 :
			today = Week.THURSDAY;
			System.out.println(today);
			break;
			
		case 6 :
			today = Week.FRIDAY;
			System.out.println(today);
			break;
			
		case 7 :
			today = Week.SATURDAY;
			System.out.println(today);
			break;
			
		default :
				
			
		}
		
		if (today == Week.FRIDAY) {
			System.out.println("올림픽 시청하기");
		} else {
			System.out.println("자바 공부하기");
		}
		
	}

}
