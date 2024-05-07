package com.kh.goodShop;

import java.util.*;

public class 컴퓨터가게 {
	public static void main(String[] args) {
		Map<String, Integer> 모든제품 = new HashMap<>();
		
		//put() - 데이터 추가하기
		모든제품.put("노트북", 700000);
		모든제품.put("데스크탑", 20000);
		모든제품.put("모니터", 5000);
		모든제품.put("마우스", 3000);
		모든제품.put("키보드", 2000);
		
		//for-each문 - 출력하기, Map.Entry<>와 모든제품.entrySet()
		System.out.println("=== 컴퓨터 상품 목록 ===");
		for (Map.Entry<String, Integer> e : 모든제품.entrySet()) {
			String 제품 = e.getKey();
			int 가격 = e.getValue();
			System.out.println(제품 + "의 가격은 " + 가격 + "원 입니다.");
		}
		
		//containsKey() - 특정 물품의 가격 출력
		//Scanner로 입력받아서 확인
		Scanner sc = new Scanner(System.in);
		System.out.print("어떤 물건을 찾습니까? : ");
		String 찾는물건 = sc.nextLine();//"USB";
		
		System.out.println(찾는물건 + "이(가) 가게에 있습니까?");
		
		if(모든제품.containsKey(찾는물건)) {//존재한다면 네~! 존재합니다.
			System.out.println("네~! " + 찾는물건 + "존재합니다.");
		} else {//존재하지 않는다면 현재 품절입니다.
			System.out.println(찾는물건 + "은(는) 현재 품절입니다.");
		}
	}
}
