package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C16_InputRightThing {

	/*
		����ڷκ��� ���ڸ� �Է¹޵� ���ڸ� ����� �Է¹����� ���� ��� �Է¹޴� ���α׷��� ��������.
		(�ٸ� Ÿ���� ���� �ԷµǾ ���α׷��� ����������� �ʾƾ� �մϴ�)
		
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
