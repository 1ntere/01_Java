package com.kh.serverEx;

import java.io.*;
import java.net.*;

public class Client {
	public static void main(String[] args) {
		int port = 3000;
		String ����Ip;
		
		try {
			����Ip = InetAddress.getLocalHost().getHostAddress();
			
			Socket socket = new Socket(����Ip, port);
			System.out.println("������ ����ƽ��ϴ�.");
			
			//BufferedReader �Է��� ���� �������� PrintWriter ����ϱ�
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			
			//�����ڿ��� �޼��� ����
			out.println("hi serveRRR");
			
			//�����ڿ��Լ� �� �޼��� ���� �� ���
			String m = in.readLine();
			System.out.println("send success : " + m);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
