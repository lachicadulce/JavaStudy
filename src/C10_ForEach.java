
public class C10_ForEach {

	public static void main(String[] args) {
		int[] numbers = {10, 20, 30, 40, 50, 60};
		
		//for-each
		for(int number : numbers) {
			System.out.println("숫자를 하나씩 꺼내 사용: " + number);
		}
		for(int number : new int[] {10, 20, 30, 40, 50, 60}) {
			System.out.println("숫자를 하나씩 꺼내 사용: " + number);
		}
		for(boolean complete : new boolean[] {true, false, true, true, true, false, true}) {
			if(complete) {
				System.out.println("통과");
			} else {
				System.out.println("불합격");
			}
		}
	}
}
