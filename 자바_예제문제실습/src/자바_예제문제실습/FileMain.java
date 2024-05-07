package 자바_예제문제실습;

import java.io.FileWriter;
import java.io.IOException;

/*기존에 있던 animal.txt 밑에 코뿔소, 10과 코끼리친구코뿔소를 이어서 작성하려고 함*/
public class FileMain {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("animal.txt", true);
				//true를 넣어서 기존에 있던 animal.txt(동물이름=멧돼지, 나이=3)뒤에 (코뿔소, 10코끼리친구코뿔소)가 작성이 됨
				//실행하면 실행한 만큼 animal.txt안에서 (코뿔소, 10코끼리친구코뿔소)가 계속 작성됨
			fw.write("코뿔소, 10");
			fw.write("코끼리친구코뿔소");
			System.out.println("파일 수정이 완료되었습니다.");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
