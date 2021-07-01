package quiz;

public class A03_PrintVar {
	public static void main(String[] args) {
		String banner = "========== 출력 결과 ==========\n", name = "홍길동", telNum = "010-1234-1234";
		int age = 20;
		double weight = 75;
		float tall = 178.5f;
		String blood = "O";
		boolean glasses = true;
		
		System.out.println(banner);
		System.out.println("이름\t: " + name);
		System.out.println("나이\t: " + age);
		System.out.println("Tel\t: " + telNum);
		System.out.println("키\t: " + tall);
		System.out.println("몸무게\t: " + weight);
		System.out.println("혈액형\t: " + blood);
		System.out.println("안경유무\t: " + glasses);
	}
}
