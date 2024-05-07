package com.kh.FileEx;

import java.io.*;

/*
FileWriter (파일 만드는 객체)
	파일에 문자 데이터를 쓰기 위해 사용
	파일에 텍스트를 작성하고 저장할 때 사용

메서드
	write()	: 파일 내용 작성
	flush()	: 나머지 출력 스트림 버퍼를 비워내 모든 데이터를 파일에 사용
	close()	: 출력 스트림을 닫고 저장
	
	사용예제
		FileWriter 글쓰기 = new FileWriter(파일명);
			//파일을 덮어 쓴 다음 새로 만들기
		FileWriter 글쓰기 = new FileWriter(파일명, true);
			//파일에 내용이 존재하면 이어서 작성해주는 방법
*/
public class FilePre {
	public static void main(String[] args) throws IOException {
		String 파일이름 = "practice.txt";
		
		File file = new File(파일이름);
		
		//파일이 존재하는지 확인
		if (file.exists()) {//존재한다면 이미 존재합니다. 라는 문구를 출력
			System.out.println("파일이 이미 존재합니다.");
		} else {//존재하지 않는다면 만들어줌
			file.createNewFile();
			System.out.println("파일을 새로 생성하였습니다.");
		}
		
		//파일에 글을 작성하기
		//Java \n File \n 객체 \n 종료하기 실행
		FileWriter 글쓰기 = new FileWriter(file);
		글쓰기.write("Java \n");
		글쓰기.write("File \n");
		글쓰기.write("\n 객체");
		글쓰기.write("\n 종료하기");
		글쓰기.close();
		System.out.println("파일 작성을 완료했습니다.");
	}
}
