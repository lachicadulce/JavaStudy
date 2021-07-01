package quiz;

import java.util.Scanner;

public class B02_CheckWord {
	/*
		사용자로부터 단어를 하나 입력받고
		첫 번째 글자가 영어이면서 마지막 번째 글자가 일치하면 "OK"를 출력하고
		일치하지 않으면 "NOT OK"를 출력해보세요
	*/
	public static void main(String[] args) {
		System.out.print("write a word >> ");
		String word = new Scanner(System.in).nextLine();
		char first, last;
		first = word.charAt(0);
		last = word.charAt(word.length() - 1);
		
		if ((first >= 'a' && first <= 'z' || first >= 'A' && first <= 'Z') && first == last) {
			System.out.println("OK");
		} else {
			System.out.println("NOT OK");
		}	
		
//		강사님은 나눠서 각자각자 했징
		
	}
}
