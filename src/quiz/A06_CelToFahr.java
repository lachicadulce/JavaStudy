package quiz;

import java.util.Scanner;

public class A06_CelToFahr {
	/*
		����ڷκ��� ���� �µ��� �Է¹����� ȭ�� �µ��� ��ȯ�Ͽ� ������ִ� ���α׷��� ��������
		(��ȯ ������ �˻� ���, ����� �Ҽ� ù° �ڸ�����)
	*/
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double cel, fahr;
		
		System.out.print("���� �µ�(��)�� �Է����ּ��� >> ");
		cel = sc.nextDouble();
		
		fahr = cel * 1.8 + 32;
		System.out.printf("%.1f�� �� ȭ�� %.1f�� �Դϴ�.", cel, fahr);
	}
}
