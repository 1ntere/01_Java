package �ڹ�_���������ǽ�;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AnimalMain {
	//file
	//���޹��� ������ ���Ͽ� �����ϰ� �����ϴ� �ڵ� �ۼ�
	public void fileSave(/*���߿� ���� ���� �̸�*/String �����̸�) {
		File file = new File(/*���߿� ���� ���� �̸�*/�����̸�);
		
		//������ �����ϰ� ���� �ۼ��ϴ� FileWriter����
		try {
			FileWriter fw = new FileWriter(file);
			
			//���Ͽ� ���ڿ��� �ۼ��� �� �����鼭 ��±��� �����ִ� BufferedWriter ���
			BufferedWriter bw = new BufferedWriter(fw);
			
			//Animal ��ü �����ϰ� �� �ۼ��ؼ� ����
			Animal ���� = new Animal("�����", 3);
			
			//toString���� ��µǴ� ������ ����
			bw.write(����.toString());
			System.out.println("������ ���������� ����Ǿ����ϴ�.");
			
			//close()�� �ۼ����� ������ �ڵ尡 ������ ���� ����
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		//Animal ���� = new Animal("�ڳ���", 2);
		//System.out.println(����);
			//����Ǵ� �ڵ����� file �ۼ��� ���� �ּ� ó��
		AnimalMain �����������ϸ���� = new AnimalMain();
		�����������ϸ����.fileSave("animal.txt");
	}
}
