package quiz;

import java.util.Scanner;

public class B01_AppleQuiz {
	/*
		����� 10���� ���� �� �ִ� �ٱ��ϰ� �ִ�.
		
		����ڰ� �����ϰ� ���� ����� ������ �Է��ϸ�
		����� ��� ��� ���� �ʿ��� �ٱ����� ������ �˷��ִ� ���α׷��� ��������.
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int apple_cnt, basket_cnt;
//		basket_size�� double�� �ؼ��� ����
		System.out.print("How many apple do yo want? ");
		apple_cnt = sc.nextInt();
		
		if (apple_cnt < 0) {
			System.out.println("�ùٸ� ����� ������ �ƴϿ���.");
			return;
		}
		basket_cnt = apple_cnt / 10;
		if (apple_cnt % 10 > 0) {
			basket_cnt ++;
		}
		
		System.out.println("You need " + basket_cnt + "baskets");
		
//		Math.ceil(a): a�� �Ҽ� ù° �ڸ����� �ø���
//		Math.floor(a): a�� �Ҽ� ù° �ڸ����� ������
		System.out.println("You need " + (int)Math.ceil(basket_cnt) + "�� �Դϴ�.");
	}
}
