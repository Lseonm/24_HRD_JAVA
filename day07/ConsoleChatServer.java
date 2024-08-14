package day07;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
import java.util.Scanner;

public class ConsoleChatServer implements Runnable {

	// ServerSocket 객체 선언
	private static ServerSocket ser = null;
	
	static Scanner sc = new Scanner(System.in);
	
	static Socket socket;
	
	
	
	
	
	public ConsoleChatServer() throws IOException {
		
		ser = new ServerSocket(50001);
		System.out.println("[서버] 시작됨");
		
		// 연결 수락
		Socket socket = ser.accept();
		System.out.println("클라이언트 접속 성공");
		
		// 클라이언트에게 전송할 메시지 입력 객체
		BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
		
		
		PrintWriter pout = new PrintWriter(socket.getOutputStream(), true);
		
		// 클라이언트에게 키보드로 메시지 전송 -------
		Thread tr = new Thread(this);
		tr.start();
		String msg = "";
		
		while((msg = key.readLine()) != null) {
			System.out.println(msg);
		}
		
		
	}
	
	
	

	
	
	public static void main(String[] args) throws IOException {
		
		new ConsoleChatServer();
		
		
	}

	
	@Override
	public void run() {
		
		// 클라이언트가 보내는 메시지를 계속 받아서 서버 콘솔에 출력
		
		try {
			InputStream is = socket.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			String clientMsg = "";
			
			while(true) {
				clientMsg = br.readLine(); // 한줄씩 읽기 편하니까 Buffered를 써주는 것을 습관화 해야함
				System.out.println("From Client > " + clientMsg);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("예외 : " + e.getMessage());
		}
		
	}

}
