package day05;

public class Person {

	// 멤버변수
	private String name;
	private int age;
	
	
	
	
	
	// 기본 생성자
	public Person() {
		
	}
	
	// 인자 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
	
	// 정보 은닉;
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	

	
	
	// 메소드
	static void inputPerson() {
		System.out.println("=====================");
		System.out.println("이름 입력 : ");
		System.out.println("나이 입력 : ");
		System.out.println("=====================");
	}
	
	
	public String personInfo() {
		String info = "이름 : " + name + "\n나이 : " + age;
		return info;
	}
	
	public void printAll() {
		System.out.println(this.personInfo());
	}
	
	
}
