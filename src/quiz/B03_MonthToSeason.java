package quiz;

import java.util.Scanner;

public class B03_MonthToSeason {
	/*
		����ڷκ��� ���� �Է¹����� �ش��ϴ� ������ ����غ�����
		(switch-case���� ����� ��)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String season = "winter";
		int month;
		System.out.print("input a month(1 ~ 12) >> ");
		month = sc.nextInt();
		
		while (month < 1 || month > 12) {
			System.out.print("input a month(1 ~ 12) >> ");
			month = sc.nextInt();
		}
		
		switch(month) {
		case 3: case 4: case 5:
			season = "spring";
			break;
		case 6: case 7: case 8:
			season = "summer";
			break;
		case 9: case 10: case 11:
			season = "outumn";
			break;
		}
		System.out.printf("This month(%d) is %s season", month, season);
	}
}
