package com.kh.test.main.oop;

//동물 하나만 상속 implements Animal
	//interface를 상속받는 경우 Animal 이외에도 , 를 사용해서 여러 파일을 상속받을 수 있음
//동물에서 소리를 만드는 makeSound가 재사용되고 있지 않기 때문에
//강아지에서는 빨간 줄이 나옴
	//Animal에 있는 인터페이스 메서드 makeSound를 구현하면 오류가 없어짐
public class Dog implements Animal, AnimalEat {
	//Animal에 있는 인터페이스 메서드 구현
	@Override //주석과 같은 의미로 생략을 해도 괜찮지만 개발자 간의 약속으로 작성하는 것이기 때문에 작성해주도록 한다.
	public void makeSound() {
		System.out.println("멍멍!");
	}
	
	//@Override - eat 냠냠 작성하기
	public void eat() {
		System.out.println("냠냠");
	}
}
