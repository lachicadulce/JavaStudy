package quiz;

import java.util.Scanner;

public class B05_ForBasicQuiz {
	/*
		사용자가 숫자를 입력했을 때
		1. 10부터 입력한 숫자까지의 총합을 구해보세요
		2. 1000부터 입력한 숫자까지 순서대로 나오게 만들어보세요
		3. 1부터 입력한 숫자 사이의 5의 배수만 출력해보세요
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input, sum = 0, i;
		System.out.print("input number: ");
		input = sc.nextInt();
		
//		1번 문제
		if (input > 10) {
			for (i = 10; i <= input; i++) {
				sum += i;
			}
		} else {
			for (i = 10; i >= input; i--) {
				sum += i;
			}
		}
		System.out.printf("1. 총합은 %d입니다.\n", sum);
		
//		1번 문제 강사님 풀이: 시작과 끝 변수 지정
//		int start, end;
//		if(input>10) {
//			start = 10;
//			end = input;
//		} else {
//			start = input;
//			end = 10;
//		}
//		for (i = start; i <= end; ++i) {
//			sum += i;
//		}
//		System.out.printf("10부터 %d까지의 총합은 %d입니다.\n", input, sum);		

//		2번 문제
		if (input < 1000) {
			for (i = 1000; i >= input; i--) {
				System.out.printf("2. %d\n", i);
			}
		} else {
			for (i = 1000; i <= input; i++) {
				System.out.printf("2. %d\n", i);
			}
		}

//		3번 문제
		if (input > 0) {
			for (i = 5; i < input; i += 5) {
				System.out.printf("3. %d\n", i);
			}
		} else if (input == 0) {
			System.out.println("3. 0");
		} else {
			for (i = 5; i > input; i -= 5) {
				System.out.printf("3. %d\n", i);
			}
		}
		
//		3번 문제 강사님 풀이: 1씩 증감하여 5의 배수 출력.
//		if(input > 1) {
//			for (i = 1; i <= input; i++) {
//				if (i % 5 == 0) {
//					System.out.printf("1부터 %d까지 5의 배수만 출력: %d\n", input, i);
//				}
//			}
//		} else {
//			for (i = 1; i >= input; i--) {
//				if (i % 5 == 0) {
//					System.out.printf("1부터 %d까지 5의 배수만 출력: %d\n", input, i);
//				}
//			}
//		}

	}
}
