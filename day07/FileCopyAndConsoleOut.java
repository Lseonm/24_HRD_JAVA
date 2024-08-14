package day07;

import java.io.*;

public class FileCopyAndConsoleOut {

	public static void main(String[] args) {

		// 파일 복사 기능 구현

		// 데이터 소스 : 파일
		// 데이터 목적지 : 파일, 콘솔

		// FileReader, FileWriter, BufferedReader, BufferedWriter 사용

		try {

			String fileName = "cpy.txt"; // 복사할 새 파일

			FileReader fr = new FileReader("src\\day07\\FileOut.java"); // 기존 FileOut 자바 파일을 읽음
			BufferedReader br = new BufferedReader(fr); // fr을 br에 담았으니 br로 실행함. 효율성 올라감

			FileWriter fw = new FileWriter(fileName); // fileName 변수에 담음
			BufferedWriter bw = new BufferedWriter(fw); // bw로 실행

			OutputStreamWriter osw = new OutputStreamWriter(System.out); // FileOut.java 콘솔 출력

			int n = 0;

			while ((n = br.read()) != -1) {

				bw.write(n);
				bw.flush();

				osw.write(n);
				osw.flush();

			}

			br.close();
			bw.close();

		} catch (Exception e) {

		}

	}

}
