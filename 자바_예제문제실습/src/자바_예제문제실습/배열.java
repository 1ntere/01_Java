package �ڹ�_���������ǽ�;

public class �迭 {
	public static void main(String[] args) {
		Circle[] ���� = new Circle[2];
		System.out.println("����[0] : " + ����[0]);//null
		System.out.println("����[1] : " + ����[1]);//null
		����[0] = new Circle(2.5);
			//null�� ���� �ʵ��� ���� �־��ְų�, null�� ����
		����[1] = new Circle(3.5);
		
		for (int i = 0; i < ����.length; i++) {
				//for���� ���� Ȯ���ϱ� (i<=����.length�� �ƴ϶� i<����.length���� ��)
			System.out.println(����[i].getRadius());
		}
	}
}
