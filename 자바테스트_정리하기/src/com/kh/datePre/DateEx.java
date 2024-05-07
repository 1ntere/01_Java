package com.kh.datePre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		//Date는 최초 1회만 호출
		Date now = new Date();
		System.out.println(now);//Fri May 03 10:38:25 KST 2024
		
		//1. Date로 현재 날짜를 받아서 년-월-일 출력하기
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		String formatSdf1 = sdf1.format(now);
		System.out.println(formatSdf1);//2024-05-03
		
		//1-1. 문자열(String) -> 날짜(Date)로 변경
		try {
			Date parseDate1 = sdf1.parse(formatSdf1);
			System.out.println(parseDate1);//Fri May 03 00:00:00 KST 2024
				//format이 yyyy-MM-dd였으므로 00:00:00이 출력됨
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//2. Date로 현재 날짜를 받아서 시:분:초 출력하기
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
		String formatSdf2 = sdf2.format(now);
		System.out.println(formatSdf2);//10:38:25
		
		//2-1. 문자열(String) -> 날짜(Date)로 변경
		try {
			Date parseDate2 = sdf2.parse(formatSdf2);
			System.out.println(parseDate2);//Thu Jan 01 11:13:51 KST 1970
				//format이 HH:mm:ss였으므로 1970.1.1 목요일이 출력됨
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//3. Date로 현재 날짜를 받아서 년-월-일 시:분:초 출력하기
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String formatSdf3 = sdf3.format(now);
		System.out.println(formatSdf3);//2024-05-03 10:38:25
		
		//3-1. 문자열(String) -> 날짜(Date)로 변경
		try {
			Date parseDate3 = sdf3.parse(formatSdf3);
			System.out.println(parseDate3);//Fri May 03 11:13:51 KST 2024
				//format이 yyyy-MM-dd HH:mm:ss 였으므로 알맞게 출력됨
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
