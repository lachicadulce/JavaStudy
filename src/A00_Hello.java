/*
	# 단축키
	ctrl f11 컴파일 후 결과 실행 (Run)
	ctrl +/- 크기조정
	ctrl m 소스 전체창
	alt + 방향키 줄이동
	home/end 줄의 맨 앞/뒤로 이동
	ctrl + shift + f 자동 들여쓰기
	
	# Windows 단축키
	 - win + . 이모티콘
	 - win + shift + s 캡쳐
	 - win + D 바탕화면
*/

// ※ public class의 이름은 반드시 파일명과 같아야 한다
public class A00_Hello {
	// 빨간 줄이 생겼을 때는 그곳에 마우스 커서를 두거나 
	// F2를 누르면 해당 에러에 대한 정보와 해결책을 볼 수 있다
	
	//program의 시작지점
	public static void main(String[] args) {
//		프로그램 시작
//		우리가 만든 소스 코드(.java)의 컴파일 결과물(.class)은 bin폴더에 저장되어 있다
		System.out.println("Hello, World! 1");
		System.out.println("┌────────────────────┐");
		System.out.println("│                    │");
		System.out.println("│       Hello!       │");
		System.out.println("│                    │");
		System.out.println("└────────────────────┘");
		
//		# JAVA의 데이터 종류 (리터럴)
//		- ""문자열(string)
//		- ''문자(character)
//		- 숫자 정수(integer)
//		- 소수 실수(float, double)
//		- true, false
		System.out.println("abcdefg 白");
		System.out.println('h');
		System.out.println(123 + 10);
		System.out.println("123" + 10);
		
		
//		''를 사용하는 문자 타입 데이터는 실제로는 숫자값을 가지고 있다
//		문자와 정수는 실제로는 거의 같은 타입이며 서로 계산도 가능하다
		System.out.println('A');
		System.out.println((int)'A'); // 'A'를 숫자로 표현하라는 뜻
		
		System.out.println(66);
		System.out.println((char)66); // 66을 문자로 표현하라는 뜻
		
		System.out.println('D' - 'A'); //'D'가 'A'보다 얼마나 뒤에 있는 문자인지 알 수 있음
		
//		정수와 문자를 계산하면 기본적으로는 정수가 된다
		System.out.println('A' + 3);
		
		System.out.println((char)('A' + 0));
		System.out.println((char)('A' + 1));
		System.out.println((char)('A' + 2));
		System.out.println((char)('A' + 3));
		System.out.println((char)('A' + 4));
		System.out.println((char)('A' + 26));

		System.out.println((int)'가');
		System.out.println((int)'한');
		
//		""을 사용하는 문자열 타입과 다른 타입을 더하면 계산을 하는 것이 아니라 이어붙인다
		System.out.println("10" + 10);
		System.out.println(10 + 10);
		
//		정수 + 실수의 결과는 실수다
		System.out.println(3.14 + 10);
		
//		실수를 정수로 변환하면 소수점 아래를 삭제한다
		System.out.println((int)(33.999999));
		System.out.println((int)(3.5) + 3.5); //6.0
		System.out.println((int)(3.5 + 3.5));
		
		
//		프로그램 끝
	}
}
