
public class D04_WrapperClass {

	/*
	 	# Wrapper Class
	 	
	 	 - �⺻ Ÿ�Ե��� ������ Ÿ������ ���γ��� Ŭ������
	 	 - �� �⺻ Ÿ�Ե鿡 ���� ������ ��ɵ��� ���ִ�
	 	 
	 	# �⺻�� Ÿ�Ե��� �̸�
	 	
	 	 - byte, short, char, int, long, float, double, boolean
	 	 
	 	# �⺻���� ���� ������ Ÿ���� �̸�
	 	
	 	 - Byte, Short, Charater, Integer, Long, Float, Double, Boolean
	 	 
	 */
	
	public static void main(String[] args) {
		/*
		 	# parsing
		 	
		 	 - ���ڿ��� ���ϴ� Ÿ������ ��ȯ��Ű�� ��
		 	 - �� Ÿ���� Wrapper Ŭ������ static �޼���μ� �����Ѵ�
		 	 
		 */
		
		for (int i = 0; i < "123".length(); ++i) {
			char ch = "123".charAt(i);
			
			int num = ch - '0';
			System.out.println(num);
		}
		
		int num = Integer.parseInt("123");
		System.out.println(num);
		
		double d = Double.parseDouble("123.1234");
		System.out.println(d);
		
		
		/*
		 	# toString
		 	
		 	 - �� Ÿ���� ���� ���ڿ��� ��ȯ��Ű�� ���
		 	 - �������̵� ������ toStrin()���� �ٸ���
		 	 - ���ϴ� ���� (radix)�� ���ڿ��� ��ȯ�� �� �ִ� ��ɵ� �ִ� 
		 */
		String result = Integer.toString(num);
		System.out.println(result);
		
		// ���α׷��ӵ鿡�Դ� 2����, 8����, 16������ �߿��ϴ�.
		for (int radix = 2; radix <= 16; ++radix) {
			result = Integer.toString(899999, radix);
			System.out.println(radix + "����: " + result);
		}
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Character.MAX_VALUE);
		
		// Character���� ���ڸ� ���ϰ� �ٷ� �� �ִ� static �޼������ ����.
		Character.isLowerCase('a');
		Character.isDigit('9');
		
		
	}
}
