package �ڹ�_���������ǽ�;

public class Circle {
//�ʵ�
	public static final double PI = 3.14;
	public double radius;
	
//�޼���
	//Setter
	public void setRadius(double radius) {
		this.radius = radius;
	}
	//Getter
	public static double getPi() {
		return PI;
	}
	public double getRadius() {
		return radius;
	}
	//�ʼ� ������
	public Circle(double radius) {
		this.radius = radius;
	}
	//void
	public void draw() {
		System.out.println("������ " + radius + "cm�� ���� �׸��ϴ�.");
	}

	public static void main(String[] args) {
		Circle �� = new Circle(2.5);
		��.draw();
	}
}
