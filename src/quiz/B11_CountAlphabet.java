package quiz;

import java.util.Scanner;

public class B11_CountAlphabet {
	/*
		����ڷκ��� ������ �ϳ� �Է¹ް�
		�ش� ���忡 � ���ĺ��� �� �� �����ߴ��� ��� ��� ����غ�����
		(��ҹ��ڵ� ������ ��)
	 */
	/*
	# �迭 ���� ���
	1. Ÿ��[] ������ = new Ÿ��[ũ��];
	2. Ÿ��[] ������ = { ��1, ��2, ��3, ... };
	3. Ÿ��[] ������ = new Ÿ��[] { ��1, ��2, ��3, ... }
    */
	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("input a string: ");
		str = sc.nextLine();
		int[] countAlpha = new int[52];
		char[] alphabet  = new char[52];

//		ABC...abc...z���� �迭�� �ʱ�ȭ
		for(int i = 0; i < 26; i++) {
			alphabet[i] = (char) (65 + i);
			alphabet[i + 26] = (char) (97 + i);
		}
		
		for(int i = 0; i < str.length(); i++) {
			for (int j = 0; j < 52; j++) {
				if (str.charAt(i) == alphabet[j]) {
					countAlpha[j]++;
					break;
				}
			}
		}
		
		for(int i = 0; i < 52; i++) {
			System.out.printf("%c�� %d��\n", alphabet[i], countAlpha[i]);
		}
		System.out.println("��� ��");
		
		
		
//		������� Ǯ��:SYMBOLS�� �ʱ�ȭ.
		final String SYMBOLS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		
		int[] symbol_count = new int[SYMBOLS.length()];
		
		for (int i = 0, len = str.length(); i < len; ++i) {
			char ch = str.charAt(i);
			System.out.println("�̹��� �˻��� ���ڴ� " + ch + "�Դϴ�.");
			for (int j = 0, len2 = SYMBOLS.length(); j < len2; ++j) {
				if(SYMBOLS.charAt(j) == ch) {
					symbol_count[j]++;
					System.out.println("'" + ch + "'�� SYMBOLS�� " + j + "��°�� �����Ƿ� symbol_count�� " + j + "��° ���� ������ŵ�ϴ�.");
					break;
				}
			}
		}
		
		
//		2��°
		int[] upper_count = new int[26];
		int[] lower_count = new int[26];
		
		for(int i = 0, len = str.length(); i < len; ++i) {
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				lower_count[ch-'a']++;
			} else if (ch >= 'A' && ch <= 'Z') {
				upper_count[ch-'A']++;
			}
		}
		
		for (int i = 0; i < 26; ++i) {
			System.out.printf("�빮�� %c�� %d�� �����߽��ϴ�.\n", 'A' + i, upper_count[i]);
			System.out.printf("�ҹ��� %c�� %d�� �����߽��ϴ�.\n", 'a' + i, lower_count[i]);
		}
	}
}
