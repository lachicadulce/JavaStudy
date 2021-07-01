package quiz;

import java.util.Scanner;

public class B11_CountRandomFruit {

	/*
		사용자로부터 숫자를 입력받으면 해당 개수만큼의 랜덤 과일을 선택한다
		(랜덤으로 등장하는 과일 - apple, banana, kiwi, orange, grape, peach)
		
		그 후 각 과일이 몇 번 등장했는지 모두 기록하고 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] fruit = { "apple", "banana", "kiwi", "orange", "grape", "peach", "pineapple"};
		int fruitAll;
		int[] fruitCount = new int[fruit.length];
		
		System.out.print("숫자를 입력하세요: ");
		fruitAll = sc.nextInt();
		
		String[] fruitRandom = new String[fruitAll];
//		기록
		for (int i = 0; i < fruitAll; i++) {
			fruitRandom[i] = fruit[(int)(Math.random() * fruit.length)];
		}
//		측정
		for (int i = 0; i < fruitAll; i++) {
			for (int j = 0; j < fruit.length; j++) {
				if(fruitRandom[i].equals(fruit[j])) {
					fruitCount[j]++;
					break;
				}
			}
		}
//		출력
		for (int i = 0; i < fruit.length; i++) {
			System.out.printf("%s는 %d번\n", fruit[i], fruitCount[i]);
		}
		
		
		
		
		
		
//		강사님의 풀이
		int repeat = fruitAll;
		
		String[] fruits = { "apple", "banana", "kiwi", "orange", "grape", "peach", "pineapple"};
		int[] fruit_count = new int[fruits.length];
		for (int i= 0; i < repeat; ++i) {
			int random_number = (int)(Math.random()*fruits.length);
			fruit_count[random_number]++;
		}
		
		System.out.println("### 과일 등장 횟수 ###");
		for (int i = 0; i < fruits.length; ++i) {
			System.out.printf("%s는 %d번 등장했습니다.\n", fruits[i], fruit_count[i]);
		}
	}
}
