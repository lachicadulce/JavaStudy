package quiz;

import java.util.Scanner;

public class B01_ScoreToGrade {
	/*
		점수를 입력받으면 점수에 해당하는 알맞은 등급을 출력해주는 프로그램을 만들어보세요
		
			90점 이상: A
			80점 이상: B
			70점 이상: C
			60점 이상: D
			그 외: F
			
		※ 유효한 점수는 0 ~ 100점 입니다
	 */
	public static void main(String[] args) {
		
//		※ 입력을 받았을 때는 잘못된 값을 먼저 거르는 것이 좋다
		
		Scanner sc = new Scanner(System.in);
		double score;
		char grade = 'F';
		
		System.out.print("input your score > ");
		score = sc.nextDouble();
		
		if (score < 0 || score > 100) { 
			System.out.print("말도안되는점수에요오오옹");
			return;
		} else if (score >= 90) { // A
			grade = 'A';
		} else if (score >= 80) { // B
			grade = 'B';
		} else if (score >= 70) { // C
			grade = 'C';
		} else if (score >= 60) { // D
			grade = 'D';
		}
		
		System.out.printf("Your grade is %c.", grade);
		
		
		
		String msg = String.format("당신의 등급은 %c입니다.", grade);
		System.out.println(msg);
	}
}
