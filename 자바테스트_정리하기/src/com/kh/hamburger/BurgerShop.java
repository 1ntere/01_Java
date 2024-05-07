package com.kh.hamburger;

import java.util.*;

public class BurgerShop {
	public static void main(String[] args) {
		//ArrayList 사용 주문리스트
		List<HamburgerOrder> 주문리스트 = new ArrayList<>();
		
		//필수생성자 - 주문 추가
		주문리스트.add(new HamburgerOrder("동그라미", "치즈버거"));
		주문리스트.add(new HamburgerOrder("안세모", "베이컨버거"));
		주문리스트.add(new HamburgerOrder("박네모", "상하이버거"));
		주문리스트.add(new HamburgerOrder("금각진", "치킨버거"));
		주문리스트.add(new HamburgerOrder("동그라미", "빅맥"));
		
		//메뉴 모두 출력
		System.out.println(주문리스트);
			//[HamburgerOrder [고객명=동그라미, 버거타입=치즈버거], 
			//HamburgerOrder [고객명=안세모, 버거타입=베이컨버거], 
			//HamburgerOrder [고객명=박네모, 버거타입=상하이버거], 
			//HamburgerOrder [고객명=금각진, 버거타입=치킨버거], 
			//HamburgerOrder [고객명=동그라미, 버거타입=빅맥]]
		
		//for-each문 - 메뉴 1개씩 출력
		for (HamburgerOrder 주문 : 주문리스트 ) {
			System.out.println(주문);
				//HamburgerOrder [고객명=동그라미, 버거타입=치즈버거]
				//HamburgerOrder [고객명=안세모, 버거타입=베이컨버거]
				//HamburgerOrder [고객명=박네모, 버거타입=상하이버거]
				//HamburgerOrder [고객명=금각진, 버거타입=치킨버거]
				//HamburgerOrder [고객명=동그라미, 버거타입=빅맥]
		}
		
		//ArrayList에 담긴 중복으로 된 사람들을 중복으로 주문하지 못하게 하고 싶다면
		System.out.println("고객님 중복 주문이시네요!!");
		System.out.println("처음 주문만 받겠습니다. ^^");
		
		//HashSet 사용해서 중복 주문 방지하기 위한 set 중복고객제거
		Set<String> 중복고객제거 = new HashSet<>();
			//중복확인여부를 위한 인스턴스 생성
		
		//중복 고객을 제거한 다음에 중복되지 않은 고객만 ArrayList 중복제거주문에 다시 담기
		List<HamburgerOrder> 중복제거주문 = new ArrayList<>();
			//중복고객을 제거한 내용만 담을 예정
		
		//for-each문 - 중복이 있는지 한 바퀴 돌면서 확인한 다음 중복이 되지 않는 내용만 추가
		for (HamburgerOrder 주문 : 주문리스트) {
			if (!중복고객제거.contains(주문.get고객명())) {//고객이 존재하지 않는다면
				/*
				★ 오류 발생
				if (중복고객제거.contains(주문.get고객명())) {}
				-----
				★ 원인
				존재하는 고객만 추가하겠다라는 의미이기 때문에 추가가 안됨
				=====
				★ 해결방안
				! 사용
				if (!중복고객제거.contains(주문.get고객명())) {}
				*/
				중복제거주문.add(주문);//주문 내용 추가
				중복고객제거.add(주문.get고객명());
			}
		}
		System.out.println(중복제거주문);
			//중복제거주문에는 처음에 주문한 리스트만 받을 수 있게 됨
	}
}
