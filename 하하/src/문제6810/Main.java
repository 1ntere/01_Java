package 문제6810;
//입력을 그대로 console에 넣어서 되는지 확인해보자
//처음에 내 마음대로 948을 입력했다가 내 코드에서 잘 실행되는데? 라고 생각했는데
//입력이 9 enter 4 enter 8 enter 였음
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//9780921418948
		Scanner sc = new Scanner(System.in);
		//입력받은 숫자가 13자리 숫자이면 intIsbn으로 저장
		//입력받은 문자가 10자리+3자리
		//9
		//4
		//8
		String isbn_9 = "9780921418";
		String isbn_10 = sc.nextLine();
		String isbn_11 = sc.nextLine();
		String isbn_12 = sc.nextLine();
		String isbn = isbn_9 + isbn_10 + isbn_11 + isbn_12 ;

		int sumIsbn = 0;
		for (int i = 0; i < isbn.length(); i += 2) {
			char isbnOddChar = isbn.charAt(i);
			String isbnOddStr = Character.toString(isbnOddChar);
			int isbnOddInt = Integer.parseInt(isbnOddStr);
			sumIsbn += isbnOddInt;
		}
		for (int j = 1; j < isbn.length()-1; j += 2) {
			char isbnEvenChar = isbn.charAt(j);
			String isbnEvenStr = Character.toString(isbnEvenChar);
			int isbnEvenInt = Integer.parseInt(isbnEvenStr);
			sumIsbn += isbnEvenInt * 3;
		}
		System.out.println("The 1-3-sum is " + sumIsbn);
		
		
		
		/*
		실행되는 코드
		String isbn = sc.nextLine();
		
		//9780921418948
		int sumIsbn = 0;
		for (int i = 0; i < isbn.length(); i += 2) {
			char isbnOddChar = isbn.charAt(i);
			String isbnOddStr = Character.toString(isbnOddChar);
			int isbnOddInt = Integer.parseInt(isbnOddStr);
			sumIsbn += isbnOddInt;
		}
		for (int j = 1; j < isbn.length(); j += 2) {
			char isbnEvenChar = isbn.charAt(j);
			String isbnEvenStr = Character.toString(isbnEvenChar);
			int isbnEvenInt = Integer.parseInt(isbnEvenStr);
			sumIsbn += isbnEvenInt * 3;
		}
		System.out.println("The 1-3-sum is " + sumIsbn);
		 */
		
		
		
		/*
		int intIsbn = sc.nextInt();
		String strIsbn = Integer.toString(intIsbn);
		*/
		
		//홀수번째는 *1, 짝수번째는 *3을 한 다음 모두 더한 것이 isbn, 10의 배수여야 함
		/*
		int sumIsbn = isbn.charAt(0)*1 + isbn.charAt(1)*3 + 
				isbn.charAt(2)*1 + isbn.charAt(3)*3 + 
				isbn.charAt(4)*1 + isbn.charAt(5)*3 + 
				isbn.charAt(6)*1 + isbn.charAt(7)*3 + 
				isbn.charAt(8)*1 + isbn.charAt(9)*3 + 
				isbn.charAt(10)*1 + isbn.charAt(11)*3 + 
				isbn.charAt(12)*1;
		System.out.println("The 1-3-sum is " + sumIsbn);
		*/
		
		
		/*
		//int sumIsbn = isbn.charAt(0);
		
		char isbn1 = isbn.charAt(0);
		System.out.println(isbn1);
		String isbn1_0 = Character.toString(isbn1);
		System.out.println(isbn1_0);
		int isbn1_1 = Integer.parseInt(isbn1_0);
		System.out.println(isbn1_1);
		
		
		System.out.println(isbn.charAt(0));
		System.out.println(isbn.charAt(0)*1);
		
		//System.out.println("The 1-3-sum is " + sumIsbn);
		*/
	}
}
