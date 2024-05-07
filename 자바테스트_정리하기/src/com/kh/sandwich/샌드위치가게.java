package com.kh.sandwich;

import java.util.*;

public class 샌드위치가게 {
	public static void main(String[] args) {
		//ArrayList 주문리스트
		List<샌드위치> 주문리스트 = new ArrayList<>();
		
		//추가하기
		주문리스트.add(new 샌드위치("김하나", "BLT"));
		주문리스트.add(new 샌드위치("이둘", "터키"));
		주문리스트.add(new 샌드위치("김하나", "치킨"));
		주문리스트.add(new 샌드위치("이셋", "에그마요"));
		주문리스트.add(new 샌드위치("김하나", "베지터블"));
		
		//HashSet 고객명
		Set<String> 고객명 = new HashSet<>();
		
		//ArrayList 중복제거리스트
		ArrayList<샌드위치> 중복제거리스트 = new ArrayList<>();
		
		//중복여부를 확인하고 중복되지 않은 주문만 ArrayList 중복제거리스트에 추가
		for (샌드위치 주문 : 주문리스트) {
			if (!고객명.contains(주문.get고객명())) {
				중복제거리스트.add(주문);
				고객명.add(주문.get고객명());
			}
		}
		System.out.println(중복제거리스트);
			//[샌드위치 [고객명=김하나, 샌드위치종류=BLT], 
			//샌드위치 [고객명=이둘, 샌드위치종류=터키], 
			//샌드위치 [고객명=이셋, 샌드위치종류=에그마요]]
		
		//for-each문 - 1개씩 출력
		for (샌드위치 주문 : 중복제거리스트 ) {
			System.out.println(주문);
				//샌드위치 [고객명=김하나, 샌드위치종류=BLT]
				//샌드위치 [고객명=이둘, 샌드위치종류=터키]
				//샌드위치 [고객명=이셋, 샌드위치종류=에그마요]
		}
	}
}
