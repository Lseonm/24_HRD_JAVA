package day07;

import java.io.IOException;
import java.nio.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesEx {

	public static void main(String[] args) {
		
		// Files 클래스
		
		try {
			String data = "id : winter\n" + "email : winter@mycompany.com\n" + "tel : 010-1234-1234";
			
			// Path 객체 생성
			Path path = Paths.get("C:\\temp\\userEx.txt"); // 파일 생성
			
			Files.writeString(Paths.get("C:\\\\temp\\\\userEx.txt"), data, Charset.forName("UTF-8")); // 파일에 쓰기
			
			System.out.println("파일 유형 : " + Files.probeContentType(path));
			System.out.println("파일 크기 : " + Files.size(path) + " bytes");
			
			String content = Files.readString(path, Charset.forName("UTF-8"));
			System.out.println(content);
			
			
		} catch(Exception e) {
			e.getStackTrace();
		}
		
	}

}
