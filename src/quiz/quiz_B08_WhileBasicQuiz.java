package quiz;

public class quiz_B08_WhileBasicQuiz {
	/*
		while���� �̿��Ͽ� ������ ���Ͻÿ�.
			1. 1���� 100���̿� �ִ� 3�� ����� ����
			2. 355���� 237���� ���
			3. continue�� �ݵ�� ����Ͽ� 3000���� 5000������ 7�� ����� ����ϱ�
			4. 1���� 200������ ���� �� 2�� ����� �ƴϰ� 3�� ����� �ƴ� ���ڵ��� ����
	 */
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while (i <= 100) {
			if (i % 3 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("1. �� ����: " + sum);
		
		System.out.print("2. ");
		i = 355;
		while ( i >= 237) {
			System.out.printf("%d ", i);
			i--;
		}
		
		System.out.print("\n3. ");
		i = 3000;
		while (i <= 5000) {
			if (i % 7 != 0) {
				i++;
				continue;
			}
			System.out.printf("%d ", i);
			i++;
		}
		
		i = 1;
		sum = 0;
		
		while (i <= 200) {
			if (i % 2 != 0 && i % 3 != 0) {
				sum += i;
			}
			i++;
		}
		System.out.print("\n4. �� ��: " + sum);
	}
}
