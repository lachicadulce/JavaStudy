/*
	# ����Ű
	ctrl f11 ������ �� ��� ���� (Run)
	ctrl +/- ũ������
	ctrl m �ҽ� ��üâ
	alt + ����Ű ���̵�
	home/end ���� �� ��/�ڷ� �̵�
	ctrl + shift + f �ڵ� �鿩����
	
	# Windows ����Ű
	 - win + . �̸�Ƽ��
	 - win + shift + s ĸ��
	 - win + D ����ȭ��
*/

// �� public class�� �̸��� �ݵ�� ���ϸ�� ���ƾ� �Ѵ�
public class A00_Hello {
	// ���� ���� ������ ���� �װ��� ���콺 Ŀ���� �ΰų� 
	// F2�� ������ �ش� ������ ���� ������ �ذ�å�� �� �� �ִ�
	
	//program�� ��������
	public static void main(String[] args) {
//		���α׷� ����
//		�츮�� ���� �ҽ� �ڵ�(.java)�� ������ �����(.class)�� bin������ ����Ǿ� �ִ�
		System.out.println("Hello, World! 1");
		System.out.println("��������������������������������������������");
		System.out.println("��                    ��");
		System.out.println("��       Hello!       ��");
		System.out.println("��                    ��");
		System.out.println("��������������������������������������������");
		
//		# JAVA�� ������ ���� (���ͷ�)
//		- ""���ڿ�(string)
//		- ''����(character)
//		- ���� ����(integer)
//		- �Ҽ� �Ǽ�(float, double)
//		- true, false
		System.out.println("abcdefg ��");
		System.out.println('h');
		System.out.println(123 + 10);
		System.out.println("123" + 10);
		
		
//		''�� ����ϴ� ���� Ÿ�� �����ʹ� �����δ� ���ڰ��� ������ �ִ�
//		���ڿ� ������ �����δ� ���� ���� Ÿ���̸� ���� ��굵 �����ϴ�
		System.out.println('A');
		System.out.println((int)'A'); // 'A'�� ���ڷ� ǥ���϶�� ��
		
		System.out.println(66);
		System.out.println((char)66); // 66�� ���ڷ� ǥ���϶�� ��
		
		System.out.println('D' - 'A'); //'D'�� 'A'���� �󸶳� �ڿ� �ִ� �������� �� �� ����
		
//		������ ���ڸ� ����ϸ� �⺻�����δ� ������ �ȴ�
		System.out.println('A' + 3);
		
		System.out.println((char)('A' + 0));
		System.out.println((char)('A' + 1));
		System.out.println((char)('A' + 2));
		System.out.println((char)('A' + 3));
		System.out.println((char)('A' + 4));
		System.out.println((char)('A' + 26));

		System.out.println((int)'��');
		System.out.println((int)'��');
		
//		""�� ����ϴ� ���ڿ� Ÿ�԰� �ٸ� Ÿ���� ���ϸ� ����� �ϴ� ���� �ƴ϶� �̾���δ�
		System.out.println("10" + 10);
		System.out.println(10 + 10);
		
//		���� + �Ǽ��� ����� �Ǽ���
		System.out.println(3.14 + 10);
		
//		�Ǽ��� ������ ��ȯ�ϸ� �Ҽ��� �Ʒ��� �����Ѵ�
		System.out.println((int)(33.999999));
		System.out.println((int)(3.5) + 3.5); //6.0
		System.out.println((int)(3.5 + 3.5));
		
		
//		���α׷� ��
	}
}
