package quiz;

public class C07_School_teacher {

	public static void main(String[] args) {
		Student[] school = new Student[30];

		System.out.println("���α׷��� �л����� ����");
		for (int i = 0; i < school.length; ++i) {
			school[i] = new ProgrammingStudent();
			school[i].printGradeCard();
		}
		System.out.println("��Ʈ��ũ �л����� ����");
		for (int i = 0; i < school.length; ++i) {
			school[i] = new NetworkStudent();
			school[i].printGradeCard();
		}
		System.out.println("�ӽŷ��� �л����� ����");
		for (int i = 0; i < school.length; ++i) {
			school[i] = new MachineStudent();
			school[i].printGradeCard();
		}
	}
}
