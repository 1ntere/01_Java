package com.kh.BasicEx;
/*
가비지컬렉터(Garbage Collector)
	쓰레기 수집
	더 이상 사용되지 않는 객체나 변수를 자동으로 정리하는 방식
*/
public class 가비지컬렉터 {
//필드
//main 메서드 들어가기 전에 작성하는 변수가 전역변수
	public static void main(String[] args) {
		//이 안에 작성하는 변수는 지역변수
		// └ 이유 : main 메서드의 {} 안에 들어와서 작성했기 때문에
		String 주소 = "https://";
		System.out.println(주소);
		주소+= "www.naver.com";
		System.out.println(주소);
	}
}
