package day05;

public class Staff extends Person {

	private int id;
	private String dept;
	
	
	
	
	
	
	public Staff() {
		
	}
	
	public Staff(int id, String dept, String name, int age) {
		super(name, age); // 부모가 가지고 있으니 부모보고 호출하라고 보냄
		this.id = id;
		this.dept = dept;
	}
	
	
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	


	public String personInfo() {
		String info = super.personInfo(); // 부모 메소드 호출
		info += "\n사원 번호 : " + id + "\n부서 : " + dept; // 부모메소드 재정의
		return info;
	}
	
	public void printAll() {
		System.out.println(this.personInfo());
	}
	
	
	
}
