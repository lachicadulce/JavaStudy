package quiz;

import java.util.Scanner;

public class D07_CheckValidSocialNumber {

	/*
	 	사용자가 주민등록번호를 입력하면 그 주민등록번호가 유효한지 검사하는 프로그램을 만들어보세요
	 	맨앞 2자리 숫자
	 	월 자리에 01~12이내의 숫자
	 	일 자리에 01~31이내의 숫자
	 	(1, 3, 5, 7, 8, 10, 12월이면 31 / 4, 6, 9, 11월이면 30/2월은 윤년일때 29 아니면 28)
	 	7번째 자리 '-'
	 	뒷자리 전부 숫자
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		String[] numbers;
		
		while(true) {
			System.out.print("주민등록번호를 입력하세요: ");
			input = sc.next();
			numbers = input.split("-");
			if (input.length() != 14 || input.charAt(6) != '-') {
				System.out.println("- 또는 길이 오류.");
				continue;
			}
			if (!checkNum(numbers[0].toCharArray()) || !checkNum(numbers[1].toCharArray())) {
				System.out.println("숫자가 아닌 문자 입력 오류.");
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
					System.out.println("성별 인식 오류");
					continue;
				}
				if (!checkMonthDay(year, mon, day)) {
					System.out.println("날짜 입력 오류.");
					continue;
				}
			}
			System.out.println("올바른 주민등록번호입니다.");
			break;
		}
		
	}
	
	// 전부 숫자인지 체크
	static boolean checkNum(char[] last) {
		for (char c : last) {
			if (!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}
	
	// 올바른 날짜인지 체크
	static boolean checkMonthDay(int year, int mon, int day) {
		if (mon < 1 || mon > 12) {
			return false;
		}
		// set 에 넣어두고 contains사용해보기
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
	
	// 윤년 체크 함수
	static boolean checkLeapYear(int year) {
		/*
		 4로 나누어 떨어지는해
		 4, 100으로 나누어 떨어지는 해는 평년
		 4, 100, 400으로 나누어 떨어지는 해는 윤년
		 */
		return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
	}
}
