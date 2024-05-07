package 자바_예제문제실습;

public class Animal {
//필드
	private String 동물이름;
	private int 나이;
//메서드
	//Setter	alt + shift + s -> r
	public void set동물이름(String 동물이름) {
		this.동물이름 = 동물이름;
	}
	public void set나이(int 나이) {
		this.나이 = 나이;
	}
	//Getter	alt + shift + s -> r
	public String get동물이름() {
		return 동물이름;
	}
	public int get나이() {
		return 나이;
	}
	//기본 생성자	ctrl + space -> constructor enter;
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	//필수 생성자	alt + shift + s -> o
	public Animal(String 동물이름, int 나이) {
		this.동물이름 = 동물이름;
		this.나이 = 나이;
	}
	//toString	alt + shift + s -> s
	@Override
	public String toString() {
		return "동물이름=" + 동물이름 + ", 나이=" + 나이;
	}
}
