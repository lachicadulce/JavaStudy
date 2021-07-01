package quiz;

public class B07_Gugudan {
	/*
		1. 구구단을 다음과 같이 가로로 출력해보세요
		
		2단: 2x1=2 2x2=4 2x3=6 ...
		3단: ...
		
		2. 구구단을 다음과 같이 세로로 출력해보세요
		
		2단		3단		4단		...
		2x1=2	3x1=3	4x1=4	...
		2x2=4	3x2=6	4x2=8	...
	 */
	public static void main(String[] args) {
		
		System.out.println("1. 구구단 가로로 출력하기");
		for (int dan = 2; dan < 10; dan++) {
			System.out.printf("%d단:\t", dan);
			
			for (int gop = 1; gop < 10; gop++) {
				System.out.printf("%dx%d=%d\t", dan, gop, dan * gop);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("2. 구구단 세로로 출력하기");
		for (int dan = 2; dan < 10; dan++) {
			System.out.printf("%d단\t", dan);
		}
		for (int gop = 1; gop < 10; gop++) {
			for (int dan = 2; dan < 10; dan++) {
				System.out.printf("%dx%d=%d\t", dan, gop, dan * gop);
//				System.out.printf("%dx%d=%02d ", dan, gop, dan * gop); tab없이 줄맞춤
			}
			System.out.println();
		}
		
		
//		강사님 풀이
		for (int line = 0; line < 10; ++line) {
			for (int dan = 2; dan <=9; dan++) {
				if(line == 0) {
					System.out.printf("%d단\t", dan);
				} else {
					System.out.printf("%dx%d=%d\t", dan, line, dan * line);
				}
			}
			System.out.println();
		}
	}
}
