
public class B05_For {

	/*
		# �ݺ��� (loop)
			- for, while, do-while(X), for-each
			- �Ȱ��� �ڵ带 ������ �ݺ��ϰ� ���� �� ����Ѵ�
			
		# for��
			for (�ʱⰪ; �ݺ�����; ������) {
				����� �ִ� �ݺ������� true�� ���� �ݺ��� ��ɾ���� ���� ��
			}
	*/
	public static void main(String[] args) {
		
//		1. ���� �⺻���� ������ for��
//			- �ʱⰪ���� 0�� �ְ�, ���ǿ��� �ݺ��ϰ� ���� Ƚ���� ���´�
//			- ������ 1�� �Ѵ�
//			- ���ϴ� Ƚ����ŭ �ݺ��ϱ� ���� ���� ������ for��
		
		for(int i = 0; i < 100; ++i) {
			System.out.println("Hello, World!" + i);
		}
		
		/*
			2. �ʱⰪ, ������, ������ ������� ������ �� �ִ�
		*/
		for (int i = 100; i > 0; --i) {
			System.out.println(i);
		}
		/*
			3. �ʱⰪ�� �������� ��ġ�� ������� ������ �� �ִ�
			
		*/
		int a = 123;
		for (; a < 234; ) {
			System.out.println("Hello! " + a);
			a += 5;
		}
		
		/*
			4. �ݺ��� ���ο� �ٸ� �����鵵 �����Ӱ� ����� �� �ִ�
		 */
		String season = "winter";
		for(int month = 1; month <= 12; ++month) {
			switch(month) {
			case 3: case 4: case 5:
				season = "spring";
				break;
			case 6: case 7: case 8:
				season = "summer";
				break;
			case 9: case 10: case 11:
				season = "outumn";
				break;
			}
			System.out.printf("This month(%d) is %s season\n", month, season);
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
}


















