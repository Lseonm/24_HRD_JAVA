package day04;

import java.util.ArrayList;

public class Main {
	
	// 클래스 구성 멤버
			// 필드 (속성) : 객체 외 데이터를 저장하는 역할 (멤버 변수)
			
			// 생성자 
			// 기본 생성자(직접 안 만들어도 컴파일러가 자동으로 만들어줌)
			// 인자 생성자(매개변수) => 인자 생성자를 만들려면 기본 생성자도 같이 만들어야 함.
			
			// 메소드 : 동작
	public static void main(String[] args) {

		House house1 = new House("이선민", 4, "대전 동구");
		
		// house1.showOwner(house1.ownerName);
		
		// System.out.println("방의 갯수 : " + house1.getRoomNum());
		
		// System.out.println("집의 정보 : \n" + house1.showInfo2());
		
		
		// ArrayList<> : int 형은 같은 기본 타입은 못담음.-> Integer 사용 
		// (클래스만 담을 수 있음)
		
		ArrayList<House> arrList = new ArrayList<House>();
		arrList.add(house1);
		arrList.add(new House("홍길동", 3, "대전 서구")); // 익명 클래스
		arrList.add(new House("김자바", 5, "대전 중구")); // 익명 클래스
		
		for(House h : arrList) {
			h.showInfo1();
		}
		
	}
	
}


// 클래스 선언 (집 클래스 모델링)
class House { // 같은 곳에 다른 클래스를 만들 땐 public 쓰면 안됨
	
	// 필드
	String ownerName;
	int roomNum;
	String address;
	
	
	
	// 생성자
	// 기본 생성자
	House() {
		
	}
	
	// 인자 생성자
	House(String ownerName, int roomNum, String address) {
		this.ownerName = ownerName;
		this.roomNum = roomNum;
		this.address = address;
	}
	
	
	
	// 메소드
	void showOwner(String onwerName) {
		System.out.println("집 주인 : " + onwerName);
	}
	
	
	int getRoomNum() {
		return roomNum;
	} 
	
	
	
	void showInfo1() {
		System.out.println("집 주인 : " + ownerName + "\n방의 갯수 : " + roomNum + "\n집 주소 : " + address);
		System.out.println();
	}
	
	String showInfo2() {
		String result = "집 주인 이름 : " + ownerName + "\n방의 갯수" + roomNum + "\n집 주소 : " + address;
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}