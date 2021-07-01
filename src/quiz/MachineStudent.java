package quiz;

public class MachineStudent extends Student {

	int math;
	int statistics;
	int pl;
	
	MachineStudent() {
		math = generateRandomScore();
		statistics = generateRandomScore();
		pl = generateRandomScore();
	}
	
	int getSum() {
		return (kor + eng + math + statistics + pl);
	}
	
	double getAverage() {
		return getSum() / 5.0;
	}
	
	@Override
	void printGradeCard() {
		System.out.println("������������������������������������������������������������������������������������������������");
		System.out.println("�� �̸�: " + name + " ����: " + getSum() + " ���: " + getAverage() + "    ��");
		System.out.println("�� ����\t����\t����\t�����\tPL    ��");
		System.out.printf("�� %d\t%d\t%d\t%d\t%d\n", kor, eng, math, statistics, pl);
		System.out.println("������������������������������������������������������������������������������������������������");
	}

}
