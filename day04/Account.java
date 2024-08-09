package day04;

public class Account {
	
	// 상수 필드 정의
		static final int MIN_BALANCE = 0;
		static final int MAX_BALANCE = 1000000;
		
	
	
	// 필드 은닉화
	private int balance;
	private String accNum;
	private	String accOwner;
	
	
	
	// getter, setter 메소드 정의
	
	public Account(String accNum, String accOwner, int balance) {
		this.accNum = accNum;
		this.accOwner = accOwner;
		this.balance = balance;
	}
	
	
	
	
	public String getAccNum() {
		return accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}


	
	
	
	public String getAccOwner() {
		return accOwner;
	}

	public void setAccOwner(String accOwner) {
		this.accOwner = accOwner;
	}

	
	
	public int getBalance() {
		return balance;
	}
	
	
	public void setBalance(int balance) {
		if(balance < Account.MIN_BALANCE || balance > Account.MAX_BALANCE) {
			System.out.println("0 ~ 100만원 사이를 입력해주세요.");
			return; // 마침
		}
		
		this.balance = balance;
	}
	
	
	
	
	
	
	
	
}
