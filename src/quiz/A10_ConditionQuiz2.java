package quiz;

import java.util.Scanner;

public class A10_ConditionQuiz2 {
	public static void main(String[] args) {
		/*
			[ �˸��� ���ǽ��� �������� ]
			
				1. char�� ���� a�� 'q'�Ǵ� 'Q'�� �� true
				2. char�� ���� b�� �����̳� ���� �ƴ� �� true
				3. char�� ���� c�� ����('0' ~ '9')�� �� true
				4. char�� ���� d�� ������(�빮�� �Ǵ� �ҹ���)�� �� true
				
				�� �����ڵ� ǥ �˻�
				5. char�� ���� e�� �ѱ��� �� true
				6. char�� ���� f�� �Ϻ����� �� true
				7. ����ڰ� �Է��� ���ڿ��� exit�� �� true
		*/
		Scanner sc = new Scanner(System.in);
		
		char a = 'q';
		char b = '	';
		char c = '6';
		char d = 'w';
		char e = '��';
		char f = '��';
		String input;

//		System.out.println("1. " + ((int)a == 81 || (int)a == 113));
		System.out.println("1. " + (a == 'q' || a == 'Q'));
		
		System.out.println("2. " + (b != ' ' && b != '\t'));
		System.out.println("3. " + (c >= '0' && c <= '9'));
		System.out.println("4. " + (d >= 'A' && d <= 'Z' ||
				d >= 'a' && d <= 'z'));
		System.out.println("5. " + (e >= 4352 && e <= 4607 ||
				e >= 44032 && e <= 55215 || e >= 12593 && e <= 12687)); //16���� 0x�ٿ���.. 0x3041
		System.out.println("6. " + (f >= 12352 && f <= 12543 ||
				
				
				
				f >= 12784 && f <= 12799)); //'��' ~ '�R'�� ��
		System.out.print("���ڿ��� �Է��ϼ��� >> ");
		input = sc.nextLine();
		System.out.println("7. " + (input.equals("exit")));
	}
}
