package quiz;

public class C01_FunctionQuiz {
	/*
		# ������ �Լ��� �����ϰ� �ùٸ��� �����ϴ��� �׽�Ʈ �غ�����
		
		 1. ������ ���ڰ� ���ĺ��̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
		 
		 2. ������ ���ڰ� 3�� ����̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
		 
		 3. ���ڸ� �ϳ� �����ϸ� ���ڿ� "¦���Դϴ�" �Ǵ� "Ȧ���Դϴ�"�� ��ȯ�ϴ� �Լ�
		 
		 4. ���ڸ� �����ϸ� �ش� ������ ��� ����� �迭 ���·� ��ȯ�ϴ� �Լ�
		 
		 5. ������ ������ �Ҽ���� true�� ��ȯ�ϰ� �ƴϸ� false�� ��ȯ�ϴ� �Լ�
		 
		 6. ���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ�ϴ� �Լ�
		 	factorial: (n)*(n-1)*(n-2) ... 3*2*1
	 */
	public static void main(String[] args) {
		System.out.println(alphaCheck('v'));
		System.out.println(times3(456));
		System.out.println(checkNum(458));
		System.out.println(java.util.Arrays.toString(divisor(15)));
		System.out.println(isPrime(8));
		System.out.println(factorial(5));
		
		String str = "�ѱ� Hanguel";
		
		for (int i = 0; i < str.length(); ++i) {
			char ch = str.charAt(i);
			if(alphaCheck(ch)) {
				System.out.println(i + "��° ���ڴ� �����Դϴ�.");
			} else {
				System.out.println(i + "��° ���ڴ� �ѱ��Դϴ�.");
			}
		}
	}
	
	public static boolean alphaCheck(char ch) {
		return ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z';
	}
	
	public static boolean times3(int num) {
		return num % 3 == 0;
	}
	
	public static String checkNum(int num) {
		return num % 2 == 0 ? "¦���Դϴ�" : "Ȧ���Դϴ�";
	}
	
//	������� booleanŸ���� �迭�ϳ� �ؼ� ������ ������������ true�� �����صα�....�� ����Ͻ�.
	public static int[] divisor(int num) {
		int count = 0;
		for (int i = 1; i <=  num / 2; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		int[] result = new int[count];
		count = 0;
		for (int i = 1; i <=  num / 2; i++) {
			if (num % i == 0) {
				result[count] = i;
				count++;
			}
		}
		return result;
	}
	
	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		} else if (num == 2) {
			return true;
		} else if ( num % 2 == 0) {
			return false;
		}
		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int factorial(int num) { // ���� �������ϱ� �ݺ������� ������.
		if(num == 1)
			return 1;
		else
			return num * factorial(num - 1);
	}
}
