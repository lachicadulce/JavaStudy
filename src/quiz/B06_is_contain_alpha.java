package quiz;

import java.util.Scanner;

public class B06_is_contain_alpha {
	
	/*
		1. ����ڰ� �Է��� ���ڿ��� ���ĺ��� ���ԵǾ� ������ true�� ���, ������ false�� ���
		2. ����ڰ� �Է��� ���ڿ��� ���ĺ����θ� �̷���� ������ true, �ƴϸ� false
		_3. ����ڰ� �Է��� ���ڿ��߿� ���Ե��� ���� ���ĺ����� ��� ����غ�����
		4. ����ڰ� ����� ���ڸ����� �̷���� ���ڿ��̶�� true, �ƴϸ� false
		   (����� ���ڿ�: ���ĺ� �ҹ���, ����, _, $, ù��° ���ڿ� ���� �Ұ�)
	*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.print("���ڿ��Է�: ");
		boolean alphaFlag = false;
		boolean allAlphaFlag = true;
		String include = "", notInclude = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		str = sc.nextLine();
		
		for (int i = 0; i < str.length() /* && !alphaFlag */; i++) { // ���⿡ ������ �־��ָ鼭 break;���� ����
//			1��
			if (!alphaFlag && (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
				alphaFlag = true;
//				break;
			}
//			2��
			if (!(str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
				allAlphaFlag = false;
			}
//			3��
			include += str.charAt(i);
		}
		System.out.println("1. ���ĺ��� �����ΰ���? " + alphaFlag);
		System.out.println("2. ���ĺ����θ� �̷���� �ֳ���? " + allAlphaFlag);
		
//		3�� include: ���ڿ��� ���Ե� ���ĺ��� ���� ���ڿ�, notInclude: ��� �빮�ڼҹ��� ���ĺ��� ����� ���ڿ�
		alphaFlag = false;
		System.out.println("3. ������ ���� ���ĺ��� �����ΰ���? ");
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
//		4. ����ڰ� ����� ���ڸ����� �̷���� ���ڿ��̶�� true, �ƴϸ� false
//		   (����� ���ڿ�: ���ĺ� �ҹ���, ����, _, $, ù��° ���ڿ� ���� �Ұ�)
		
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
		System.out.println("4. ����� ���ڸ����� �̷���� �ֳ���? " + alphaFlag);
		
//		����� Ǯ�� ���: ���� ���� ������ �ּ� ���.
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
			System.out.println("�ùٸ� ���ڿ��Դϴ�. " + true);
		} else {
			System.out.println("������ ���� ���ڿ��Դϴ�. " + false);
		}
		
		
		
		
	}
}
