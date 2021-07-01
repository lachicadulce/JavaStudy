package quiz;

import java.util.Scanner;

public class B01_AppleQuiz {
	/*
		사과를 10개씩 담을 수 있는 바구니가 있다.
		
		사용자가 구매하고 싶은 사과의 개수를 입력하면
		사과를 모두 담기 위해 필요한 바구니의 개수를 알려주는 프로그램을 만들어보세요.
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int apple_cnt, basket_cnt;
//		basket_size를 double로 해서도 가능
		System.out.print("How many apple do yo want? ");
		apple_cnt = sc.nextInt();
		
		if (apple_cnt < 0) {
			System.out.println("올바른 사과의 개수가 아니에요.");
			return;
		}
		basket_cnt = apple_cnt / 10;
		if (apple_cnt % 10 > 0) {
			basket_cnt ++;
		}
		
		System.out.println("You need " + basket_cnt + "baskets");
		
//		Math.ceil(a): a를 소수 첫째 자리에서 올린다
//		Math.floor(a): a를 소수 첫째 자리에서 내린다
		System.out.println("You need " + (int)Math.ceil(basket_cnt) + "개 입니다.");
	}
}
