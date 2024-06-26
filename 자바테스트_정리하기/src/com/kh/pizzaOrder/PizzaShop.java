package com.kh.pizzaOrder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PizzaShop {
	public static void main(String[] args) {
		//고객과 피자리스트를 한번에 묶을 ArrayList 주문리스트
		//고객과 피자 목록을 지정할 ArrayList 고객리스트 피자리스트
		ArrayList<PizzaOrder> 주문리스트 = new ArrayList<>();
		
		ArrayList<String> 고객리스트 = new ArrayList<>(Arrays.asList("고영희", "박철진", "안영식", "고영희", "박철진"));
		ArrayList<String> 피자리스트 = new ArrayList<>(Arrays.asList("페페로니", "마르게리따", "슈프림", "파인애플", "치즈"));
		
		//for문을 활용해서 주문 추가
		for (int i = 0; i < 고객리스트.size(); i++) {
			PizzaOrder 오더 = new PizzaOrder(고객리스트.get(i), 피자리스트.get(i));
			주문리스트.add(오더);
		}
		
		System.out.println(고객리스트);//[고영희, 박철진, 안영식, 고영희, 박철진]
		System.out.println(피자리스트);//[페페로니, 마르게리따, 슈프림, 파인애플, 치즈]
		System.out.println(주문리스트);
			//[PizzaOrder [고객명=고영희, 피자타입=페페로니], 
			//PizzaOrder [고객명=박철진, 피자타입=마르게리따], 
			//PizzaOrder [고객명=안영식, 피자타입=슈프림], 
			//PizzaOrder [고객명=고영희, 피자타입=파인애플], 
			//PizzaOrder [고객명=박철진, 피자타입=치즈]]
	}
}
