package quiz;

import java.util.ArrayList;

public class D01_StudentList {

	/*
	 	학생 클래스를 요소로 갖는 ArrayList를 생성하고 학생을 30명 추가해보세요
	 	
	 	 1. 각 학생의 점수는 랜덤으로 설정
	 	 2. 과목은 국/영/수
	 	 3. 30명의 평균 점수를 출력
	 	 4. 30명 중 가장 평균점수가 높은 학생의 성적을 출력
	 */

	
	public static void main(String[] args) {
		double topAverage = 0;
		int topNumber = 0;
		ArrayList<StudentInfo> students = new ArrayList<>();
		
		System.out.println("-------------------30명의 학생 명단------------------");
		for (int i = 0; i < 30; i++) {
			System.out.print((1+i) + "번 학생 ");
			students.add(new StudentInfo());
			if (students.get(i).average > topAverage) {
				topAverage = students.get(i).average;
				topNumber = i + 1;
			}
		}
		System.out.printf("가장 평균 점수가 높은 학생은 %d번 학생이고 평균 점수는 %.2f점 이다.", topNumber, topAverage);
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
		System.out.printf("국어: %d점, 영어: %d점, 수학: %d점, 평균: %.2f점\n", korean, english, math, average);
	}
}