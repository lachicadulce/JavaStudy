package quiz;

import java.util.Scanner;

public class A10_ConditionQuiz2 {
	public static void main(String[] args) {
		/*
			[ 알맞은 조건식을 만들어보세요 ]
			
				1. char형 변수 a가 'q'또는 'Q'일 때 true
				2. char형 변수 b가 공백이나 탭이 아닐 때 true
				3. char형 변수 c가 문자('0' ~ '9')일 때 true
				4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true
				
				※ 유니코드 표 검색
				5. char형 변수 e가 한글일 때 true
				6. char형 변수 f가 일본어일 때 true
				7. 사용자가 입력한 문자열이 exit일 때 true
		*/
		Scanner sc = new Scanner(System.in);
		
		char a = 'q';
		char b = '	';
		char c = '6';
		char d = 'w';
		char e = 'ㄱ';
		char f = 'ん';
		String input;

//		System.out.println("1. " + ((int)a == 81 || (int)a == 113));
		System.out.println("1. " + (a == 'q' || a == 'Q'));
		
		System.out.println("2. " + (b != ' ' && b != '\t'));
		System.out.println("3. " + (c >= '0' && c <= '9'));
		System.out.println("4. " + (d >= 'A' && d <= 'Z' ||
				d >= 'a' && d <= 'z'));
		System.out.println("5. " + (e >= 4352 && e <= 4607 ||
				e >= 44032 && e <= 55215 || e >= 12593 && e <= 12687)); //16진수 0x붙여서.. 0x3041
		System.out.println("6. " + (f >= 12352 && f <= 12543 ||
				
				
				
				f >= 12784 && f <= 12799)); //'가' ~ '힣'이 보
		System.out.print("문자열을 입력하세요 >> ");
		input = sc.nextLine();
		System.out.println("7. " + (input.equals("exit")));
	}
}
