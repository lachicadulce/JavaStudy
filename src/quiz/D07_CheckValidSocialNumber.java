package quiz;

import java.util.Scanner;

public class D07_CheckValidSocialNumber {

	/*
	 	����ڰ� �ֹε�Ϲ�ȣ�� �Է��ϸ� �� �ֹε�Ϲ�ȣ�� ��ȿ���� �˻��ϴ� ���α׷��� ��������
	 	�Ǿ� 2�ڸ� ����
	 	�� �ڸ��� 01~12�̳��� ����
	 	�� �ڸ��� 01~31�̳��� ����
	 	(1, 3, 5, 7, 8, 10, 12���̸� 31 / 4, 6, 9, 11���̸� 30/2���� �����϶� 29 �ƴϸ� 28)
	 	7��° �ڸ� '-'
	 	���ڸ� ���� ����
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		String[] numbers;
		
		while(true) {
			System.out.print("�ֹε�Ϲ�ȣ�� �Է��ϼ���: ");
			input = sc.next();
			numbers = input.split("-");
			if (input.length() != 14 || input.charAt(6) != '-') {
				System.out.println("- �Ǵ� ���� ����.");
				continue;
			}
			if (!checkNum(numbers[0].toCharArray()) || !checkNum(numbers[1].toCharArray())) {
				System.out.println("���ڰ� �ƴ� ���� �Է� ����.");
				continue;
			} else {
				int mon = Integer.parseInt(numbers[0].substring(2,4));
				int day = Integer.parseInt(numbers[0].substring(4,6));
				int year;
				char century = numbers[1].charAt(0);
				if (century == '1' || century == '2') {
					year = Integer.parseInt("19" + numbers[0].substring(0, 2));
				} else if (century == '3' || century == '4') {
					year = Integer.parseInt("20" + numbers[0].substring(0, 2));
				} else {
					System.out.println("���� �ν� ����");
					continue;
				}
				if (!checkMonthDay(year, mon, day)) {
					System.out.println("��¥ �Է� ����.");
					continue;
				}
			}
			System.out.println("�ùٸ� �ֹε�Ϲ�ȣ�Դϴ�.");
			break;
		}
		
	}
	
	// ���� �������� üũ
	static boolean checkNum(char[] last) {
		for (char c : last) {
			if (!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}
	
	// �ùٸ� ��¥���� üũ
	static boolean checkMonthDay(int year, int mon, int day) {
		if (mon < 1 || mon > 12) {
			return false;
		}
		// set �� �־�ΰ� contains����غ���
		if (mon == 4 || mon == 6 || mon == 9 || mon == 11) {
			if (day < 1 || day > 30) {
				return false;
			}
		} else if (mon == 2) {
			if (checkLeapYear(year)) {
				if (day < 1 || day > 29) {
					return false;
				}
			} else {
				if (day < 1 || day > 28) {
					return false;
				}
			}
		} else {
			if (day < 1 || day > 30) {
				return false;
			}
		}
		return true;
	}
	
	// ���� üũ �Լ�
	static boolean checkLeapYear(int year) {
		/*
		 4�� ������ ����������
		 4, 100���� ������ �������� �ش� ���
		 4, 100, 400���� ������ �������� �ش� ����
		 */
		return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
	}
}
