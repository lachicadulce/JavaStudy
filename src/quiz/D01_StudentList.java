package quiz;

import java.util.ArrayList;

public class D01_StudentList {

	/*
	 	�л� Ŭ������ ��ҷ� ���� ArrayList�� �����ϰ� �л��� 30�� �߰��غ�����
	 	
	 	 1. �� �л��� ������ �������� ����
	 	 2. ������ ��/��/��
	 	 3. 30���� ��� ������ ���
	 	 4. 30�� �� ���� ��������� ���� �л��� ������ ���
	 */

	
	public static void main(String[] args) {
		double topAverage = 0;
		int topNumber = 0;
		ArrayList<StudentInfo> students = new ArrayList<>();
		
		System.out.println("-------------------30���� �л� ���------------------");
		for (int i = 0; i < 30; i++) {
			System.out.print((1+i) + "�� �л� ");
			students.add(new StudentInfo());
			if (students.get(i).average > topAverage) {
				topAverage = students.get(i).average;
				topNumber = i + 1;
			}
		}
		System.out.printf("���� ��� ������ ���� �л��� %d�� �л��̰� ��� ������ %.2f�� �̴�.", topNumber, topAverage);
	}
	

}

class StudentInfo {

	int korean;
	int english;
	int math;
	double average;
	
	public StudentInfo() {
		korean = (int)(Math.random() * 101);
		english = (int)(Math.random() * 101);
		math = (int)(Math.random() * 101);
		average = ((korean + english + math) / 3.0);
		System.out.printf("����: %d��, ����: %d��, ����: %d��, ���: %.2f��\n", korean, english, math, average);
	}
}