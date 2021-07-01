package quiz;

import java.util.Scanner;

import myobj.FiveDice.Dice;

public class C07_FiveDice {

	/*
	 	랜덤으로 5개의 주사위를 굴린 다음에 주사위의 결과를 통해 다음을 구분하는 클래스를 만들어보세요
	 	
	 	1. 풀하우스 (같은 눈이 2개 + 3개) (11666/23332/55252)
	 	2. 스몰 스트레이트 (1234/2345/3456)
	 	3. 라지 스트레이트 (12345/23456)
	 	4. 4 다이스 (같은 숫자 4개)
	 	5. 5 다이스 (같은 숫자 5개) (Yacht)
	 */
	public static void main(String[] args) {
		Dice d1 = new Dice();
		String answer;
		int answerNum;
		Scanner sc = new Scanner(System.in);

		System.out.print("게임을 시작하시겠어요? (y/n): ");
		answer = sc.next();
		if (answer.equals("y")) {
			d1.roll();
			d1.countDices();
			d1.checkAll();
		}
		while(true) {
			System.out.print("다시 던지시겠어요? (y/n): ");
			answer = sc.next();
			if (answer.equals("y")) {
				System.out.print("몇 개를 다시 던지시겠어요? (1~5): ");
				answerNum = sc.nextInt();
				if (answerNum == 5) {
					d1.roll();
				} else if (answerNum >= 1 && answerNum < 5) {
					for (int i = 0; i < answerNum; i++) {
						int index = 0;
						System.out.print("몇 번째 주사위를 다시할까요? (1~5): ");
						index = sc.nextInt();
						d1.rollOne(index);
					}
				}
			} else if(answer.equals("n")){
				System.out.println("bye…");
				break;
			} else {
				System.out.println("다시 입력해주세요.");
			}
			d1.countDices();
			d1.checkAll();
			System.out.println();
		}
	}
}