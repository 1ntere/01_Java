package com.kh.serialEx;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

//3. Student 객체를 직렬화해서 파일로 저장한 student.txt를 불러와서 역직렬화해서 Student 객체를 불러오기
public class 역직렬화 {
	public static void main(String[] args) {
		//직렬화된 파일 불러오기
		String 파일이름 = "student.txt";//-84 -19 0 5 115 114 0 23 99 111 109 46 107 104 46 115 101 114 105 97 108 69 120 46 83 116 117 100 101 110 116 98 32 57 123 -107 27 125 88 2 0 2 73 0 3 97 103 101 76 0 4 110 97 109 101 116 0 18 76 106 97 118 97 47 108 97 110 103 47 83 116 114 105 110 103 59 120 112 0 0 0 30 116 0 9 -21 -80 -107 -21 -89 -112 -20 -120 -103 
		
		try {
			FileInputStream fis = new FileInputStream(파일이름);
			ObjectInputStream ois = new ObjectInputStream(fis);
			//파일에서 객체를 역직렬화해서 읽어보기
			Student 학생 = (Student) ois.readObject();
			System.out.println("파일로부터 객체를 역직렬화 했습니다.");
			System.out.println("역직렬화된 학생 txt : " + 학생);//역직렬화된 학생 txt : name=박말숙, age=30
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}
