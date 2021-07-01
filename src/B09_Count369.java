import java.util.Scanner;

public class B09_Count369 {
	/*
		사용자로부터 정수를 하나 입력받은 후
		해당 숫자까지 369 게임이 진행된다면 박수를 총 몇 번 쳐야하는지세어보세요
		
		(※ 33, 36, 39 ...등의 숫자는 여러번칩니다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, i = 0, count = 0;
		String allNum = "";
		System.out.print("input a number >> ");
		num = sc.nextInt();
		
		while (i < num) {
			allNum += i + 1;
			i++;
		}
		
		i = 0;
		while (i < allNum.length()) {
			char check = allNum.charAt(i);
			if (check == '3' || check == '6' || check == '9') {
				count++;
			}
			i++;
		}
		System.out.println("총 박수의 수: " + count);
	}
}
