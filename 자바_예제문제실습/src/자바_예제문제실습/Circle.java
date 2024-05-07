package 자바_예제문제실습;

public class Circle {
//필드
	public static final double PI = 3.14;
	public double radius;
	
//메서드
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
	//필수 생성자
	public Circle(double radius) {
		this.radius = radius;
	}
	//void
	public void draw() {
		System.out.println("반지름 " + radius + "cm인 원을 그립니다.");
	}

	public static void main(String[] args) {
		Circle 원 = new Circle(2.5);
		원.draw();
	}
}
