package com.kh.serialEx;

import java.io.Serializable;

//1. Student ��ü�� ����ȭ �ϱ� ���� �ʵ�� �޼��� �ۼ�
public class Student implements Serializable {
//�ʵ�
	private String name;
	private int age;
//�޼���
	//Setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//Getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	//�⺻ ������
	public Student() {
		// TODO Auto-generated constructor stub
	}
	//�ʼ� ������
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//toString
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age;
	}
}
