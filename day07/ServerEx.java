package day07;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
import java.util.Scanner;

public class ServerEx {

	// ServerSocket 객체 선언
	private static ServerSocket ser = null;
	
	static Socket socket = null; // 클라이언트와 접속 후 통신하는 객체
	
	static DataInputStream dis = null;
	
	static DataOutputStream dos = null;
	
	static Scanner sc = new Scanner(System.in);

	// startServer 메소드
	public static void startServer() throws IOException {
		
		
		// 작업 스레드 정의
		Thread thread = new Thread() {
			public void run() {
				try {
					// ServerSocket 생성 및 Port 바인딩
					ser = new ServerSocket(50001);
					System.out.println("[서버] 시작됨");
					
					while(true) {
						System.out.println("\n[서버] 연결 요청을 기다림\n");
						
						// 연결 수락
						Socket socket = ser.accept();
						
						
						// 연결된 클라이언트 정보 얻기
						InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
						System.out.println("[서버] " + isa.getHostName() + "의 연결 요청을 수락함");
						
						
						
						// 데이터 받기
						dis = new DataInputStream(socket.getInputStream());
						
						String message = dis.readUTF();
						
						
						
						// 데이터 보내기
						dos = new DataOutputStream(socket.getOutputStream());
						
						dos.writeUTF(message);
						dos.flush();
						System.out.println("[서버] 받은 데이터를 다시 보냄 : " + message);
						
						
						// 연결 끊기
						socket.close();
						System.out.println("[서버] " + isa.getHostName() + "의 연결을 끊음");
						
					}
					
				} catch (IOException e) {
					System.out.println("[서버] " + e.getMessage());
				}
			}
		};
		// 스레드 시작
		thread.start();
	}
		
	
	public static void stopServer() {
		try {
			
			// ServerSocket을 닫고 Port 언바인딩
			ser.close();
			System.out.println("[서버] 종료됨");
			
		} catch (IOException e) {
		
	}
}
		
		
		
		
		
	/*
	 * System.out.println("클라이언트의 접속을 기다리는 중"); ser = new ServerSocket(5555); socket
	 * = ser.accept(); // accept하면 소켓을 반환함
	 * 
	 * System.out.println("클라이언트와의 접속 성공!");
	 * 
	 * dos = new DataOutputStream(socket.getOutputStream()); //
	 * socket.getOutputStream() 중요** 소켓을 매개변수로 받음
	 * 
	 * 
	 * System.out.print("클라이언트로 보낼 메시지 > "); String message = sc.next();
	 * dos.writeUTF(message); // 보조 스트림이라 writeUTF 로 사용 (문자열이니까) dos.flush(); }
	 */
	
	
	public static void main(String[] args) throws IOException {
		
		
		System.out.println("-------------------------------------------");
		System.out.println("서버를 종료하려면 q를 입력하고 Enter를 입력하세요.");
		System.out.println("-------------------------------------------");
		
		// TCP 서버 시작
		startServer();
		
		while(true) {
			String key = sc.nextLine();
			if(key.toLowerCase().equals('q'))
				break;
		}
		sc.close();
		
		// TCP 종료
		stopServer();
		
		
		
		/*
		 * // startServer메소드가 정적 메소드가 아니면 ServerEx 객체를 생성해서 실행해야함. startServer();
		 */
	}

}
