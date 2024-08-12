package day05;

public class Student extends Person {
	
	private int id;
	private String cName;
	
	
	
	
	public Student() {
		
	}
	
	public Student(int id, String cName, String name, int age) {
		super(name, age);
		this.id = id;
		this.cName = cName;
	}
	
	
	
	
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
	public void setcName(String cName) {
		this.cName = cName;
	}
	
	public String getcName() {
		return cName;
	}
 	
	
	
	// 메소드 오버라이딩
	public String personInfo() {
		String info = super.personInfo(); // 부모 메소드 호출
		info += "\n학번 : " + id + "\n학급 : " + cName; // 부모메소드 재정의
		return info;
	}
	
	public void printAll() {
		System.out.println(this.personInfo());
	}
	
	
}
