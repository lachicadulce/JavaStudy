
public class A01_Escape {
 /*
 	# Escape ����
 	
 	- Ư���� ����� ���� ���ڵ�
 	- �׳� ����Ϸ��� �ϸ� ������ �߻��� ������ �ִ� ���ڵ�
 	- �տ� \(��������)�� ���� ���ڴ� Escape ���ڷ� �����Ѵ�
 	- �տ� ���� \�� ���� ���ڸ� �ϳ��� ���ڷ� �ν��Ѵ�
 */
	public static void main(String[] args) {
		System.out.println("1. �ȳ��ϼ���, �ݰ����ϴ�.");
//		 \n �� �ٲ��� ����� ���� Ư�� ���� (Linefeed, Breakline, Newline ...)
		System.out.println("2. �ȳ��ϼ���, ��\n��\n���ϴ�.");
//		 \t TabŰ�� ����� ���� Ư�� ����
		System.out.println("3. �ȳ��ϼ���, ��\t��\t���ϴ�.");
//		 \\ Escape�� ����� ������� �ʰ� �׳� �������ø� ����ϰ� ���� �� ���
		System.out.println("4. �ȳ��ϼ���, ��\\��\\���ϴ�.");
		System.out.println("C:\\Program files\\java\\jdk 11.0.11");
		System.out.println("\\n �ٹٲٴ� ����� �Ѵ�");
		System.out.println("\\t �� Ű�� ����� �Ѵ�");
		
//		\" \' ", '�� ����� ������� �ʰ� �׳� ", '�� ����ϰ� ���� �� ���
		System.out.println("�׷��� ���� ���߽��ϴ� \"���� ���ؿ�\"");
		System.out.println("�׷��� ���� ���߽��ϴ� '���� ���ؿ�'");
		System.out.println('\'');
		
		
	}
}
