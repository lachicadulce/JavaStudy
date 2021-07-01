package quiz;

import java.util.Scanner;

public class B09_ConvertSecond {
	/*
	 	�ʸ� �Է¹����� ��/��/�ð�/��/�ʷ� ��ȯ�Ͽ� ����غ�����
	 	
	 	�� ��, �ʿ���� ������ ������� �� ��
	 		ex: 0�� 0�� 13�ð� 0�� 5���� ��� -> 13�ð� 0�� 5�ʸ� ���;� ��
	 */
	public static void main(String[] args) {
//		1day: 86400 1year: 15768000 1hour: 3600 1minute: 60
		Scanner sc = new Scanner(System.in);
		int year = 0, day = 0, hour = 0, min = 0, sec;
		System.out.print("number > ");
		sec = sc.nextInt();
		
		year = sec / 31536000;
		sec %= 31536000;
		day = sec / 86400;
		sec %= 86400;
		hour = sec / 3600;
		sec %= 3600;
		min = sec / 60;
		sec %= 60;
		
		if (year != 0) {
			System.out.printf("%d�� %d�� %d�ð� %d�� %d��", year, day, hour, min, sec);
		} else if (day != 0) {
			System.out.printf("%d�� %d�ð� %d�� %d��", day, hour, min, sec);
		} else if (hour != 0) {
			System.out.printf("%d�ð� %d�� %d��",hour, min, sec);
		} else if (min != 0) {
			System.out.printf("%d�� %d��",min, sec);
		} else {
			System.out.printf("%d��", sec);			
		}
		System.out.println();
		
//		������� ���� Ǯ��: final int�� ������ ���� ����.
//		int second = sc.nextInt();
//		int y = 0, d = 0, h = 0, m = 0, s = 0;
//		
//		final int SECOND_PER_YEAR = 365 * 24 * 60 * 60;
//		final int SECOND_PER_DAY = 24 * 60 * 60;
//		final int SECOND_PER_HOUR = 60 * 60;
//		final int SECOND_PER_MINUTE = 60;
//		
//		System.out.printf("%d�ʴ� ��ȯ�ϸ�: ", second);
//		y = second / SECOND_PER_YEAR;
//		second %= SECOND_PER_YEAR;
//		
//		d = second / SECOND_PER_DAY;
//		second %= SECOND_PER_DAY;
//		
//		h = second / SECOND_PER_HOUR;
//		second %= SECOND_PER_HOUR;
//		
//		m = second / SECOND_PER_MINUTE;
//		second %= SECOND_PER_MINUTE;
//
//		boolean exist = false;
//		if (y != 0) {
//			System.out.print(y + "�� ");
//			exist = true;
//		}
//		if (d != 0 || exist) {
//			System.out.print(d + "�� ");
//			exist = true;
//		}
//		if (h != 0 || exist) {
//			System.out.print(h + "�ð� ");
//			exist = true;
//		}
//		if (m != 0 || exist) {
//			System.out.print(m + "�� ");
//			exist = true;
//		}
//		System.out.println(second + "��");
		
//		2��°
		int second = sc.nextInt();
		int[] converted = new int[4];
		int[] seconds = new int[4];
		String[] units = {"��", "��", "��", "��"};
		
		seconds[0] = 365 * 24 * 60 * 60;
		seconds[1] = 24 * 60 * 60;
		seconds[2] = 60 * 60;
		seconds[3] = 60;
		
		for (int i = 0; i < converted.length; ++i) {
			converted[i] = second / seconds[i];
			second %= seconds[i];
		}
		
		boolean exist = false;
		
		for(int i = 0; i < converted.length; ++i) {
			if(converted[i] != 0 || exist) {
				System.out.printf("%d%s ", converted[i], units[i]);
				exist = true;
			}
		}
		System.out.printf("%d��", second);
		System.out.println();
		
	}
}
