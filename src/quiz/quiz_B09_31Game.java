package quiz;
import java.util.Scanner;

public class quiz_B09_31Game {
	/*
		# 31 게임을 만들어보세요
		1. 컴퓨터와 사람이 번갈아가면서 숫자를 선택해야 한다.
			(1, 2, 3 밖에 선택할 수 없음)
		2. 컴퓨터는 랜덤으로 숫자를 선택한다.
		3. 선공은 랜덤으로 결정한다
		4. 마지막에 31 이상의 숫자를 부르는 플레이어가 패배한다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = (int)(Math.random() * 2);
		int sum = 0, num;
		if (first == 0) {
			System.out.println("you first!!");
		} else {
			System.out.println("computer first!!");
			num = (int)(Math.random() * 3 + 1);
			sum += num;
			System.out.printf("[computer] num, sum: %d, %d\n", num, sum);
		}
		
		while (true) {
			System.out.print("1, 2, 3 ? ");
			num = sc.nextInt();
			if (num != 1 && num != 2 && num != 3) {
				continue;
			}
			sum += num;
			System.out.printf("[you] num, sum: %d, %d\n", num, sum);
			if (sum >= 31) {
				System.out.println("You Lose!!");
				break;
			}
			
			num = (int)(Math.random() * 3 + 1);
			sum += num;
			System.out.printf("[computer] num, sum: %d, %d\n", num, sum);
			if (sum >= 31) {
				System.out.println("You Win!!");
				break;
			}
		}
		

	}
}
