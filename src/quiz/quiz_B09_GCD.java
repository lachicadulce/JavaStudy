package quiz;
import java.util.Scanner;

public class quiz_B09_GCD {
	/*
	 	�� ���ڸ� �Է¹ް� �� ������ �ִ������� ���غ�����
	 	
	 	# �ִ�����
	 		- �� ������ ����� �� ���� ū �����
	 		
	 		20 [1, 2, 4, 5, 10, 20]
	 		50 [1, 2, 5, 10, 25, 50]
	 		
	 		�� ��� 10�� �ִ� �����
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		int answer = 0, i = 1;

		System.out.print("input 1st num: ");
		num1 = sc.nextInt();
		System.out.print("input 2nd num: ");
		num2 = sc.nextInt();
		
		while (i <= (num1 > num2 ? num2 : num1)) {
			if (num1 % i == 0 && num2 % i == 0) {
				answer = i;
			}
			i++;
		}
		System.out.printf("num1: %d, num2: %d, answer: %d", num1, num2, answer);
	}
}
