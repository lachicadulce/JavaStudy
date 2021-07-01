package quiz;
import java.util.Scanner;
public class B05_PrintReverse {
	/*
		사용자가 어떤 문장을 입력하면 그 문장을 거꾸로 출력해보세요
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputStr = "";
		
		System.out.print("input a string > ");
		inputStr = sc.nextLine();
		System.out.print("reverse: ");
//		반대로 한글자씩 출력.
		for (int i = inputStr.length() - 1; i >= 0; i--) {
			System.out.print(inputStr.charAt(i));
		}
		
//		강사님 방법: reverse 를 만들어서 출력.
		String reverse = "";
		for (int i = inputStr.length() - 1; i >= 0; i--) {
			reverse += inputStr.charAt(i);
		}
		System.out.println(reverse);
	}
}
