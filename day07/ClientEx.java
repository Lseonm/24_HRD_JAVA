package day07;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

public class ClientEx {

	// 클라이언트는 소켓만 있으면 됨

	
	static DataInputStream dis = null;
	
	static DataOutputStream dos = null;
	
	static Socket socket;
	
	
	
	/*
	 * public ClientEx() throws IOException { socket = new Socket("localhost",
	 * 5555); // localhost(자신의 IP주소), 포트 번호 알아야 함
	 * 
	 * System.out.println("서버와 연결 성공");
	 * 
	 * dis = new DataInputStream(socket.getInputStream());
	 * 
	 * String message = dis.readUTF(); System.out.print("서버가 보낸 메시지 > " + message);
	 * 
	 * System.out.println();
	 * 
	 * socket.close(); System.out.println("서버와 연결 종료"); }
	 */
	
	
	
	
	public static void main(String[] args) throws IOException {
		
		try {
			
			// Socket 생성과 동시에 localhost의 50001 포트로 연결 요청
			socket = new Socket("localhost", 50001);
			
			System.out.println("[클라이언트] 연결 성공");
			
			
			// 데이터 보내기
			String sendMessage = "나는 자바가 좋아..";
			
			dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF(sendMessage);
			dos.flush();
			System.out.println("[클라이언트] 데이터 보냄 : " + sendMessage);
			
			
			// 데이터 받기
			dis = new DataInputStream(socket.getInputStream());
			String receiveMessage = dis.readUTF();
			System.out.println("[클라이언트] 데이터 받음 :" + receiveMessage);
			
			
			// 연결 끊기
			socket.close();
			System.out.println("[클라이언트] 연결 끊음");
			
		} catch (IOException e) {
			
		}
		
		
//		new ClientEx();
	}

}
