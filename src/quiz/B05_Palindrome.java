package quiz;

import java.util.Scanner;

public class B05_Palindrome {

	/*
		사용자로부터 단어를 하나 입력받고
		해당 단어가 회문이라면 "PALINDROME"을 출력
		회문이 아니라면 "NOT PALINDROME"을 출력
		
		※ 회문이란 - MOM, BOB, ABBA, MADAM
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word;
		
		System.out.print("input a word >> ");
		word = sc.next();
		
		for (int i = 0; i < word.length() / 2; i++) {
			if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
				System.out.println("NOT PALINDROME");
				return;
			}
		}
		System.out.println("PALINDROME");
		
//		강사님 방법: 뒤집고 equals로 비교
		String reverse = "";
		for (int i = word.length() - 1; i > -1; --i) {
			reverse += word.charAt(i);
		}
		if (word.equals(reverse)) {
			System.out.println("PALINDROME");
		} else {
			System.out.println("NOT PALINDROME");
		}
	}
}
