package day05;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class SwingTest extends JFrame { // 윈도우 창
	
	JButton okBtn; // 참조형 변수
	
	
	// 생성자
	public SwingTest() {
		super("첫 번째 swing 연습"); // 타이틀 설정 방법1
//		setTitle("타이틀..."); // 타이틀 설정 방법2
		
		
		// 생성자에서 참조형 변수 초기화
		okBtn = new JButton("OK");
		
		MyListener my = new MyListener();
		okBtn.addActionListener(my); 
		
		add(okBtn);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE); // ui 창 닫기
		setSize(500,400);
		
		
		setVisible(true);
	}
	
	
	
	
	
	// 내부 클래스

	// 내부 클래스(inner Class) 로 많이 사용함 (클래스 안에 생성)
	class MyListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {  // ActionListener 인터페이스 안에 구현된 메소드
			
			String result = e.getActionCommand();
			
			if(result.equals("OK")) {
				System.out.println("OK 버튼이 출력됨");
			}
			
			
			// 자동으로 호출되는함수 = 콜백함수
		
			
			
		}
	}
	
	

	public static void main(String[] args) {
		new SwingTest(); 
		// 익명
		// 따로 시켜야 할 일이 없을 때 굳이 참조 변수가 없어도 됨
		
		// 참조 변수
		// 참조 변수를 받고 일을 시켜야 할 때

	}

}
