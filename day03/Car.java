package day03;

public class Car {
	
	// 자동차 객체 모델링
	
	// 필드
	String company;
	String model;
	String color;
	int maxSpeed;
	
	
	int rpm;
	int speed;
	
	
	// 기본 생성자
	public Car() {
		
	}
	// 생성자 오버로딩
	public Car(String company, String model, String color, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public Car(String company, String model, String color) {
		this(company,model,color,250);  // 위의 자신의 생성자 호출
	}
	
	
	// 메소드
	void carInfo() {
		System.out.println("=======================");
		System.out.println("차량 제조 회사 : " + company);
		System.out.println("차량 모델 : " + model);
		System.out.println("차량 색상 : " + color);
		System.out.println("차량 최고 속도 : " + maxSpeed);
		System.out.println("=======================");
	}

}
