package day04;

public class GetterSetter {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.tire = new Tire();
		car.run();
		
		
		car.tire = new HankookTire();
		car.run();
		
		car.tire = new KumhoTire();
		car.run();
		
		
		car.setSpeed(250);
		car.setStop(false);
		
		System.out.println(car.getSpeed());
		System.out.println(car.getStop());
		
		
		
	}

}





class Car {
	// 캡슐화 (정보은닉) -> 멤버 10개면 setter,getter 메소드 총 20개 필요
	private int speed;
	private boolean stop;
	
	// 타이어 부품화
	Tire tire;
	
	
	// 타이어 메소드
	public void run() {
		tire.roll();
	}
	
	
	// setter 메소드 정의 
	// (필드값 변경) -> 매개변수 필수 -> 반환값 X
	// set으로 시작하는 메소드는 반환값이 필요 없음 *
	
	public void setSpeed(int speed) { // 공개(public)로 해놔야 함
		this.speed = speed; // 이름이 멤버 변수와 다르면 this 생략
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}

	
	// getter 메소드 정의
	// 설정한 멤버 변수값 확인
	// 매개변수 X, 반환타입 O
	
	public int getSpeed() {
		return speed;
	}
	public boolean getStop() {
		return stop;
	}
	
}