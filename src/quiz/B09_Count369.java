package quiz;

import java.util.Scanner;

public class B09_Count369 {
	/*
		����ڷκ��� ������ �ϳ� �Է¹��� ��
		�ش� ���ڱ��� 369 ������ ����ȴٸ� �ڼ��� �� �� �� �ľ��ϴ��� �������
		
		(�� 33, 36, 39 ... ���� ���ڴ� ������ �ڼ�Ĩ�ϴ�.)
	 */
	public static void main(String[] args) {
		/*
			�����ذ�� - ������ Ǫ�� ���� ã�� ��
			������ - �����س� ���� �ڵ�� �����ϴ� ��
			���α׷��� ��� ���ط� - ����ϴ� �� ���� ���� ���ص�
			
			���� - �ѱ��� ������ �� �־�� ��
		 */
		Scanner sc = new Scanner(System.in);
		int num, i = 0, count = 0;
		String allNum = "";
		System.out.print("input a number >> ");
		num = sc.nextInt();
		
		while( i < num ) {
			allNum += i + 1;
			i++;
		}
		
		i = 0;
		while (i < allNum.length()) {
			char check = allNum.charAt(i);
			if (check == '3' || check == '6' || check == '9') {
				count++;
			}
			i++;
		}
		System.out.println("�� �ڼ��� ��: " + count);
		
		
//		����� ���: % 10 -> / 10 % 10 ... �ڸ�����ŭ
		int count1 = 0;
		for (i = 1; i <= num; ++i) {
			int checkNum = i;
			
			System.out.printf("[%d]\t: ", checkNum);
			while (checkNum != 0) {
				int digit = checkNum % 10;
				
				if (digit != 0 && digit % 3 == 0) {
					System.out.print("¦");
					count1++;
				}
				checkNum /= 10;
			}
			System.out.println();
		}
		System.out.printf("�ڼ��� �� %dȸ �ƽ��ϴ�.\n", count1);
	}
}
