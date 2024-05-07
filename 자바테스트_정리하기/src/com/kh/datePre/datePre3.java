package com.kh.datePre;

import java.text.SimpleDateFormat;
import java.util.Date;

public class datePre3 {
	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy / MM / dd / E");
		System.out.println(sdf);//java.text.SimpleDateFormat@3d658514
			//sdf는 변환하고 싶은 규칙일 뿐이지 날짜를 가져올 수 있는 것은 아님
		String formatSdf = sdf.format(now);
		System.out.println(formatSdf);//24 / 05 / 03 / 금
		
		System.out.println("주민번호를 8자리 입력해주세요");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd");
		String formatSdf1 = sdf1.format(now);
		System.out.println(formatSdf1);//20240503
		
		System.out.println("주민번호를 6자리 입력해주세요");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyMMdd");
		String formatSdf2 = sdf2.format(now);
		System.out.println(formatSdf2);//240503
	}
}
