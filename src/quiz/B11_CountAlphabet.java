package quiz;

import java.util.Scanner;

public class B11_CountAlphabet {
	/*
		사용자로부터 문장을 하나 입력받고
		해당 문장에 어떤 알파벳이 몇 번 등장했는지 세어서 모두 출력해보세요
		(대소문자도 구분할 것)
	 */
	/*
	# 배열 선언 방법
	1. 타입[] 변수명 = new 타입[크기];
	2. 타입[] 변수명 = { 값1, 값2, 값3, ... };
	3. 타입[] 변수명 = new 타입[] { 값1, 값2, 값3, ... }
    */
	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("input a string: ");
		str = sc.nextLine();
		int[] countAlpha = new int[52];
		char[] alphabet  = new char[52];

//		ABC...abc...z까지 배열에 초기화
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
			System.out.printf("%c는 %d번\n", alphabet[i], countAlpha[i]);
		}
		System.out.println("출력 됨");
		
		
		
//		강사님의 풀이:SYMBOLS를 초기화.
		final String SYMBOLS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		
		int[] symbol_count = new int[SYMBOLS.length()];
		
		for (int i = 0, len = str.length(); i < len; ++i) {
			char ch = str.charAt(i);
			System.out.println("이번에 검사할 문자는 " + ch + "입니다.");
			for (int j = 0, len2 = SYMBOLS.length(); j < len2; ++j) {
				if(SYMBOLS.charAt(j) == ch) {
					symbol_count[j]++;
					System.out.println("'" + ch + "'는 SYMBOLS의 " + j + "번째에 있으므로 symbol_count의 " + j + "번째 값을 증가시킵니다.");
					break;
				}
			}
		}
		
		
//		2번째
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
			System.out.printf("대문자 %c는 %d번 등장했습니다.\n", 'A' + i, upper_count[i]);
			System.out.printf("소문자 %c는 %d번 등장했습니다.\n", 'a' + i, lower_count[i]);
		}
	}
}
