package �ڹ�_���������ǽ�;

import java.io.FileWriter;
import java.io.IOException;

/*������ �ִ� animal.txt �ؿ� �ڻԼ�, 10�� �ڳ���ģ���ڻԼҸ� �̾ �ۼ��Ϸ��� ��*/
public class FileMain {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("animal.txt", true);
				//true�� �־ ������ �ִ� animal.txt(�����̸�=�����, ����=3)�ڿ� (�ڻԼ�, 10�ڳ���ģ���ڻԼ�)�� �ۼ��� ��
				//�����ϸ� ������ ��ŭ animal.txt�ȿ��� (�ڻԼ�, 10�ڳ���ģ���ڻԼ�)�� ��� �ۼ���
			fw.write("�ڻԼ�, 10");
			fw.write("�ڳ���ģ���ڻԼ�");
			System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
