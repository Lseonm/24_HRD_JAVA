package day06;

public class CellPhone extends Product {
	
	String carrier;
	
	
	
	public CellPhone(String pname, int price, String carrier) {
		super.pname = pname; // super(pname, price) 는 추상 클래스라 안됨
		super.price = price; // 따라서 각각 따로 접근해야함
		
		this.carrier = carrier;
	}
	
	
	
	@Override
	public void printExtra() {
		System.out.print("통신사 : " + carrier);
	}
	
	
	
	
	
}
