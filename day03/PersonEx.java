package day03;

public class PersonEx {

	public static void main(String[] args) {
		
		// Person 객체 생성
		Person kim = new Person();
		
		kim.age = 24;
		kim.name = "김개똥";
		kim.blood = "B";
	
		System.out.println(kim.age);
		System.out.println(kim.name);
		System.out.println(kim.blood);
		
		kim.smile();
		kim.eat();

	}

}
