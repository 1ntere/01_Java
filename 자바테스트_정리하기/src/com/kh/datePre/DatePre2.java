package com.kh.datePre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre2 {
	public static void main(String[] args) {
		Date now = new Date();
		//날짜 형식을 0000년 00월 00일
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		//날짜를 문자열로 형식
		String dateString = sdf.format(now);
		
		//출력
		System.out.println(dateString);//2024년 05월 03일
		
		//문자열을 날짜로 parse를 사용해서 변경
		try {
			Date parseDate = sdf.parse(dateString);
			System.out.println(parseDate);//Fri May 03 00:00:00 KST 2024
				//년 월 일 형식으로 글자를 넣게 되면 시 분 초 값을 읽어오지 못함
				//추가로 - 이외에 / 나 _ 글자를 넣게 되면 시 분 초 값을 읽어오지 못함
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
