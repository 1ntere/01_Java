package �ڹ�_���������ǽ�;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Person {
//�ʵ�
	private String ����̸�;
	private int ����;
//�޼���
	//Setter
	public void set����̸�(String ����̸�) {
		this.����̸� = ����̸�;
	}
	public void set����(int ����) {
		this.���� = ����;
	}
	//Getter
	public String get����̸�() {
		return ����̸�;
	}
	public int get����() {
		return ����;
	}
	//�⺻ ������
	public Person() {
		// TODO Auto-generated constructor stub
	}
	//�ʼ� ������
	public Person(String ����̸�, int ����) {
		super();
		this.����̸� = ����̸�;
		this.���� = ����;
	}
	//toString
	@Override
	public String toString() {
		return "����̸�=" + ����̸� + ", ����=" + ����;
	}
	//fileSave
	public void fileSave(String �����̸�) {
		File file = new File(�����̸�);
		
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			Person ��� = new Person("�迵��", 10);
			
			bw.write(���.toString());
			System.out.println("������ ���������� ����Ǿ����ϴ�.");
			
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//main
	public static void main(String[] args) {
		Person ��� = new Person();
		���.fileSave("person.txt");
	}
}
