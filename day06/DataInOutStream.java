package day06;

import java.io.*;

public class DataInOutStream {
	// DataOutputSteam : 보조 스트림
	// 자바의 다양한 자료형들을 바이트 단위로 분해하여 쓰기 작업
	// DataInputStream과 짝을 이뤄 사용
	
	static DataOutputStream dos = null;
	static DataInputStream dis = null;
	
	

	public static void main(String[] args) {
		
		try {
			
			// 콘솔엔 찍히는데 txt 파일에는 깨짐
		
			// 데이터 넣기 
			dos = new DataOutputStream(new FileOutputStream("file.txt"));
			dos.writeInt(100);
			dos.writeDouble(155.2);
			dos.writeBoolean(true);
			dos.writeChar('가');
			dos.writeUTF("문자열 입력");
			
			
			dis = new DataInputStream(new FileInputStream("file.txt"));
			System.out.println("정수 값 : " + dis.readInt());
			System.out.println("실수 값 : " + dis.readDouble());
			System.out.println("논리 값 : " + dis.readBoolean());
			System.out.println("문자 값 : " + dis.readChar());
			System.out.println("문자열 값 : " + dis.readUTF());
			
			
			
			
			dis.close();
			dos.close();
			
		} catch(Exception e) {
			System.out.println("\n오류 : " + e);
		} finally {
			
		}
		
	}

}
