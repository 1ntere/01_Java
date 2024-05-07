package com.kh.test.main;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		/*while문이나 do while문을 이용하여 1부터 100까지의 모든 정수들의 합과 평균을 구하는 프로그램을 작성*/
		int 시작숫자 = 1;
		int 숫자합 = 0;
		int 카운트 = 0; // 반복한 횟수 몇번 반복했는지 확인
		
		//while
		while (시작숫자 <= 100) {
			숫자합 += 시작숫자; //1 + 2 + 3 + ... + 100
			카운트++;
			시작숫자++;
		}
		
		//평균구하기
		double 평균 = (double) 숫자합 / 카운트;
		System.out.println("1 부터 100 까지 모든 정수의 합 : " + 숫자합);
		System.out.println("1 부터 100 까지 모든 정수의 평균 : " + 평균);

		/*
		//while문을 사용해서 switch 문 계속 숫자 작성하게 만들어주고
		//case3 : return; 을 이용해서 종료 만들어주기
		
		//switch문 실행해보기
		Scanner 스캐너 = new Scanner(System.in);
		String 할일 = ""; //전역변수
		
		//while (true) {} 대신에 변수를 하나 만들어서 변수가 true, false가 됨에 따라 프로그램을 작동하고 멈추기
		boolean 계속 = true;
		
		while (계속) {
			System.out.print("숫자 작성 : ");
			int 날짜 = 스캐너.nextInt(); //숫자를 받는 스캐너 작성
			
			switch (날짜) {
			case 1:
				할일 = "월요일 : 업무";
				break;
			case 2:
				할일 = "화요일 : 공부";
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				//return;  //간결하게 return만 사용해도 됨
				계속 = false;
				break;
			default:
				할일 = "날짜와 관계없이 휴식";
				break;
			}
			System.out.println("일정 : " + 할일);
		}
		*/
		
	}
}
