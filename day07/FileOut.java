package day07;

import java.io.*;

public class FileOut {

	public static void main(String[] args) {
		
		// 키보드로 입력받고 파일로 출력하기
		// 파일 이름 : result.txt
		
		// FileOutputStream fos = new FileOutputStream("result.txt", true) 
		// true는 생성해서 저장한 파일에 계속 덧붙이기가 가능하게 함 (append 기능)
		

		System.out.println("저장할 내용을 입력하세요=> ");
		int n = 0;
		
		try {
						
			FileOutputStream fos = new FileOutputStream("result.txt", true);
			
			BufferedOutputStream bos = new BufferedOutputStream(fos); // 버퍼스트림 사용
			
			FileReader fr = new FileReader("test.txt");
			
			OutputStreamWriter osw = new OutputStreamWriter(System.out); // 브릿지 스트림 (매개변수 중요)
			
			
		while((n = fr.read())!= -1) { // Ctrl + c 나 Ctrl + d를 누르면 -1을 반환하니까 그 전까지 무한반복
			
			osw.write(n);
			osw.flush();
			
			}
		
		fos.close();
		bos.close();
		
		} catch(FileNotFoundException e) {
			
			
		} catch(IOException e) {
			e.getStackTrace();
		}
		
		
	}

}
