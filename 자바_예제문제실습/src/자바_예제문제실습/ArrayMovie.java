package 자바_예제문제실습;

import java.util.ArrayList;

public class ArrayMovie {
	public static void main(String[] args) {
		//영화를 넣을 ArrayList
		ArrayList<Movie> 영화리스트 = new ArrayList<>();
		영화리스트.add(new Movie("어벤져스", "액션"));
		영화리스트.add(new Movie("매드맥스", "액션"));
		영화리스트.add(new Movie("톰과제리", "애니메이션"));
		//영화리스트.add("톰과제리");
			//가 안되는 이유
			//영화리스트를 <Movie>로 받았기 때문에 <String>으로 작성할 수 없다.
		
		System.out.println(영화리스트);//[자바_예제문제실습.Movie@cac736f, 자바_예제문제실습.Movie@5e265ba4, 자바_예제문제실습.Movie@156643d4]
			//Movie 클래스에서 toString을 작성하지 않고 위 코드를 작성하면 영화리스트의 주소값이 나온다
		System.out.println(영화리스트);//[영화제목=어벤져스, 영화장르=액션, 영화제목=매드맥스, 영화장르=액션, 영화제목=톰과제리, 영화장르=애니메이션]
			//Movie 클래스에서 toString을 작성하고 위 코드를 작성하면 영화리스트가 출력된다
	}
}
