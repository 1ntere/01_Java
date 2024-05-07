package 자바_예제문제실습;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Person {
//필드
	private String 사람이름;
	private int 나이;
//메서드
	//Setter
	public void set사람이름(String 사람이름) {
		this.사람이름 = 사람이름;
	}
	public void set나이(int 나이) {
		this.나이 = 나이;
	}
	//Getter
	public String get사람이름() {
		return 사람이름;
	}
	public int get나이() {
		return 나이;
	}
	//기본 생성자
	public Person() {
		// TODO Auto-generated constructor stub
	}
	//필수 생성자
	public Person(String 사람이름, int 나이) {
		super();
		this.사람이름 = 사람이름;
		this.나이 = 나이;
	}
	//toString
	@Override
	public String toString() {
		return "사람이름=" + 사람이름 + ", 나이=" + 나이;
	}
	//fileSave
	public void fileSave(String 파일이름) {
		File file = new File(파일이름);
		
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			Person 사람 = new Person("김영희", 10);
			
			bw.write(사람.toString());
			System.out.println("파일이 성공적으로 저장되었습니다.");
			
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//main
	public static void main(String[] args) {
		Person 사람 = new Person();
		사람.fileSave("person.txt");
	}
}
