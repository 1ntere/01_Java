package pre.propertiesEx2;

public class Drama implements Comparable<Drama>{
//�ʵ�
	private String name;
	private int ��ó⵵;
	private int ����;
//�޼���
	//Setter
	public void setName(String name) {
		this.name = name;
	}
	public void set��ó⵵(int ��ó⵵) {
		this.��ó⵵ = ��ó⵵;
	}
	public void set����(int ����) {
		this.���� = ����;
	}
	//Getter
	public String getName() {
		return name;
	}
	public int get��ó⵵() {
		return ��ó⵵;
	}
	public int get����() {
		return ����;
	}
	//�⺻������
	public Drama() {
		// TODO Auto-generated constructor stub
	}
	//�ʼ�������
	public Drama(String name, int ��ó⵵, int ����) {
		this.name = name;
		this.��ó⵵ = ��ó⵵;
		this.���� = ����;
	}
	//toString
	@Override
	public String toString() {
		return "name=" + name + ", ��ó⵵=" + ��ó⵵ + ", ����=" + ����;
	}
	//compareTo
	@Override
	public int compareTo(Drama o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
}
