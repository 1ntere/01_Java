package �ڹ�_���������ǽ�;

import java.util.ArrayList;

public class ArrayMovie {
	public static void main(String[] args) {
		//��ȭ�� ���� ArrayList
		ArrayList<Movie> ��ȭ����Ʈ = new ArrayList<>();
		��ȭ����Ʈ.add(new Movie("�����", "�׼�"));
		��ȭ����Ʈ.add(new Movie("�ŵ�ƽ�", "�׼�"));
		��ȭ����Ʈ.add(new Movie("�������", "�ִϸ��̼�"));
		//��ȭ����Ʈ.add("�������");
			//�� �ȵǴ� ����
			//��ȭ����Ʈ�� <Movie>�� �޾ұ� ������ <String>���� �ۼ��� �� ����.
		
		System.out.println(��ȭ����Ʈ);//[�ڹ�_���������ǽ�.Movie@cac736f, �ڹ�_���������ǽ�.Movie@5e265ba4, �ڹ�_���������ǽ�.Movie@156643d4]
			//Movie Ŭ�������� toString�� �ۼ����� �ʰ� �� �ڵ带 �ۼ��ϸ� ��ȭ����Ʈ�� �ּҰ��� ���´�
		System.out.println(��ȭ����Ʈ);//[��ȭ����=�����, ��ȭ�帣=�׼�, ��ȭ����=�ŵ�ƽ�, ��ȭ�帣=�׼�, ��ȭ����=�������, ��ȭ�帣=�ִϸ��̼�]
			//Movie Ŭ�������� toString�� �ۼ��ϰ� �� �ڵ带 �ۼ��ϸ� ��ȭ����Ʈ�� ��µȴ�
	}
}
