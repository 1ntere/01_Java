package com.kh.test.main.oop;
//extends - 자식클래스로 부모클래스를 상속
//인터페이스가 아니라 클래스를 상속 받을 때는 하나 밖에 상속받지 못하기 때문에
//extends 사용 후 하나의 클래스만 작성
public class Child extends Parent {
//필드
	int 자식변수;
//메서드
	//생성자 (기본) - 보통 단축키가 ctrl + space -> enter 이지만 constructor 표시가 있는지 확인 수 엔터
	public Child() {
		// TODO Auto-generated constructor stub
	}
	//생성자 (필수) - 단축키 : alt + shift + s -> o
	public Child(int 자식변수) {
		super();//Parent의 기본 생성자라는 의미
			//부모변수는 super()를 사용해서 Parent에서 가져올 예정
				/*
				★ 오류 발생
				만약 Parent 클래스에서 기본생성자와 필수생성자를 작성하지 않았는데
				Child 클래스에서 곧바로 super(부모변수);를 사용하면 빨간줄이 표시 됨
				-----
				★ 원인
				현재 부모변수에 어떻게 받아서 가져가겠다는 것이 없기 때문에 뜨는 에러
				=====
				★ 해결 방안
				Parent 클래서에서 기본 생성자와 필수 생성자를 넣어서 작성
				 */
		this.자식변수 = 자식변수;
	}
	//생성자 (필수) - 단축키 : alt + shift + s -> o
	public Child(int 부모변수, int 자식변수) {
		super(부모변수);//Parent의 필수 생성자를 사용하겠다는 의미
		this.자식변수 = 자식변수;
	}
	//=>근데 보통 필수 생성자는 아래의 코드로 1번만 작성

	public void 자식메서드() {
		super.부모메서드();
		System.out.println("자식도 호출되었습니다.");
	}
}
