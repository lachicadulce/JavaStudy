package quiz;

public class A09_ConditionQuiz {
	public static void main(String[] args) {
		/*
			[ �˸��� �񱳿����� �������� ]
			
			1. int�� ���� a�� 10���� ũ�� 20���� ���� �� true
			2. int�� ���� b�� ¦���� �� true
			3. int�� ���� c�� 7�� ����� �� true
			4. int�� ���� hour�� 0�̸� 24�̻��� �ƴϰ�, 12�̻��� �� true
			5. int�� ���� d�� e�� ���̰� 30�� �� true
			6. int�� ���� year�� 400���� ������ �������ų�
			   �Ǵ� 4�� ������ �������� 100���� ����������� ���� �� true //���������
			7. �μ��� ö������ 2�� ������ true
			8. �μ��� ö������ ������ 3�� ������ true
			9. boolean�� ���� powerOn�� false�� �� true
			10. ���ڿ� �������� str�� "yes"�� �� true
		*/
		int a = 8, b = 3, c = 14, hour = 15, d = 50, e = 80, year = 2021, 
				minsuAge = 23, cheolsuAge = 33, minsuBirthMonth = 9, cheolsuBirthMonth = 12;
		boolean powerOn = true;
		String str = "yes";
		
		System.out.println("1. " + (a > 10 && a < 20));
		System.out.println("2. " + (b % 2 == 0));
		System.out.println("3. " + (c % 7 == 0));
		System.out.println("4. " + (hour < 24 && hour >= 12));
		System.out.println("5. " + (Math.abs(d - e) == 30));
		System.out.println("6. " + (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)));
		System.out.println("7. " + (minsuAge - 2 == cheolsuAge));
		System.out.println("8. " + (minsuBirthMonth + 3 == cheolsuBirthMonth));
		System.out.println("9. " + !powerOn);
		
		// Ÿ�Ը��� �빮�ڷ� �����ϴ� ������ �������� �ݵ�� .equals()�� �̿��� ���ؾ� �ѵ�
		System.out.println("10. " + (str.equals("yes")));
		
		// ���ڿ��� == ���� ���ϸ� �ȵǴ� ����?
//		������ ������ == �񱳴� �� ������ ���� ���� �ּҸ� ���ϰ� �ִ����� ���Ѵ�
		String str1 = "yes";
		String str2 = "yes";
		String str3 = new String("yes");

		System.out.println("str1 == \"yes\": " + (str1 == "yes"));
		System.out.println("str1 == str2: " + (str1 == str2));
		System.out.println("str1 == str3: " + (str1 == str3));
		
//		�ҹ��ڷ� �����ϴ� Ÿ�� �������� ���ÿ� �������� ���δ�
//		�빮�ڷ� �����ϴ� Ÿ�� �������� ���ÿ��� �ּҰ��� �����ϰ� ��ü�� heap�� �����Ѵ�
//		�빮�ڷ� �����ϴ� Ÿ�� �������� �ּҰ��� ����Ǿ� �ְ�, �ű⿡ .�� ��� ���� �����͸� ������ �� �ִ�
//		������ ������ ũ��� �Ƹ�... ��ǻ�� ���� �޶��� �� �ִ�... (�߿��Ѱ� �ƴ�..)		
	}
}
