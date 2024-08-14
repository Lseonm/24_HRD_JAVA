package day07;

import java.net.InetAddress;
import java.io.*;

public class InetAddressEx {

	public static void main(String[] args) {

		try {
		InetAddress local = InetAddress.getLocalHost();
		System.out.println(local); // 자신의 IP주소 확인
		
		InetAddress[] locals = InetAddress.getAllByName("www.dju.ac.kr"); // ("도메인 주소")
		
		for(InetAddress in : locals) {
			System.out.println("대전대 IP주소 : " + in.getHostAddress()); // 네이버 IP주소 확인
		}
		
		} catch(Exception e) {
			e.getStackTrace();
		}
	}

}
