import java.util.Scanner;

public class A08_Scanner {
	/*
		# java.util.Scanner Ŭ����
		
		 - ���α׷��� �ܺηκ��� �Է��� ���� �� �ִ� ��ɵ��� �����Ǿ� �ִ� Ŭ����
		 - ��𿡼� �Է��� ������ ������ �ڿ� �پ��� ������ �Է¹��� �� �ִ�
		 ����/����/Ű����
		 - �ַܼκ��� �Է¹ް� ���� ���� System.in�� ����Ѵ�
		
	*/
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // ctrl + shift + O : �ڵ� import
		/*
		  - new�� ���ο� ��ĳ�ʸ� ������ �� ����Ѵ�
		  - new �� �� ��ĳ�ʿ� ������ �Է� ���(InputStream)�� ����ϴ� ��ĳ�ʸ� �����Ѵ�
		  - ��, System.in���κ��� �Է¹޴� ���ο� ��ĳ�ʸ� �ϳ� �����Ѵ�
		  - �� �� Scanner Ÿ�� ���� sc�� ������ ��ĳ�ʸ� ��� ���´�
		*/
		
		/*
		   # Scanner Ŭ������ nextInt()
		    - �������� ������ ������ �ϳ� ������
		    - ��ĳ�ʿ� ���� ���� �ƹ��͵� ���� ���� ���缭 �Է��� ��� ��ٸ���
		    - ������ �Է¹޾ƾ� �Ѵ�
		*/
		System.out.print("�ƹ� ������ �Է��غ����� > ");
		int num = sc.nextInt();
		
		System.out.println("����� �Է��� ���� " + num + "�Դϴ�.");
		
		System.out.print("��� � �ʿ��ϼ���? ");
		num = sc.nextInt();
		
		System.out.println(num * 500 + "�� �Դϴ�.");
		
//		�Ǽ��� �Է¹��� ���� nextDouble()�� ����Ѵ�
		System.out.print("�̹����� �Ҽ��� �Է��غ����� >> ");
		double d = sc.nextDouble();
		
		System.out.printf("�Է��� �Ҽ��� %.5f�Դϴ�.", d);
		System.out.println();
		
//		���ڿ��� �ƴ� ���� �Է¹��� ��ĳ�ʿ��� '\n'�� �����ְ� �ȴ�
//		13'\n'
		sc.nextLine(); // ��ĳ�ʿ� �����ִ� '\n'����
		
//		���ڿ��� �Է¹��� ���� next() �Ǵ� nextLine()�� ����Ѵ�
//		next()�� ��� ������ �������� �Է¹ް�, nextLine()�� '\n'�� �������� �Է¹޴´�
		System.out.print("�̹����� ���ڿ��� �Է��غ����� >> ");
		String str = sc.nextLine();
		System.out.println("you : " + str);
	}
}