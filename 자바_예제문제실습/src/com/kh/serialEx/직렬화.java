package com.kh.serialEx;

import java.io.*;

//2. Student 객체를 직렬화해서 student.txt 파일로 저장
public class 직렬화 {
	public static void main(String[] args) {
		//직렬화된 데이터를 저장할 파일 경로
		String 파일이름 = "student.txt";
		
		//직렬화해서 전송할 객체 생성
		Student 학생 = new Student("박말숙",30);
		
		//객체를 파일로 직렬화하는 코드
		try {
			FileOutputStream fos = new FileOutputStream(파일이름);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			//객체를 직렬화해서 파일 작성하기
			oos.writeObject(학생);
				//★ 주소의 형태로 저장됨
			oos.close();
				//close()를 통해 닫기를 해줘야 저장됨
			System.out.println("객체를 직렬화해서 파일을 저장했습니다.");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/* ===== 이하는 아직 몰라도 됨 ===== */
		//만약에 파일을 보고 싶다면
		try {
			FileInputStream fis = new FileInputStream(파일이름);
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			
			byte[] buffer = new byte[1024];
			int length;
			while ((length = fis.read(buffer)) != -1) {
				bos.write(buffer, 0, length);
			}
			byte[] bytes = bos.toByteArray();
			System.out.println("직렬화된 내용을 확인하기");
			for (byte b : bytes) {
				System.out.print(b + " ");//-84 -19 0 5 115 114 0 23 99 111 109 46 107 104 46 115 101 114 105 97 108 69 120 46 83 116 117 100 101 110 116 98 32 57 123 -107 27 125 88 2 0 2 73 0 3 97 103 101 76 0 4 110 97 109 101 116 0 18 76 106 97 118 97 47 108 97 110 103 47 83 116 114 105 110 103 59 120 112 0 0 0 30 116 0 9 -21 -80 -107 -21 -89 -112 -20 -120 -103 
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
