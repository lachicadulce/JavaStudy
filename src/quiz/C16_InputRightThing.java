package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C16_InputRightThing {

	/*
		사용자로부터 숫자를 입력받되 숫자를 제대로 입력받을때 까지 계속 입력받는 프로그램을 만들어보세요.
		(다른 타입의 값이 입력되어도 프로그램이 강제종료되지 않아야 합니다)
		
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		while(true) {
			try {
				System.out.print("input number (You shuld input only numbers): ");
				num = sc.nextInt();
				System.out.println("the number is " + num + ".");
				break;
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("what are you doing?");
			}
		}
	}
}
