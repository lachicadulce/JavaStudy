
public class B08_While {
	
	
	/*
	  # while
	  	- for���� ������ �ణ �ٸ� �ݺ���
	  	- �ʱⰪ�� �������� ��ġ�� ������ ���� �ʴ�
	  	- ()���� ������ ���� ���� {}���� ������ �ݺ��Ѵ�
	  	- �������� ��ġ�� ���� ���α׷� ������ �޶��� �� �����Ƿ� �����ؾ� �Ѵ�
	 */
	public static void main(String[] args) {
		
		int i = 0;
		
//		while���� �������� ��ġ�� ���� ����� �޶��� �� �ִ�
		while (i < 10) {
//			System.out.println(i);
//			++i;

//			System.out.println(i++);
			System.out.println(++i);
		}
		
		while (i++ < 10) { // ���ǹ� ���� +��. �̷������� ���x
			System.out.println(i);
		}
	}
}
