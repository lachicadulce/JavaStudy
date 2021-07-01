package quiz;

import java.util.Scanner;

public class B05_Palindrome {

	/*
		����ڷκ��� �ܾ �ϳ� �Է¹ް�
		�ش� �ܾ ȸ���̶�� "PALINDROME"�� ���
		ȸ���� �ƴ϶�� "NOT PALINDROME"�� ���
		
		�� ȸ���̶� - MOM, BOB, ABBA, MADAM
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
		
//		����� ���: ������ equals�� ��
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
