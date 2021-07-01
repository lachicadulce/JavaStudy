package quiz;

public class ProgrammingStudent extends Student {

	int math;
	int pl;
	int al;
	int ds;
	
	public ProgrammingStudent() {
		super(); // 생략가능
		math = generateRandomScore();
		pl = generateRandomScore();
		al = generateRandomScore();
		ds = generateRandomScore();
	}
	
	int getSum() {
		return (kor + eng + math + pl + al + ds);
	}
	
	double getAverage() {
		return getSum() / 6.0;
	}
	@Override
	void printGradeCard() {
		System.out.println("┌──────────────────────────────────────────────┐");
		System.out.println("│ 이름: " + name + " 총점: " + getSum() + " 평균: " + getAverage() + "    │");
		System.out.println("│ 국어\t영어\t수학\tPL\tAL\tDS    │");
		System.out.printf("│ %d\t%d\t%d\t%d\t%d\t%d\n", kor, eng, math, pl, al, ds);
		System.out.println("└──────────────────────────────────────────────┘");
	}
}
