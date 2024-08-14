package day07;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {

	public static void main(String[] args) {
		
		// 데이터 소스 : 키보드
		// 데이터 목적지 : 모니터
		// read() 사용
		// Ctrl + d , Ctrl + c  --> -1 리턴.
		
		try {
		
			int r = 0; // 읽을 지역변수 read
			int count = 0; // 갯수
			
			while(true) {
				r = System.in.read();				
				count++;
				
				if(r == 'x' || r == 'X') {
					break;
				}				
				System.out.println("r = " + r);
			}
			
			// Ctrl + c, Ctrl + d 를 입력해서 종료
			
			System.out.println("================");
			System.out.println(count + " bytes 읽음");
			System.out.println("================");
			System.in.close();
			
		} catch(Exception e) {
			e.getMessage();
		
		}
		finally {
			
		}
	}

}
