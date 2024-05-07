package com.kh.oop.pre;

public class Circle implements Shape, Drawable {
	//implements Shape, Drawable를 처음에 작성하면 빨간 줄이 생김
	//원인 : Shape와 Drawable 인터페이스에서 작성한 미완성된 메서드를 완성해달라는 뜻
	@Override
	public double Area() {
		return 4.8;
	}
	@Override
	public void draw() {
		System.out.println("원을 예쁘게 그립니다.");
	}
}
