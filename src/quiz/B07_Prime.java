package quiz;

import java.util.Scanner;

public class B07_Prime {
	/*
		사용자로부터 숫자(양수)를 입력받으면
		1부터 입력한 숫자 사이에 존재하는 소수를 모두 출력해보세요.
		(음수를 입력하면 다시 제대로 입력하게 하기)
		
		※ 소수: 나누어 떨어지는 수가 1과 자기 자신밖에 없는 숫자
			2, 3, 5, 7, 11, 13 ...
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		boolean primeFlag = true;
		
		for (; true;) {
			System.out.print("양수를 하나 입력 > ");
			num = sc.nextInt();
			if ( num > 0) {
				break;
			}
		}
		System.out.print("소수는 > ");
		if (num >= 2) {
			System.out.print("2 ");
			for (int i = 3; i <= num; i+=2) {
				for (int j = 3; j <= Math.sqrt(i); j+=2) {
					if (i%j == 0 && i != j) {
						primeFlag = false;
						break;
					}
				}
				if (primeFlag) {
					System.out.printf("%d ", i);
				} else {
					primeFlag = true;
				}
			}
		}
		
		
		
//		강사님 방법: 다 나눠보고 나누어 떨어지는 것이 2개
		for (int chkNum = 2; chkNum <= num; ++chkNum) {
			int count = 0;
			for (int divNum = 1; divNum <= chkNum; ++divNum) {
				if(chkNum % divNum == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.println(chkNum);
			}
		}
		
	}
}
