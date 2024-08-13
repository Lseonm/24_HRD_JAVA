package day06;

public class SmartTV extends Product{
	
	String resolution;
	
	
	public SmartTV(String pname, int price, String resolution) {
		super.pname = pname; // super(pname, price) 는 추상 클래스라 안됨
		super.price = price; // 따라서 각각 따로 접근해야함
		
		this.resolution = resolution;
	}
	
	
	@Override
	public void printExtra() {
		System.out.print("해상도 : " + resolution);
	}

}
