package com.kh.goodShop;

import java.util.*;

public class ��ǻ�Ͱ��� {
	public static void main(String[] args) {
		Map<String, Integer> �����ǰ = new HashMap<>();
		
		//put() - ������ �߰��ϱ�
		�����ǰ.put("��Ʈ��", 700000);
		�����ǰ.put("����ũž", 20000);
		�����ǰ.put("�����", 5000);
		�����ǰ.put("���콺", 3000);
		�����ǰ.put("Ű����", 2000);
		
		//for-each�� - ����ϱ�, Map.Entry<>�� �����ǰ.entrySet()
		System.out.println("=== ��ǻ�� ��ǰ ��� ===");
		for (Map.Entry<String, Integer> e : �����ǰ.entrySet()) {
			String ��ǰ = e.getKey();
			int ���� = e.getValue();
			System.out.println(��ǰ + "�� ������ " + ���� + "�� �Դϴ�.");
		}
		
		//containsKey() - Ư�� ��ǰ�� ���� ���
		//Scanner�� �Է¹޾Ƽ� Ȯ��
		Scanner sc = new Scanner(System.in);
		System.out.print("� ������ ã���ϱ�? : ");
		String ã�¹��� = sc.nextLine();//"USB";
		
		System.out.println(ã�¹��� + "��(��) ���Կ� �ֽ��ϱ�?");
		
		if(�����ǰ.containsKey(ã�¹���)) {//�����Ѵٸ� ��~! �����մϴ�.
			System.out.println("��~! " + ã�¹��� + "�����մϴ�.");
		} else {//�������� �ʴ´ٸ� ���� ǰ���Դϴ�.
			System.out.println(ã�¹��� + "��(��) ���� ǰ���Դϴ�.");
		}
	}
}
