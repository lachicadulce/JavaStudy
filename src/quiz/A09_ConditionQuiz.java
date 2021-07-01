package quiz;

public class A09_ConditionQuiz {
	public static void main(String[] args) {
		/*
			[ 알맞은 비교연산을 만들어보세요 ]
			
			1. int형 변수 a가 10보다 크고 20보다 작을 때 true
			2. int형 변수 b가 짝수일 때 true
			3. int형 변수 c가 7의 배수일 때 true
			4. int형 변수 hour가 0미만 24이상이 아니고, 12이상일 때 true
			5. int형 변수 d와 e의 차이가 30일 때 true
			6. int형 변수 year가 400으로 나누어 떨어지거나
			   또는 4로 나누어 떨어지고 100으로 나누어떨어지지 않을 때 true //윤년계산공식
			7. 민수가 철수보다 2살 많으면 true
			8. 민수가 철수보다 생일이 3달 빠르면 true
			9. boolean형 변수 powerOn이 false일 때 true
			10. 문자열 참조변수 str이 "yes"일 때 true
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
		
		// 타입명이 대문자로 시작하는 참조형 변수들은 반드시 .equals()를 이용해 비교해야 한디
		System.out.println("10. " + (str.equals("yes")));
		
		// 문자열을 == 으로 비교하면 안되는 이유?
//		참조형 변수의 == 비교는 두 변수가 서로 같은 주소를 지니고 있는지를 비교한다
		String str1 = "yes";
		String str2 = "yes";
		String str3 = new String("yes");

		System.out.println("str1 == \"yes\": " + (str1 == "yes"));
		System.out.println("str1 == str2: " + (str1 == str2));
		System.out.println("str1 == str3: " + (str1 == str3));
		
//		소문자로 시작하는 타입 변수들은 스택에 차곡차곡 쌓인다
//		대문자로 시작하는 타입 변수들은 스택에는 주소값만 보관하고 실체는 heap에 존재한다
//		대문자로 시작하는 타입 변수에는 주소값이 저장되어 있고, 거기에 .을 찍고 실제 데이터를 참조할 수 있다
//		참조형 변수의 크기는 아마... 컴퓨터 마다 달라질 수 있다... (중요한거 아님..)		
	}
}
