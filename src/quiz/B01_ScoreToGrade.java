package quiz;

import java.util.Scanner;

public class B01_ScoreToGrade {
	/*
		������ �Է¹����� ������ �ش��ϴ� �˸��� ����� ������ִ� ���α׷��� ��������
		
			90�� �̻�: A
			80�� �̻�: B
			70�� �̻�: C
			60�� �̻�: D
			�� ��: F
			
		�� ��ȿ�� ������ 0 ~ 100�� �Դϴ�
	 */
	public static void main(String[] args) {
		
//		�� �Է��� �޾��� ���� �߸��� ���� ���� �Ÿ��� ���� ����
		
		Scanner sc = new Scanner(System.in);
		double score;
		char grade = 'F';
		
		System.out.print("input your score > ");
		score = sc.nextDouble();
		
		if (score < 0 || score > 100) { 
			System.out.print("�����ȵǴ��������������");
			return;
		} else if (score >= 90) { // A
			grade = 'A';
		} else if (score >= 80) { // B
			grade = 'B';
		} else if (score >= 70) { // C
			grade = 'C';
		} else if (score >= 60) { // D
			grade = 'D';
		}
		
		System.out.printf("Your grade is %c.", grade);
		
		
		
		String msg = String.format("����� ����� %c�Դϴ�.", grade);
		System.out.println(msg);
	}
}
