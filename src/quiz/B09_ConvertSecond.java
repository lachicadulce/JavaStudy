package quiz;

import java.util.Scanner;

public class B09_ConvertSecond {
	/*
	 	초를 입력받으면 년/일/시간/분/초로 변환하여 출력해보세요
	 	
	 	※ 단, 필요없는 단위는 출력하지 말 것
	 		ex: 0년 0일 13시간 0분 5초인 경우 -> 13시간 0분 5초만 나와야 함
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
			System.out.printf("%d년 %d일 %d시간 %d분 %d초", year, day, hour, min, sec);
		} else if (day != 0) {
			System.out.printf("%d일 %d시간 %d분 %d초", day, hour, min, sec);
		} else if (hour != 0) {
			System.out.printf("%d시간 %d분 %d초",hour, min, sec);
		} else if (min != 0) {
			System.out.printf("%d분 %d초",min, sec);
		} else {
			System.out.printf("%d초", sec);			
		}
		System.out.println();
		
//		강사님의 문제 풀이: final int로 나눠줄 수들 선언.
//		int second = sc.nextInt();
//		int y = 0, d = 0, h = 0, m = 0, s = 0;
//		
//		final int SECOND_PER_YEAR = 365 * 24 * 60 * 60;
//		final int SECOND_PER_DAY = 24 * 60 * 60;
//		final int SECOND_PER_HOUR = 60 * 60;
//		final int SECOND_PER_MINUTE = 60;
//		
//		System.out.printf("%d초는 변환하면: ", second);
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
//			System.out.print(y + "년 ");
//			exist = true;
//		}
//		if (d != 0 || exist) {
//			System.out.print(d + "일 ");
//			exist = true;
//		}
//		if (h != 0 || exist) {
//			System.out.print(h + "시간 ");
//			exist = true;
//		}
//		if (m != 0 || exist) {
//			System.out.print(m + "분 ");
//			exist = true;
//		}
//		System.out.println(second + "초");
		
//		2번째
		int second = sc.nextInt();
		int[] converted = new int[4];
		int[] seconds = new int[4];
		String[] units = {"년", "일", "시", "분"};
		
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
		System.out.printf("%d초", second);
		System.out.println();
		
	}
}
