package com.kh.hamburger;

public class HamburgerOrder {
//�ʵ�
	private String ����;
	private String ����Ÿ��;
//�޼���
	//Setter
	public void set����(String ����) {
		this.���� = ����;
	}
	public void set����Ÿ��(String ����Ÿ��) {
		this.����Ÿ�� = ����Ÿ��;
	}
	//Getter
	public String get����() {
		return ����;
	}
	public String get����Ÿ��() {
		return ����Ÿ��;
	}
	//������ �ʼ�
	public HamburgerOrder(String ����, String ����Ÿ��) {
		this.���� = ����;
		this.����Ÿ�� = ����Ÿ��;
	}
	//@Override toString()
	@Override
	public String toString() {
		return "HamburgerOrder [����=" + ���� + ", ����Ÿ��=" + ����Ÿ�� + "]";
	}
}
