
public class C09_Area {

	/*
		# ������ ����
		
		 - ������ �ش� ������ ������ {}�� ����� �״´� (������ �����ֱ�)
		 - ��Ȯ�ϰ� ������� ������ �⺻������ ���� ����� ��ġ�� ������ ����Ѵ�
	 */
	// �ν��Ͻ� ���� (instance variable)
	// a.k.a �⺸(memer), �ʵ�(field), �Ӽ�(arrtibute), �Ӽ�(property)
	int a = 15;
	
	void methodA() {
		// ���� ���� (local variable) : �޼��� ���ο��� ����� ����
		int a = 10;
		
		System.out.println(a);
	}
	
	void methodB() {
		System.out.println(a);
	}
	
	class Area2 {
		public Area2() {
			System.out.println(a);
		}
		class Area3 {
			public Area3() {
				System.out.println(a);
			}
		}
	}
	
	public static void main(String[] args) {
		new C09_Area().new Area2();
	}
}
