package ncs.test5;

public class BookArrayTest {
	public static void main(String[] args) {
		Book[] bArray = new Book[3];
		
		bArray[0] = new Book("자바의 정*", "남*성", 30000, "도우출판", 0.1);
		bArray[1] = new Book("열*강의 자바", "구*은", 29000, "프리렉", 0.1);
		bArray[2] = new Book("객*지향 JAVA8", "금*욱", 30000, "북스홈", 0.1);
		
		//for-each문을 사용해서 출력
		for (Book b : bArray) {
			System.out.println("Title : " + b.getTitle());
			System.out.println("Author : " + b.getAuthor());
			System.out.println("Price : " + b.getPrice());
			System.out.println("Publisher : " + b.getPublisher());
			System.out.println("DiscountRate : " + b.getDiscountRate());
			System.out.println("할인된 가격 : " + b.get할인가());
			System.out.println("===============");
		}
	}
}
