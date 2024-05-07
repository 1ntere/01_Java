package ncs.test1;

public class ArrayTest {

	public static void main(String[] args) {
		int [][] array = {	{12, 41, 36, 56, 21},
							{82, 10, 12, 61, 45},
							{14, 16, 18, 78, 65},
							{45, 26, 72, 23, 34}	};
		//2차원 배열에 들어있는 데이터들의 합계와 평균
		double 합 = 0;
		int count = 0;
		
		//for-each문 이중으로 작성해서 계산
		for(int[] row : array) {
			System.out.println("시작");
			for(int num : row) {
				합 += num;
				count++; //숫자를 세는 이유는 나중에 숫자의 평균을 내기 위해서
			}
			
			//평균 계산
			double 평균 = 합 / count;
			
			//출력
			System.out.println("합계 : " + 합);
			System.out.println("평균 : " + 평균);
				//=> 각 배열의 합과 평균이 출력됨
		}
	}
}
