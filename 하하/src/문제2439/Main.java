package ¹®Á¦2439;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		for (int i = line; i > 0; i--) {
			for (int blank = i-1; blank > 0; blank--) {
				System.out.print(" ");
			}
			for (int star = 1; star <= (line+1-i); star++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
