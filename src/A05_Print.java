
public class A05_Print {
	public static void main(String[] args) {
		/*
		# �ֿܼ� ����ϴ� �Լ���
		 1. print()
		  - ���� �ڵ����� �ٲ����� �ʴ� ���� �⺻ ��� �Լ�
		 2. println()
		  - ���� �ڵ����� �ٲ��ָ� ����ϴ� �Լ�
		  - ()�� ������ ������ �� �ڿ� '\n'�� �߰��Ͽ� ����Ѵ�
		  - ()�� �ƹ��͵� �������� ������ '\n'�� ����Ѵ�
		*/
		int apple = 15;
		
		System.out.print("Hello!\n");
		System.out.print("Hello!\n");
		System.out.print("Hello!\n");

		System.out.print("���: ");
		System.out.println(apple + "��");
		
		System.out.println();
		
		System.out.println("Hello!");
		System.out.println("Hello!");
		System.out.println("Hello!");
		
		/*
			3. printf()
			 - ������ �̿��� ���ϴ� ���¸� ���� ����� ����ϴ� �Լ�
			 - ����� ���¸� �̸� �����, ���� ���� �ڸ��� ���� ������� ä���� ����Ѵ�
			 - ���ڿ��� +�� �̾���̴� ��ĺ��� ���� ��쿡 ����Ѵ�
			 - ���� �ڵ����� �ٲ����� �ʴ´�
			 
			 �� ���� ������ ����
			  %d: �ش� �ڸ��� ������ �������� 10������ ������ش� (decimal)
			  %x, %X: �ش� �ڸ��� ������ �������� 16������ ������ش� (hexa decimal)
			  %o: �ش� �ڸ��� ������ �������� 8������ ������ش� (octal)
			  %s: ���ڿ�
			  %c: ����
			  %f: �Ǽ�
		*/
		
		int year = 2021, month = 5, day = 10,
				hour = 15, minute = 50, second = 13;
		System.out.print(year + "��" + month + "��" + day + "��\t");
		System.out.println(hour + ":" + minute + ":" + second);
		
		System.out.printf("%d�� %d�� %d��\t%d:%d:%d\n", year, month, day, hour, minute, second);

		System.out.printf("%d�� 10������ ����ϸ� %d�Դϴ�. \n", year, year);
		System.out.printf("%d�� 8������ ����ϸ� %o�Դϴ�. \n", year, year);
		System.out.printf("%d�� 16������ ����ϸ� %x�Դϴ�. \n", year, year);
		System.out.printf("%d�� 16������ ����ϸ� %X�Դϴ�. \n", year, year);
		
		/*
			�� ���� ���� �ɼǵ�
			
			 1. %����d, %����s ...
			  - �ڸ����� ���ڸ�ŭ Ȯ���ϸ鼭 ����Ѵ�
			  
			 2. %-����d, ...
			  - �ڸ����� ���ڸ�ŭ Ȯ���ϸ鼭 ���� �����Ͽ� ����Ѵ�
			  
			 3. %d0����d
			  - �ڸ����� ���ڸ�ŭ Ȯ���ϰ� ���ڸ��� 0�� ä�� ����Ѵ�
			  
			 4. %+d
			  - ��� �տ��� ��ȣ�� �ٿ��� ����Ѵ�
			  
			 5. %.����f
			  - �Ҽ��� �ڸ����� �����Ѵ�
		*/
		System.out.printf("%20d\n", 2000);
		System.out.printf("%20d\n", 200000);
		System.out.printf("%-15s: %d\n", "Price", 2000);
		System.out.printf("%15s: %d\n\n", "Price", 2000);
		

		System.out.printf("%-15s: %7d\n", "Price", 2000);
		System.out.printf("%-15s: %7d\n", "Income", 150000);
		System.out.printf("%-15s: %7d\n", "Tax", 27000);

		System.out.printf("%03d\n", 1);
		System.out.printf("%03d\n", 2);
		System.out.printf("%03d\n", 11);
		System.out.printf("%03d\n", 15);
		
		System.out.println("-----------------------------------------");

		System.out.printf("%+d\n", -50);
		System.out.printf("%+d\n", 50);

		System.out.printf("%0+20.5f\n", 15.123456); //���հ���
		System.out.printf("%.4f\n", 15.123456); //�ݿø� �߻�
		System.out.printf("%.3f\n", 15.123456);
		System.out.printf("%.2f\n", 15.123456);
		System.out.printf("%.30f\n", 15.123456); //�ڸ��� �ø��⵵ ����
	}
}
