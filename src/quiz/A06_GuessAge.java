package quiz;
import java.util.Scanner;
public class A06_GuessAge {
	/*
		����ڷκ��� �¾ �ؿ� ������ �⵵�� �Է¹�����
		�� ����� �ѱ� ���̸� ����Ͽ� �� ������ �˷��ִ� ���α׷��� ��������
	*/
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int birthYear, thisYear, age;
		
		System.out.println("============���� ���ϱ�����============");
		System.out.print("�¾ �ظ� �Է����ּ���: ");
		birthYear = sc.nextInt();
		
		System.out.print("������ �⵵�� �Է����ּ���: ");
		thisYear = sc.nextInt();
		
		age = thisYear - birthYear + 1;
		System.out.printf("����� %d�� �Դϴ�", age);
		System.out.println("\n====================================");
	}
}
