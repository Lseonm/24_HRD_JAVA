package day06;

import java.io.*;

public class ReadEx {
	
	

	public static void main(String[] args) throws IOException {
		
		try {
			Reader reader = new FileReader("file.txt");
			
			while(true) {
				
				int data = reader.read(); // read() 의 반한타입은 int형임.
		
				if(data == -1) 
					break;
				
				System.out.println((char)data);
				
			}
			
			reader.close();
			System.out.println();
			
			
			reader = new FileReader("Test.txt");
			
			char[] data = new char[100];
			
		while(true) {
					
					int num = reader.read(); // read() 의 반한타입은 int형임.
			
					if(num == -1) 
						break;
					
					for(int i = 0; i < num; i++) {
						System.out.println(data[i]);
					}
					reader.close();
					System.out.println();
				}	
			
		} catch(FileNotFoundException e) {
			System.out.println("파일 존재이 존재하지 않습니다.");
			
		} finally {
			
		}
		
		
	}

}
