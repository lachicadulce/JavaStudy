package quiz;
import java.util.Scanner;

public class quiz_B09_31Game {
	/*
		# 31 ������ ��������
		1. ��ǻ�Ϳ� ����� �����ư��鼭 ���ڸ� �����ؾ� �Ѵ�.
			(1, 2, 3 �ۿ� ������ �� ����)
		2. ��ǻ�ʹ� �������� ���ڸ� �����Ѵ�.
		3. ������ �������� �����Ѵ�
		4. �������� 31 �̻��� ���ڸ� �θ��� �÷��̾ �й��Ѵ�.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = (int)(Math.random() * 2);
		int sum = 0, num;
		if (first == 0) {
			System.out.println("you first!!");
		} else {
			System.out.println("computer first!!");
			num = (int)(Math.random() * 3 + 1);
			sum += num;
			System.out.printf("[computer] num, sum: %d, %d\n", num, sum);
		}
		
		while (true) {
			System.out.print("1, 2, 3 ? ");
			num = sc.nextInt();
			if (num != 1 && num != 2 && num != 3) {
				continue;
			}
			sum += num;
			System.out.printf("[you] num, sum: %d, %d\n", num, sum);
			if (sum >= 31) {
				System.out.println("You Lose!!");
				break;
			}
			
			num = (int)(Math.random() * 3 + 1);
			sum += num;
			System.out.printf("[computer] num, sum: %d, %d\n", num, sum);
			if (sum >= 31) {
				System.out.println("You Win!!");
				break;
			}
		}
		

	}
}
