package quiz;

import java.util.Scanner;

public class B07_Prime {
	/*
		����ڷκ��� ����(���)�� �Է¹�����
		1���� �Է��� ���� ���̿� �����ϴ� �Ҽ��� ��� ����غ�����.
		(������ �Է��ϸ� �ٽ� ����� �Է��ϰ� �ϱ�)
		
		�� �Ҽ�: ������ �������� ���� 1�� �ڱ� �ڽŹۿ� ���� ����
			2, 3, 5, 7, 11, 13 ...
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		boolean primeFlag = true;
		
		for (; true;) {
			System.out.print("����� �ϳ� �Է� > ");
			num = sc.nextInt();
			if ( num > 0) {
				break;
			}
		}
		System.out.print("�Ҽ��� > ");
		if (num >= 2) {
			System.out.print("2 ");
			for (int i = 3; i <= num; i+=2) {
				for (int j = 3; j <= Math.sqrt(i); j+=2) {
					if (i%j == 0 && i != j) {
						primeFlag = false;
						break;
					}
				}
				if (primeFlag) {
					System.out.printf("%d ", i);
				} else {
					primeFlag = true;
				}
			}
		}
		
		
		
//		����� ���: �� �������� ������ �������� ���� 2��
		for (int chkNum = 2; chkNum <= num; ++chkNum) {
			int count = 0;
			for (int divNum = 1; divNum <= chkNum; ++divNum) {
				if(chkNum % divNum == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.println(chkNum);
			}
		}
		
	}
}
