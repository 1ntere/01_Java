package 자바_예제문제실습;

public class 배열 {
	public static void main(String[] args) {
		Circle[] 원들 = new Circle[2];
		System.out.println("원들[0] : " + 원들[0]);//null
		System.out.println("원들[1] : " + 원들[1]);//null
		원들[0] = new Circle(2.5);
			//null이 되지 않도록 값을 넣어주거나, null을 설정
		원들[1] = new Circle(3.5);
		
		for (int i = 0; i < 원들.length; i++) {
				//for문의 범위 확인하기 (i<=원들.length이 아니라 i<원들.length여야 함)
			System.out.println(원들[i].getRadius());
		}
	}
}
