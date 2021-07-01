
public class A03_VarTypes {
	public static void main(String[] args) {
		/*
		# ���� Ÿ��
		 - byte		(1byte)	-128 ~ +127
		 1byte => 8bit
		 0000 0000(0) ~ 1111 1111(255)
		 0000 0000	(8bit) ù ��° ��Ʈ: ��ȣ��Ʈ (������ 1)
		 byte Ÿ���� ��� ���� 0000 0000(0) ~ 0111 1111(127)
		 byte Ÿ���� ���� ���� 1000 0000(-128) ~ 1111 1111(-1)
		 (���� + 1)
		 0111 1111 + 1
		 0000 0000 + 1
		 - short	(2byte)
		 ���: 0000 0000 0000 0000(0) ~ 0111 1111 1111 1111(32767)
		 ����: 1000 0000 0000 0000(-32768) ~ 1111 1111 1111 1111(-1)
		 - char		(2byte unsigned) �� ���� �ڵ� �����
		 0 ~ 65535
		 - int		(4byte)
		 -2147483648 ~ 2147483647
		 - long		(8byte)
		 -9223372036854775807 ~ 9223372036854775806
		*/
		byte a = 10;
		short b = 10;
		char c = 10;
		int d = 10;
		long e = 10;
		
		byte _byte = 127;
		short _short = 32767;
		char _char = 65535;
		int _int = 2147483647;
		
//		����Ÿ�� ���ͷ��� �⺻������ intŸ���̴�
//		intŸ���� ������ ����� ���� ����ϰ� �ʹٸ� �ڿ� l �Ǵ� L�� �ٿ��� �Ѵ�
		long _long = 200000000000000L;
		System.out.println(a);
		
		/*
			# �Ǽ� Ÿ��
			 - float (4byte)
			 - double (8byte)
			 
			 �Ǽ��� �ַ� �׷��� ��꿡 ���ȴ�
			 �ε� �Ҽ��� ����� ����Ѵ�
		*/
		
//		�Ҽ� ���ͷ��� �⺻������ doubleŸ���̹Ƿ� doubleŸ�� �������� �ƹ� �������� ����
		double _double = 123.1234;
		
//		�Ҽ� �ڿ� f �Ǵ� F�� �����ָ� floatŸ�� ���ͷ��̶�� ǥ�ð� �ȴ�
		float _float = 123.123f;
		
		/*
			# ��/���� Ÿ��
			 - boolean
			 �� �� �ִ� ���� true/false �ۿ� ����
		*/
		boolean male = true;
		boolean female = true;
		boolean powerOn = false;
		boolean goonpil = true;
		boolean computerScience = true;
		
		/*
			# ������ Ÿ��
			 ������ Ÿ���� �빮�ڷ� �����Ѵ�
			 �ҹ��ڷ� �����ϴ� Ÿ���� ��� �⺻�� Ÿ���̶�� �θ���
			 
			 - String: ���ڿ�
			 - �� �� ��� Ŭ������..
		*/
		String welcome_message = "hello, world!";
		System.out.println(welcome_message);
		
//		char Ÿ���� ���� �ڵ带 �����ϴ� ���� Ÿ���̴�
		char ch = 97;
		System.out.println("ch�� ����� ��: " + ch);
		ch = 98;
		System.out.println("ch�� ����� ��: " + ch);
		
		char ch2 = 'x';
		int num1 = 'x';
		System.out.println("'x' char: " + ch2);
		System.out.println("'x' int: " + num1);
	}
}
