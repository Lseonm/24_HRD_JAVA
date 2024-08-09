package day04;

import java.util.ArrayList;

class Novice {

	// 초심자 클래스
	
	// 필드 선언
	String name;
	int hp;
	
	
	// 메소드
	public void punch() {
		System.out.printf("%s(HP : %d)의 펀치!\n", name, hp);
	}
}




class Wizard extends Novice {

	// 마법사 클래스
	
	// 필드 선언
	public int mp;
	
	
	
	// 메소드
	public void fireball() {
		System.out.printf("%s(MP : %d)의 불 공격!\n", name, mp);
	}
	
	
}


class Knight extends Novice {
	// 기사 클래스
	
	// 필드 선언
	int stamina;
	
	// 메소드
	public void slash() {
		System.out.printf("%s(MP : %d)의 베기 공격\n", name, stamina);
	}
}




public class GameTest {

	public static void main(String[] args) {
		
		Novice novice = new Novice();
		novice.name = "노비스";
		novice.hp = 50;
		
		
		
		Wizard wizard = new Wizard();
		wizard.name = "위자드";
		wizard.hp = 100;
		wizard.mp = 80;
		
		
		Knight knight = new Knight();
		knight.name = "나이트";
		knight.hp = 150;
		knight.stamina = 100;
		
		
		wizard.fireball();
		knight.slash();
		
		wizard.punch();
		knight.punch();
		
		System.out.println();
		

		// 부모의 타입으로 모을 수 있음
		///////////////////////////////////////////////////////////
		ArrayList<Novice> gameList = new ArrayList<Novice>();
		///////////////////////////////////////////////////////////
		
		gameList.add(novice);
		gameList.add(wizard);
		gameList.add(knight);
		
		for(Novice n : gameList) {
			if(n instanceof Wizard) {
				((Wizard) n).fireball();
			} else if(n instanceof Knight) {
				((Knight) n).slash();
			}
		}
			
			// 리스트에서 다 모아둔 후 꺼내는 방법
//			instanceof 클래스명 : 자식의 클래스를 확인하며 꺼내는 함수
		
		
	}

}
