package com.kh.serialEx;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

//3. Student ��ü�� ����ȭ�ؼ� ���Ϸ� ������ student.txt�� �ҷ��ͼ� ������ȭ�ؼ� Student ��ü�� �ҷ�����
public class ������ȭ {
	public static void main(String[] args) {
		//����ȭ�� ���� �ҷ�����
		String �����̸� = "student.txt";//-84 -19 0 5 115 114 0 23 99 111 109 46 107 104 46 115 101 114 105 97 108 69 120 46 83 116 117 100 101 110 116 98 32 57 123 -107 27 125 88 2 0 2 73 0 3 97 103 101 76 0 4 110 97 109 101 116 0 18 76 106 97 118 97 47 108 97 110 103 47 83 116 114 105 110 103 59 120 112 0 0 0 30 116 0 9 -21 -80 -107 -21 -89 -112 -20 -120 -103 
		
		try {
			FileInputStream fis = new FileInputStream(�����̸�);
			ObjectInputStream ois = new ObjectInputStream(fis);
			//���Ͽ��� ��ü�� ������ȭ�ؼ� �о��
			Student �л� = (Student) ois.readObject();
			System.out.println("���Ϸκ��� ��ü�� ������ȭ �߽��ϴ�.");
			System.out.println("������ȭ�� �л� txt : " + �л�);//������ȭ�� �л� txt : name=�ڸ���, age=30
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}
