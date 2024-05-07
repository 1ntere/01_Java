package com.kh.pizzaOrder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PizzaShop2 {
	public static void main(String[] args) {
		//주문목록을 저장할 ArrayList
		List<PizzaOrder> 주문리스트 = new ArrayList<>();
		
		//1. PizzaOrder와 add()를 이용해서 주문리스트에 주문 추가하기
		PizzaOrder 주문1 = new PizzaOrder("고영희", "페페로니");
		주문리스트.add(주문1);
		
		//2. PizzaOrder 필수 생성자 이용해서 바로 추가
		주문리스트.add(new PizzaOrder("박철진", "마르게리따"));
		주문리스트.add(new PizzaOrder("안영식", "슈프림"));
		주문리스트.add(new PizzaOrder("고영희", "파인애플"));
		주문리스트.add(new PizzaOrder("박철진", "치즈"));
		
		//toString() - 주문한 내용 전체보기
		//지금 클래스에서 toString()을 사용해서 어떤 출력을 진행한다 하지 않아도
		//PizzaOrder 클래스에서 작성한 toString이 정보를 정확하게 출력한다
		System.out.println(주문리스트);
			//[PizzaOrder [고객명=고영희, 피자타입=페페로니], 
			//PizzaOrder [고객명=박철진, 피자타입=마르게리따], 
			//PizzaOrder [고객명=안영식, 피자타입=슈프림], 
			//PizzaOrder [고객명=고영희, 피자타입=파인애플], 
			//PizzaOrder [고객명=박철진, 피자타입=치즈]]
		//for-each문 - 주문을 1개씩 출력하기
		for(PizzaOrder 주문 : 주문리스트) {
			System.out.println(주문);
		}
	}
}
