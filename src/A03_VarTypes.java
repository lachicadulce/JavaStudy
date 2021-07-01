
public class A03_VarTypes {
	public static void main(String[] args) {
		/*
		# 정수 타입
		 - byte		(1byte)	-128 ~ +127
		 1byte => 8bit
		 0000 0000(0) ~ 1111 1111(255)
		 0000 0000	(8bit) 첫 번째 비트: 부호비트 (음수는 1)
		 byte 타입의 양수 범위 0000 0000(0) ~ 0111 1111(127)
		 byte 타입의 음수 범위 1000 0000(-128) ~ 1111 1111(-1)
		 (보수 + 1)
		 0111 1111 + 1
		 0000 0000 + 1
		 - short	(2byte)
		 양수: 0000 0000 0000 0000(0) ~ 0111 1111 1111 1111(32767)
		 음수: 1000 0000 0000 0000(-32768) ~ 1111 1111 1111 1111(-1)
		 - char		(2byte unsigned) ※ 문자 코드 저장용
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
		
//		정수타입 리터럴은 기본적으로 int타입이다
//		int타입의 범위를 벗어나는 값을 사용하고 싶다면 뒤에 l 또는 L을 붙여야 한다
		long _long = 200000000000000L;
		System.out.println(a);
		
		/*
			# 실수 타입
			 - float (4byte)
			 - double (8byte)
			 
			 실수는 주로 그래픽 계산에 사용된다
			 부동 소수점 방식을 사용한다
		*/
		
//		소수 리터럴은 기본적으로 double타입이므로 double타입 변수에는 아무 문제없이 들어간다
		double _double = 123.1234;
		
//		소수 뒤에 f 또는 F를 적어주면 float타입 리터럴이라는 표시가 된다
		float _float = 123.123f;
		
		/*
			# 참/거짓 타입
			 - boolean
			 들어갈 수 있는 값은 true/false 밖에 없다
		*/
		boolean male = true;
		boolean female = true;
		boolean powerOn = false;
		boolean goonpil = true;
		boolean computerScience = true;
		
		/*
			# 참조형 타입
			 참조형 타입은 대문자로 시작한다
			 소문자로 시작하는 타입은 모두 기본형 타입이라고 부른다
			 
			 - String: 문자열
			 - 그 외 모든 클래스들..
		*/
		String welcome_message = "hello, world!";
		System.out.println(welcome_message);
		
//		char 타입은 문자 코드를 저장하는 정수 타입이다
		char ch = 97;
		System.out.println("ch에 저장된 값: " + ch);
		ch = 98;
		System.out.println("ch에 저장된 값: " + ch);
		
		char ch2 = 'x';
		int num1 = 'x';
		System.out.println("'x' char: " + ch2);
		System.out.println("'x' int: " + num1);
	}
}
