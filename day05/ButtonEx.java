package day05;

import java.awt.*;


class Button {
	
	public static interface ClickListener { // 중첩 인터페이스
		void onClick();
	}
	
	
	
	// 필드
	private ClickListener cListener;
	
	
	// 메소드
	public void setClickListener(ClickListener cListener) {
		this.cListener = cListener;
	}
	
	public void onClick() {
		this.cListener.onClick();
	}
	
	
	
}








public class ButtonEx {

	public static void main(String[] args) {
		
		// awt : abstract window tools
		
		Button okBtn = new Button();
		
		// 끝에 Listener가 붙으면 : 이벤트 처리 인터페이스 (추상 메소드) -> 오버라이드
		
		
		
		
		// 지역 클래스
		class OkListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("OK 버튼 클릭");
				
			}
		}
		
		okBtn.setClickListener(new OkListener());
		
		okBtn.onClick();
	
		
	}

}
