package quiz;
import java.util.Scanner;
public class B05_PrintReverse {
	/*
		����ڰ� � ������ �Է��ϸ� �� ������ �Ųٷ� ����غ�����
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputStr = "";
		
		System.out.print("input a string > ");
		inputStr = sc.nextLine();
		System.out.print("reverse: ");
//		�ݴ�� �ѱ��ھ� ���.
		for (int i = inputStr.length() - 1; i >= 0; i--) {
			System.out.print(inputStr.charAt(i));
		}
		
//		����� ���: reverse �� ���� ���.
		String reverse = "";
		for (int i = inputStr.length() - 1; i >= 0; i--) {
			reverse += inputStr.charAt(i);
		}
		System.out.println(reverse);
	}
}
