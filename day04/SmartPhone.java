package day04;

public class SmartPhone extends Phone {
	
	// 필드 선언
	public boolean wifi;
	
	
	
	// 생성자 선언
	public SmartPhone(String model, String color) {
		super(model, color); // 부모가 인자 생성자를 만들어 놓음.
		}
	
	// 메소드 선언
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}


	// 메소드 오버라이딩
	@Override
	public void bell() {
		super.bell();
		System.out.println("ring ring ring");
	}
	
	

}
