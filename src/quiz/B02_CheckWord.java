package quiz;

import java.util.Scanner;

public class B02_CheckWord {
	/*
		����ڷκ��� �ܾ �ϳ� �Է¹ް�
		ù ��° ���ڰ� �����̸鼭 ������ ��° ���ڰ� ��ġ�ϸ� "OK"�� ����ϰ�
		��ġ���� ������ "NOT OK"�� ����غ�����
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
		
//		������� ������ ���ڰ��� ��¡
		
	}
}
