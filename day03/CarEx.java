package day03;

public class CarEx {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.company = "현대";
		myCar.model = "제네시스";
		myCar.color = "검정";
		myCar.maxSpeed = 250;
		
		myCar.carInfo(); // 메소드 호출
		
	
		// 인자 생성자
		Car myCar2 = new Car("기아", "스팅어", "빨강", 300);
		myCar2.carInfo();

	}
}
