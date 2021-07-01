package quiz;

public class NetworkStudent extends Student {

	int linux;
	int net;
	int ccna;
	
	NetworkStudent() {
		linux = generateRandomScore();
		net = generateRandomScore();
		ccna = generateRandomScore();
	}
	
	int getSum() {
		return kor + eng + linux + net + ccna;
	}
	
	double getAverage() {
		return getSum() / 5.0;
	}
	
	@Override
	void printGradeCard() {
		System.out.println("┌──────────────────────────────────────────────┐");
		System.out.println("│ 이름: " + name + " 총점: " + getSum() + " 평균: " + getAverage() + "    │");
		System.out.println("│ 국어\t영어\t리눅스\t네트워크\tCCNA");
		System.out.printf("│ %d\t%d\t%d\t%d\t%d\n", kor, eng, linux, net, ccna);
		System.out.println("└──────────────────────────────────────────────┘");
	}

}
