package com.kh.FileEx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//����Ű - �ٹٲ� : ctrl + shift + f
public class FileEx {
	public static void main(String[] args) throws IOException {
		//������ �����ϴ��� Ȯ��
		//���� ����� �� �ۼ��ϱ�
			//������ ��� ��� ���� ���� ���� ����
			//������ java�ڵ带 �ۼ��ϰ� �ִ� ������ �ٷ� �Ʒ��� �������
			//example.txt�� �ڹ��׽�Ʈ_�����ϱ� ��� ���� �ؿ� ������� ����
		String �����̸� = "example.txt";
		
		File file = new File(�����̸�);
		
		//������ �����ϴ��� Ȯ��
		if(file.exists() ) {
			System.out.println("������ �̹� �����մϴ�.");
		} else {
			file.createNewFile();
			System.out.println("������ �����߽��ϴ�.");
		}
		
		//write() - �� �ۼ��ϱ�
		FileWriter �۾��� = new FileWriter(file);
		
		�۾���.write("�̰��� �����ۼ� �����Դϴ�. \n");// \n  : ����ó��
		�۾���.write("�۾��� ����� �����ϰ� �ֽ��ϴ�. \n");
		
		//close() - ���� �� �ۼ��ߴٸ� �׻� close()�� ����ؼ� �ݾ��ֱ�
		//�츮�� � ������ �ۼ��ϸ鼭 �������� �ʰ� ������ ��
		//�����Ͻðڽ��ϱ�? ��� ������ �߸鼭 ���� / ��Ұ� ������ ��ó��
		//close�� ����Ѵٴ� ���� �����ϱ�� ���� �ǹ�
		//close�� �ۼ����� �ʴ´ٴ� ���� ���� �ۼ��ϴ� ����ϴ� �Ͱ� ���� �ǹ�
		�۾���.close();
		System.out.println("���Ͽ� ������ �ۼ��߽��ϴ�.");
	}
}
