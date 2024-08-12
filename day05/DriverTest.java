package day05;

interface Vehicle {
	// 추상메소드
	public void run();
}


class Bus implements Vehicle {
	public void run() {
		System.out.println("버스가 달린다.");
	}
}

class Taxi implements Vehicle {
	public void run() {
		System.out.println("택시가 달린다.");
	}
}


class Driver {
	
	// 다형성 구현
	public void drive(Vehicle v) {
		System.out.println("운전자...");
		v.run();
	}
}






public class DriverTest {

	public static void main(String[] args) {
		Driver driver = new Driver();
	
		// 실행 방법 1
		Bus bus = new Bus(); 
		driver.drive(bus);
		
		// 실행 방법 2
		driver.drive(new Taxi());
		
		
		

	}

}
