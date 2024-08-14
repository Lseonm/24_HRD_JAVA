package day07;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
import java.util.Scanner;

public class ConsoleChatClient {
	
	static Socket socket;
	

	public static void main(String[] args) {

		try {
			socket = new Socket("localhost", 50001);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
