package �ڹ�_���������ǽ�;

public class Movie {
//�ʵ�
	private String ��ȭ����;
	private String ��ȭ�帣;
//�޼���
	//Setter
	public void set��ȭ����(String ��ȭ����) {
		this.��ȭ���� = ��ȭ����;
	}
	public void set��ȭ�帣(String ��ȭ�帣) {
		this.��ȭ�帣 = ��ȭ�帣;
	}
	//Getter
	public String get��ȭ����() {
		return ��ȭ����;
	}
	public String get��ȭ�帣() {
		return ��ȭ�帣;
	}
	//�⺻ ������
	public Movie() {
		// TODO Auto-generated constructor stub
	}
	//�ʼ� ������
	public Movie(String ��ȭ����, String ��ȭ�帣) {
		this.��ȭ���� = ��ȭ����;
		this.��ȭ�帣 = ��ȭ�帣;
	}
	//toString
	@Override
	public String toString() {
		return "��ȭ����=" + ��ȭ���� + ", ��ȭ�帣=" + ��ȭ�帣;
	}
}
