package quiz;

public class C07_School_teacher {

	public static void main(String[] args) {
		Student[] school = new Student[30];

		System.out.println("프로그래밍 학생들의 점수");
		for (int i = 0; i < school.length; ++i) {
			school[i] = new ProgrammingStudent();
			school[i].printGradeCard();
		}
		System.out.println("네트워크 학생들의 점수");
		for (int i = 0; i < school.length; ++i) {
			school[i] = new NetworkStudent();
			school[i].printGradeCard();
		}
		System.out.println("머신러닝 학생들의 점수");
		for (int i = 0; i < school.length; ++i) {
			school[i] = new MachineStudent();
			school[i].printGradeCard();
		}
	}
}
