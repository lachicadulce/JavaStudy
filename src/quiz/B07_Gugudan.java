package quiz;

public class B07_Gugudan {
	/*
		1. �������� ������ ���� ���η� ����غ�����
		
		2��: 2x1=2 2x2=4 2x3=6 ...
		3��: ...
		
		2. �������� ������ ���� ���η� ����غ�����
		
		2��		3��		4��		...
		2x1=2	3x1=3	4x1=4	...
		2x2=4	3x2=6	4x2=8	...
	 */
	public static void main(String[] args) {
		
		System.out.println("1. ������ ���η� ����ϱ�");
		for (int dan = 2; dan < 10; dan++) {
			System.out.printf("%d��:\t", dan);
			
			for (int gop = 1; gop < 10; gop++) {
				System.out.printf("%dx%d=%d\t", dan, gop, dan * gop);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("2. ������ ���η� ����ϱ�");
		for (int dan = 2; dan < 10; dan++) {
			System.out.printf("%d��\t", dan);
		}
		for (int gop = 1; gop < 10; gop++) {
			for (int dan = 2; dan < 10; dan++) {
				System.out.printf("%dx%d=%d\t", dan, gop, dan * gop);
//				System.out.printf("%dx%d=%02d ", dan, gop, dan * gop); tab���� �ٸ���
			}
			System.out.println();
		}
		
		
//		����� Ǯ��
		for (int line = 0; line < 10; ++line) {
			for (int dan = 2; dan <=9; dan++) {
				if(line == 0) {
					System.out.printf("%d��\t", dan);
				} else {
					System.out.printf("%dx%d=%d\t", dan, line, dan * line);
				}
			}
			System.out.println();
		}
	}
}
