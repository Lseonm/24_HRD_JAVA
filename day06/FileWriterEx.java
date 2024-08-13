package day06;

import java.io.*;

public class FileWriterEx {

	// FileWriter -> 데이터 쓰기(2바이트씩)  FileReader -> 파일 읽기(2바이트씩)
	
	static FileWriter fw = null; 
	
	static BufferedInputStream bis = null;


	public static void main(String[] args) {
		
		
		try {
		
			// 1. 키보드로 부터 문자 데이터를 입력받음 (input) -> 콘솔 출력하고 파일로도 출력하기
			InputStream is = System.in;
			bis = new BufferedInputStream(is);
			
			BufferedOutputStream bos = new BufferedOutputStream(System.out);

			int data = 0;
			while((data = bis.read()) != -1) {
				bos.write(data);
				bos.flush();
			}
			
			
//		fw = new FileWriter("file.txt");
		
//		fw.write("JAVA");
		
		} catch(IOException e) {
			System.out.println(e.getMessage());
		} finally {
			
			try {
				fw.close();
				bis.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
