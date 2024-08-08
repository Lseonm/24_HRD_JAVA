package day03;

public class Calculator {
	
	// 멤버 변수 선언
	int a;
	int b;
	static double pi = 3.14159;
	
	
	
	// 기본 생성자 선언
	public Calculator() {
		
	}
	
	
	

	// 사용자 정의 메소드 연습
	
	// 1. 반환타입도 있고, 매개변수도 있는 메소드 정의
	static int add(int a, int b) {
		return  a + b;
	}
	
	// 2. 반환타입은 없고, 매개변수는 있는 메소드 정의
	void minus(int a, int b) {
		System.out.println(a - b);
		// 반환타입이 없으면 print문을 써서 확인해줘야 함
	}
	
	// 3. 반환타입은 있고, 매개변수는 없는 메소드 정의
	int mult() {
		return a * b;
	}



	// 4. 반환타입과 매개변수가 없는 메소드 정의
	void div() {
		System.out.println(a / b);
	}
	
	
	
	
	
	// 5. 정사각형 넓이 구하는 메소드 정의
	double areaRect(double width) {
		return width * width;
	}
	

	// 6. 직사각형 넓이 구하는 메소드 정의
	double areaRect(double width, double height) {
		return width * height;
	}
	
}
