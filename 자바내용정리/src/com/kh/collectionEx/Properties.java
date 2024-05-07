package com.kh.collectionEx;
/*
Properties 키(key) 값(value) 문자열 형태로 저장되는 클래스
일반적으로 속성파일을 읽거나 쓰는데 사용
주로 텍스트 파일로 저장됨
키와 값이 모두 문자열

메서드
	load()	: 파일을 대기
	store()	: 파일을 저장
	getProperty()	: 값 전달
	setProperty()	: 값 설정
	loadFromXML()	: xml 파일을 대기
	storeToXML()	: xml 파일을 저장
파일 안에 주석을 작성할 수 있음, 주석은 # 또는 ! 사용

Properties 키와 값을 설정할 때 한글로 작성해서 파일로 저장할 경우
한글이 유니코드 형태로 보일 수 있으므로 ex) '\U5BC'
영어로 작성하는 것을 권장한다.

Properties는 설정파일이고, 자바에서 코드를 작성해서 파일로 보낼 때는 " "를 사용해서 키와 값을 넣지만
해당 자료형은 <String>이 아니라 <Object>이다.
따라서 <Object>를 사용해야 Map.Entry<Object, Object>를 이용하여 전체 조회를 할 수 있다.

	예시
	for(Map.Entry<Object, Object> e : 설정파일.entrySet()) {
		Object key = e.getKey();//키 가져오기
		Object value = e.getValue();//값 가져오기
	}
*/
public class Properties {

}
