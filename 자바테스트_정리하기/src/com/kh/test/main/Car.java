package com.kh.test.main;

public class Car {
//필드
	private String 차모델이름;
	private int 모델년도;
	private String 색상;
	
//메서드
	//Setter
	public void set차모델이름(String 차모델이름) {
		this.차모델이름 = 차모델이름;
	}
	public void set모델년도(int 모델년도) {
		this.모델년도 = 모델년도;
	}
	public void set색상(String 색상) {
		this.색상 = 색상;
	}
	
	//Getter
	public String get차모델이름() {
		return 차모델이름;
	}
	public int get모델년도() {
		return 모델년도;
	}
	public String get색상() {
		return 색상;
	}
	
	//생성자 (필수)
	public Car(String 차모델이름, int 모델년도, String 색상) {
		this.차모델이름 = 차모델이름;
		this.모델년도 = 모델년도;
		this.색상 = 색상;
	}
	
	//생성자 (기본)
	public Car() {
		this("제*시스",2024,"검정색");
	}
	//=> 필수 생성자를 먼저 작성 후, 기본 생성자 작성도 가능(많이 사용하지는 않는 형태)
	
	//void
	public String 정보() {
		return this.모델년도 + "년식 " + this.차모델이름 + " " + this.색상; 
	}
	
	//main
	public static void main(String[] args) {
		Car newCar = new Car();
		System.out.println(newCar.정보());
	}
}
