import java.util.Scanner;

public class B09_Count369 {
	/*
		����ڷκ��� ������ �ϳ� �Է¹��� ��
		�ش� ���ڱ��� 369 ������ ����ȴٸ� �ڼ��� �� �� �� �ľ��ϴ����������
		
		(�� 33, 36, 39 ...���� ���ڴ� ������Ĩ�ϴ�.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, i = 0, count = 0;
		String allNum = "";
		System.out.print("input a number >> ");
		num = sc.nextInt();
		
		while (i < num) {
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
	}
}
