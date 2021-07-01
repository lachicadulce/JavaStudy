package quiz;

import java.util.Scanner;

public class B11_CountRandomFruit {

	/*
		����ڷκ��� ���ڸ� �Է¹����� �ش� ������ŭ�� ���� ������ �����Ѵ�
		(�������� �����ϴ� ���� - apple, banana, kiwi, orange, grape, peach)
		
		�� �� �� ������ �� �� �����ߴ��� ��� ����ϰ� ���
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] fruit = { "apple", "banana", "kiwi", "orange", "grape", "peach", "pineapple"};
		int fruitAll;
		int[] fruitCount = new int[fruit.length];
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		fruitAll = sc.nextInt();
		
		String[] fruitRandom = new String[fruitAll];
//		���
		for (int i = 0; i < fruitAll; i++) {
			fruitRandom[i] = fruit[(int)(Math.random() * fruit.length)];
		}
//		����
		for (int i = 0; i < fruitAll; i++) {
			for (int j = 0; j < fruit.length; j++) {
				if(fruitRandom[i].equals(fruit[j])) {
					fruitCount[j]++;
					break;
				}
			}
		}
//		���
		for (int i = 0; i < fruit.length; i++) {
			System.out.printf("%s�� %d��\n", fruit[i], fruitCount[i]);
		}
		
		
		
		
		
		
//		������� Ǯ��
		int repeat = fruitAll;
		
		String[] fruits = { "apple", "banana", "kiwi", "orange", "grape", "peach", "pineapple"};
		int[] fruit_count = new int[fruits.length];
		for (int i= 0; i < repeat; ++i) {
			int random_number = (int)(Math.random()*fruits.length);
			fruit_count[random_number]++;
		}
		
		System.out.println("### ���� ���� Ƚ�� ###");
		for (int i = 0; i < fruits.length; ++i) {
			System.out.printf("%s�� %d�� �����߽��ϴ�.\n", fruits[i], fruit_count[i]);
		}
	}
}
