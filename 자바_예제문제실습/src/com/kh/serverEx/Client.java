package com.kh.serverEx;

import java.io.*;
import java.net.*;

public class Client {
	public static void main(String[] args) {
		int port = 3000;
		String 서버Ip;
		
		try {
			서버Ip = InetAddress.getLocalHost().getHostAddress();
			
			Socket socket = new Socket(서버Ip, port);
			System.out.println("서버에 연결됐습니다.");
			
			//BufferedReader 입력한 글자 가져오고 PrintWriter 출력하기
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			
			//주최자에게 메세지 전송
			out.println("hi serveRRR");
			
			//주최자에게서 온 메세지 수신 후 출력
			String m = in.readLine();
			System.out.println("send success : " + m);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
