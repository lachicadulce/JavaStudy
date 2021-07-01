
public class B03_Switch {
	/*
		# switch-case��
		
			- ()���� ���� ����� ���� ������ �ڵ带 �����Ѵ�
			- ()�ȿ� boolean Ÿ���� �� �� ����
			- if������ �Ϻ��ϰ� ��ü �����ϴ�
			- default�� if���� else ������ �Ѵ�
			- break�� �� ���� ...
	*/
	public static void main(String[] args) {
		
		int a = 10;
		
		switch (a % 2) {
		case 1:
			System.out.println("case 1 blook");
			System.out.println("a�� Ȧ���Դϴ�.");
			break;
		case 0:
			System.out.println("case 0 blook");
			System.out.println("a�� ¦���Դϴ�.");
			break;
		default:
			System.out.println("default");
			System.out.println("���� �ش��ϴ� case�� �����ϴ�.");
		}
		
		char cmd = 'p';
		
		switch (cmd) {
		case 'p':
			System.out.println("pause");
			break;
		case 'q':
			System.out.println("quit");
			break;
		case 'w':
			System.out.println("move forward");
			break;
		case 's':
			System.out.println("move backward");
			break;
		default:
			System.out.println("�ش��ϴ� Ŀ�ǵ尡 �����ϴ�.");
		}
	}
}
