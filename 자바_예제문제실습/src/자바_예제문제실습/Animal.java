package �ڹ�_���������ǽ�;

public class Animal {
//�ʵ�
	private String �����̸�;
	private int ����;
//�޼���
	//Setter	alt + shift + s -> r
	public void set�����̸�(String �����̸�) {
		this.�����̸� = �����̸�;
	}
	public void set����(int ����) {
		this.���� = ����;
	}
	//Getter	alt + shift + s -> r
	public String get�����̸�() {
		return �����̸�;
	}
	public int get����() {
		return ����;
	}
	//�⺻ ������	ctrl + space -> constructor enter;
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	//�ʼ� ������	alt + shift + s -> o
	public Animal(String �����̸�, int ����) {
		this.�����̸� = �����̸�;
		this.���� = ����;
	}
	//toString	alt + shift + s -> s
	@Override
	public String toString() {
		return "�����̸�=" + �����̸� + ", ����=" + ����;
	}
}
