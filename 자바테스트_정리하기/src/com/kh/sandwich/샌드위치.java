package com.kh.sandwich;

public class ������ġ {
//�ʵ�
	private String ������;
	private String ������ġ����;
//�޼���
	//Setter -> alt+shift+s -> r
	public void set������(String ������) {
		this.������ = ������;
	}
	public void set������ġ����(String ������ġ����) {
		this.������ġ���� = ������ġ����;
	}
	//Getter -> alt+shift+s -> r
	public String get������() {
		return ������;
	}
	public String get������ġ����() {
		return ������ġ����;
	}
	//�ʼ� ������ -> alt+shift+s -> o
	public ������ġ(String ������, String ������ġ����) {
		this.������ = ������;
		this.������ġ���� = ������ġ����;
	}
	//@Override toString - alt+shift+s -> s
	@Override
	public String toString() {
		return "������ġ [������=" + ������ + ", ������ġ����=" + ������ġ���� + "]";
	}
}
