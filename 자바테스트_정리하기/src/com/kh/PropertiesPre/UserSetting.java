package com.kh.PropertiesPre;

import java.util.*;

public class UserSetting {
	public static void main(String[] args) {
		//Properties 객체와 인스턴스 생성 = setting
		Properties setting = new Properties();
		
		setting.setProperty("name", "john");
		setting.setProperty("age", "17");
		setting.setProperty("city", "seoul");
		
		//city 조회하기
		String info = setting.getProperty("city");
		System.out.println("city : " + info);
		
		//for-each문, Map.Entry<Object, Object>, entrySet() - key, value 전체 출력
		System.out.println("전체조회하기");
		for (Map.Entry<Object, Object> e : setting.entrySet()) 
		{
			Object key = e.getKey();
			Object value = e.getValue();
			System.out.println(key + " : " + value);
		}
			//순서가 제멋대로 나옴
	}
}
