package quiz;
import java.util.Scanner;
public class A06_GuessAge {
	/*
		사용자로부터 태어난 해와 올해의 년도를 입력받으면
		그 사람의 한국 나이를 계산하여 몇 살인지 알려주는 프로그램을 만들어보세요
	*/
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int birthYear, thisYear, age;
		
		System.out.println("============나이 구하기지요============");
		System.out.print("태어난 해를 입력해주세요: ");
		birthYear = sc.nextInt();
		
		System.out.print("올해의 년도를 입력해주세요: ");
		thisYear = sc.nextInt();
		
		age = thisYear - birthYear + 1;
		System.out.printf("당신은 %d살 입니다", age);
		System.out.println("\n====================================");
	}
}
