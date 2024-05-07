package com.kh.serverEx;

import java.io.*;
import java.net.*;

public class Server {
	public static void main(String[] args) {
		int port = 3000;
		
		ServerSocket server;
		
		try {
			server = new ServerSocket(port);
			
			while (true) {
				Socket client = server.accept();
				System.out.println("클라이언트가 접속했습니다.");
				
				//BufferedReader - 글자를 실시간으로 읽어오기
				BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()))
				//PrintWriter - 읽어온 글자 출력하기
				PrintWriter out = new PrintWriter(client.getOutputStream(), true);
				
				//참가자한테 받은 메시지 수신하기
				String m;
				while ((m = in.readLine()) != null) {
						/*가져온 글자를 읽었는데 글자가 비어있지 않을 때 true로 설정*/
					System.out.println("send success : " + m);
					out.println(" c h e c k");
					
					//클라이언트가 전달한 메세지 보여주고 종료
				}
				client.close();
				server.close();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
