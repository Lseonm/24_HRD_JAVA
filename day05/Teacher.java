package day05;

public class Teacher extends Person{
	
	private int id;
	private String subject;
	
	
	
	
	
	public Teacher() {
		
	}
	
	public Teacher(int id, String subject, String name, int age) {
		super(name, age); // super는 무조건 생성자는 첫 줄에 나와야 함
		this.id = id;
		this.subject = subject;
	}
	
	
	
	
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	
	
	
	

	public String personInfo() {
		String info = super.personInfo(); // 부모 메소드 호출
		info += "\n교사 번호 : " + id + "\n담당 과목 : " + subject; // 부모메소드 재정의
		return info;
	}
	
	public void printAll() {
		System.out.println(this.personInfo());
	}

}
