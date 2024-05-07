package com.kh.serialEx;

import java.io.*;

//2. Student ��ü�� ����ȭ�ؼ� student.txt ���Ϸ� ����
public class ����ȭ {
	public static void main(String[] args) {
		//����ȭ�� �����͸� ������ ���� ���
		String �����̸� = "student.txt";
		
		//����ȭ�ؼ� ������ ��ü ����
		Student �л� = new Student("�ڸ���",30);
		
		//��ü�� ���Ϸ� ����ȭ�ϴ� �ڵ�
		try {
			FileOutputStream fos = new FileOutputStream(�����̸�);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			//��ü�� ����ȭ�ؼ� ���� �ۼ��ϱ�
			oos.writeObject(�л�);
				//�� �ּ��� ���·� �����
			oos.close();
				//close()�� ���� �ݱ⸦ ����� �����
			System.out.println("��ü�� ����ȭ�ؼ� ������ �����߽��ϴ�.");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/* ===== ���ϴ� ���� ���� �� ===== */
		//���࿡ ������ ���� �ʹٸ�
		try {
			FileInputStream fis = new FileInputStream(�����̸�);
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			
			byte[] buffer = new byte[1024];
			int length;
			while ((length = fis.read(buffer)) != -1) {
				bos.write(buffer, 0, length);
			}
			byte[] bytes = bos.toByteArray();
			System.out.println("����ȭ�� ������ Ȯ���ϱ�");
			for (byte b : bytes) {
				System.out.print(b + " ");//-84 -19 0 5 115 114 0 23 99 111 109 46 107 104 46 115 101 114 105 97 108 69 120 46 83 116 117 100 101 110 116 98 32 57 123 -107 27 125 88 2 0 2 73 0 3 97 103 101 76 0 4 110 97 109 101 116 0 18 76 106 97 118 97 47 108 97 110 103 47 83 116 114 105 110 103 59 120 112 0 0 0 30 116 0 9 -21 -80 -107 -21 -89 -112 -20 -120 -103 
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
