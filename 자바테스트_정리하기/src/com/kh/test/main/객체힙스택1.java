package com.kh.test.main;

public class ��ü������1 {
	public static void main(String[] args) {
		Car ��1 = new Car();//��1 : com.kh.test.main.Car@379619aa
			//�� ��ǻ�Ϳ��� ���� �ּ��̱� ������ Ÿ���� ��ǻ�Ϳ� �ּҰ� ��ġ���� ���� �� ����
		System.out.println("��1 : " + ��1);
		System.out.println(��1.get�����̸�());
		System.out.println(��1.get����());
		System.out.println(��1.get�𵨳⵵());
		
		Car ��2 = new Car("��*Ÿ", 2019, "ȭ��Ʈ");//��2 : com.kh.test.main.Car@cac736f
		System.out.println("��2 : " + ��2);
		System.out.println(��2.get�����̸�());
		System.out.println(��2.get����());
		System.out.println(��2.get�𵨳⵵());
	}
}
