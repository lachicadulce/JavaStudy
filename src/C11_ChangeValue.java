
public class C11_ChangeValue {

	/*
		두 변수의 값을 서로 바꾸는 방법
	 */
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int temp;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println(a);
		System.out.println(b);
	}
}
