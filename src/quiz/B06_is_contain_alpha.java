package quiz;

import java.util.Scanner;

public class B06_is_contain_alpha {
	
	/*
		1. 사용자가 입력한 문자열에 알파벳이 포함되어 있으면 true를 출력, 없으면 false를 출력
		2. 사용자가 입력한 문자열이 알파벳으로만 이루어져 있으면 true, 아니면 false
		_3. 사용자가 입력한 문자열중에 포함되지 않은 알파벳들을 모두 출력해보세요
		4. 사용자가 허락한 문자만으로 이루어진 문자열이라면 true, 아니면 false
		   (허락한 문자열: 알파벳 소문자, 숫자, _, $, 첫번째 문자에 숫자 불가)
	*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.print("문자열입력: ");
		boolean alphaFlag = false;
		boolean allAlphaFlag = true;
		String include = "", notInclude = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		str = sc.nextLine();
		
		for (int i = 0; i < str.length() /* && !alphaFlag */; i++) { // 여기에 조건을 넣어주면서 break;생략 가능
//			1번
			if (!alphaFlag && (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
				alphaFlag = true;
//				break;
			}
//			2번
			if (!(str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
				allAlphaFlag = false;
			}
//			3번
			include += str.charAt(i);
		}
		System.out.println("1. 알파벳이 포함인가요? " + alphaFlag);
		System.out.println("2. 알파벳으로만 이루어져 있나요? " + allAlphaFlag);
		
//		3번 include: 문자열에 포함된 알파벳만 모은 문자열, notInclude: 모든 대문자소문자 알파벳이 저장된 문자열
		alphaFlag = false;
		System.out.println("3. 사용되지 않은 알파벳은 무엇인가요? ");
		for (int i = 0; i < notInclude.length(); i++) {
			for (int j = 0; j < include.length(); j++) {
				if (notInclude.charAt(i) == include.charAt(j)) {
					alphaFlag = true;
					break;
				}
			}
			if (alphaFlag) {
				alphaFlag = false;
				continue;
			}
			System.out.print(notInclude.charAt(i));
		}
		System.out.println();
//		4. 사용자가 허락한 문자만으로 이루어진 문자열이라면 true, 아니면 false
//		   (허락한 문자열: 알파벳 소문자, 숫자, _, $, 첫번째 문자에 숫자 불가)
		
		alphaFlag = true;
		
		for (int i = 0; i < str.length(); i++) {
			if (i == 0 && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				alphaFlag = false;
				break;
			} else if (!(str.charAt(i) >= 'a' && str.charAt(i) <= 'z' ||
					str.charAt(i) >= '0' && str.charAt(i) <= '9' ||
					str.charAt(i) == '_' || str.charAt(i) == '$')) {
				alphaFlag = false;
				break;
			}
		}
		System.out.println("4. 허락한 문자만으로 이루어져 있나요? " + alphaFlag);
		
//		강사님 풀이 방법: 따로 빼서 변수로 둬서 계산.
		boolean first_letter_check = true, letter_check = true;
		first_letter_check = !(str.charAt(0) >= '0' && str.charAt(0) <= '9');
		for (int i = 0; i < str.length(); ++i) {
			char ch = str.charAt(i);
			
			if (!(ch >= '0' && ch <= '9' || ch >= 'a' && ch <= 'z' || ch == '_' || ch == '$')) {
				letter_check = false;
				break;
			}
		}
		if (first_letter_check && letter_check) {
			System.out.println("올바른 문자열입니다. " + true);
		} else {
			System.out.println("허용되지 않은 문자열입니다. " + false);
		}
		
		
		
		
	}
}
