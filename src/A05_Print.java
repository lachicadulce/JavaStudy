
public class A05_Print {
	public static void main(String[] args) {
		/*
		# 콘솔에 출력하는 함수들
		 1. print()
		  - 줄을 자동으로 바꿔주지 않는 가장 기본 출력 함수
		 2. println()
		  - 줄을 자동으로 바꿔주며 출력하는 함수
		  - ()에 전달한 데이터 맨 뒤에 '\n'을 추가하여 출력한다
		  - ()에 아무것도 전달하지 않으면 '\n'만 출력한다
		*/
		int apple = 15;
		
		System.out.print("Hello!\n");
		System.out.print("Hello!\n");
		System.out.print("Hello!\n");

		System.out.print("사과: ");
		System.out.println(apple + "개");
		
		System.out.println();
		
		System.out.println("Hello!");
		System.out.println("Hello!");
		System.out.println("Hello!");
		
		/*
			3. printf()
			 - 서식을 이용해 원하는 형태를 쉽게 만들어 출력하는 함수
			 - 출력의 형태를 미리 만들고, 서식 문자 자리에 값을 순서대로 채워서 사용한다
			 - 문자열을 +로 이어붙이는 방식보다 편리한 경우에 사용한다
			 - 줄을 자동으로 바꿔주지 않는다
			 
			 ※ 서식 문자의 종류
			  %d: 해당 자리에 전달한 정수값을 10진수로 출력해준다 (decimal)
			  %x, %X: 해당 자리에 전달한 정수값을 16진수로 출력해준다 (hexa decimal)
			  %o: 해당 자리에 전달한 정수값을 8진수로 출력해준다 (octal)
			  %s: 문자열
			  %c: 문자
			  %f: 실수
		*/
		
		int year = 2021, month = 5, day = 10,
				hour = 15, minute = 50, second = 13;
		System.out.print(year + "년" + month + "월" + day + "일\t");
		System.out.println(hour + ":" + minute + ":" + second);
		
		System.out.printf("%d년 %d월 %d일\t%d:%d:%d\n", year, month, day, hour, minute, second);

		System.out.printf("%d를 10진수로 출력하면 %d입니다. \n", year, year);
		System.out.printf("%d를 8진수로 출력하면 %o입니다. \n", year, year);
		System.out.printf("%d를 16진수로 출력하면 %x입니다. \n", year, year);
		System.out.printf("%d를 16진수로 출력하면 %X입니다. \n", year, year);
		
		/*
			※ 서식 문자 옵션들
			
			 1. %숫자d, %숫자s ...
			  - 자릿수를 숫자만큼 확보하면서 출력한다
			  
			 2. %-숫자d, ...
			  - 자릿수를 숫자만큼 확보하면서 왼쪽 정렬하여 출력한다
			  
			 3. %d0숫자d
			  - 자릿수를 숫자만큼 확보하고 빈자리에 0을 채워 출력한다
			  
			 4. %+d
			  - 양수 앞에도 부호를 붙여서 출력한다
			  
			 5. %.숫자f
			  - 소수의 자릿수를 설정한다
		*/
		System.out.printf("%20d\n", 2000);
		System.out.printf("%20d\n", 200000);
		System.out.printf("%-15s: %d\n", "Price", 2000);
		System.out.printf("%15s: %d\n\n", "Price", 2000);
		

		System.out.printf("%-15s: %7d\n", "Price", 2000);
		System.out.printf("%-15s: %7d\n", "Income", 150000);
		System.out.printf("%-15s: %7d\n", "Tax", 27000);

		System.out.printf("%03d\n", 1);
		System.out.printf("%03d\n", 2);
		System.out.printf("%03d\n", 11);
		System.out.printf("%03d\n", 15);
		
		System.out.println("-----------------------------------------");

		System.out.printf("%+d\n", -50);
		System.out.printf("%+d\n", 50);

		System.out.printf("%0+20.5f\n", 15.123456); //조합가능
		System.out.printf("%.4f\n", 15.123456); //반올림 발생
		System.out.printf("%.3f\n", 15.123456);
		System.out.printf("%.2f\n", 15.123456);
		System.out.printf("%.30f\n", 15.123456); //자릿수 늘리기도 가능
	}
}
