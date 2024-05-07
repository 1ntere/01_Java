package 자바_예제문제실습;

public class Movie {
//필드
	private String 영화제목;
	private String 영화장르;
//메서드
	//Setter
	public void set영화제목(String 영화제목) {
		this.영화제목 = 영화제목;
	}
	public void set영화장르(String 영화장르) {
		this.영화장르 = 영화장르;
	}
	//Getter
	public String get영화제목() {
		return 영화제목;
	}
	public String get영화장르() {
		return 영화장르;
	}
	//기본 생성자
	public Movie() {
		// TODO Auto-generated constructor stub
	}
	//필수 생성자
	public Movie(String 영화제목, String 영화장르) {
		this.영화제목 = 영화제목;
		this.영화장르 = 영화장르;
	}
	//toString
	@Override
	public String toString() {
		return "영화제목=" + 영화제목 + ", 영화장르=" + 영화장르;
	}
}
