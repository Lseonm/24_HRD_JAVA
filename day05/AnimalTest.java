package day05;

abstract class Animal {
	// 추상 클래스 : 적어도 한 개 이상의 추상 메소드를 갖는 클래스
	
	// 추상 메소드 : 중괄호(바디) {} 가 없는 메소드
	
	abstract void sound(); // 추상 메소드 선언
}


/*
 * class Dog extends Animal {
 * 
 * @Override void sound() { System.out.println("멍멍 소리낸다");
 * 
 * }
 * 
 * }
 */


/*
 * class Cat extends Animal {
 * 
 * @Override void sound() { System.out.println("냐옹 소리낸다");
 * 
 * } }
 */


interface Soundable {
	public String sound();
}


class Cat implements Soundable {

	@Override
	public String sound() {
		return "냐옹";
	}
	
	
}

class Dog implements Soundable{
	@Override
	public String sound() {
		return "멍멍";
	}
}



public class AnimalTest {
	
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}

	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
		
		/*
		 * Animal animal = new Dog(); // 추상 클래스는 무조건 자식 타입으로 객체 생성 animal.sound();
		 * 
		 * Animal animal2 = new Cat(); animal2.sound();
		 */
	}

}
