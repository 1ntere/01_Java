package com.kh.oop.pre;

public class Circle implements Shape, Drawable {
	//implements Shape, Drawable�� ó���� �ۼ��ϸ� ���� ���� ����
	//���� : Shape�� Drawable �������̽����� �ۼ��� �̿ϼ��� �޼��带 �ϼ��ش޶�� ��
	@Override
	public double Area() {
		return 4.8;
	}
	@Override
	public void draw() {
		System.out.println("���� ���ڰ� �׸��ϴ�.");
	}
}
