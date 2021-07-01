package quiz;

public class C01_FunctionQuiz {
	/*
		# 다음의 함수를 정의하고 올바르게 동작하는지 테스트 해보세요
		
		 1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
		 
		 2. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
		 
		 3. 숫자를 하나 전달하면 문자열 "짝수입니다" 또는 "홀수입니다"를 반환하는 함수
		 
		 4. 숫자를 전달하면 해당 숫자의 모든 약수를 배열 혈태로 반환하는 함수
		 
		 5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
		 
		 6. 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환하는 함수
		 	factorial: (n)*(n-1)*(n-2) ... 3*2*1
	 */
	public static void main(String[] args) {
		System.out.println(alphaCheck('v'));
		System.out.println(times3(456));
		System.out.println(checkNum(458));
		System.out.println(java.util.Arrays.toString(divisor(15)));
		System.out.println(isPrime(8));
		System.out.println(factorial(5));
		
		String str = "한글 Hanguel";
		
		for (int i = 0; i < str.length(); ++i) {
			char ch = str.charAt(i);
			if(alphaCheck(ch)) {
				System.out.println(i + "번째 문자는 영어입니다.");
			} else {
				System.out.println(i + "번째 문자는 한글입니다.");
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
		return num % 2 == 0 ? "짝수입니다" : "홀수입니다";
	}
	
//	강사님은 boolean타입의 배열하나 해서 나누어 떨어질때마다 true로 저장해두기....를 사용하심.
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
	
	public static int factorial(int num) { // 성능 안좋으니까 반복문으로 돌리기.
		if(num == 1)
			return 1;
		else
			return num * factorial(num - 1);
	}
}
