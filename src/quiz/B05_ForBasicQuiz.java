package quiz;

import java.util.Scanner;

public class B05_ForBasicQuiz {
	/*
		����ڰ� ���ڸ� �Է����� ��
		1. 10���� �Է��� ���ڱ����� ������ ���غ�����
		2. 1000���� �Է��� ���ڱ��� ������� ������ ��������
		3. 1���� �Է��� ���� ������ 5�� ����� ����غ�����
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input, sum = 0, i;
		System.out.print("input number: ");
		input = sc.nextInt();
		
//		1�� ����
		if (input > 10) {
			for (i = 10; i <= input; i++) {
				sum += i;
			}
		} else {
			for (i = 10; i >= input; i--) {
				sum += i;
			}
		}
		System.out.printf("1. ������ %d�Դϴ�.\n", sum);
		
//		1�� ���� ����� Ǯ��: ���۰� �� ���� ����
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
//		System.out.printf("10���� %d������ ������ %d�Դϴ�.\n", input, sum);		

//		2�� ����
		if (input < 1000) {
			for (i = 1000; i >= input; i--) {
				System.out.printf("2. %d\n", i);
			}
		} else {
			for (i = 1000; i <= input; i++) {
				System.out.printf("2. %d\n", i);
			}
		}

//		3�� ����
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
		
//		3�� ���� ����� Ǯ��: 1�� �����Ͽ� 5�� ��� ���.
//		if(input > 1) {
//			for (i = 1; i <= input; i++) {
//				if (i % 5 == 0) {
//					System.out.printf("1���� %d���� 5�� ����� ���: %d\n", input, i);
//				}
//			}
//		} else {
//			for (i = 1; i >= input; i--) {
//				if (i % 5 == 0) {
//					System.out.printf("1���� %d���� 5�� ����� ���: %d\n", input, i);
//				}
//			}
//		}

	}
}
