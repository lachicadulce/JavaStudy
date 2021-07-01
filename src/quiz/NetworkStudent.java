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
		System.out.println("������������������������������������������������������������������������������������������������");
		System.out.println("�� �̸�: " + name + " ����: " + getSum() + " ���: " + getAverage() + "    ��");
		System.out.println("�� ����\t����\t������\t��Ʈ��ũ\tCCNA");
		System.out.printf("�� %d\t%d\t%d\t%d\t%d\n", kor, eng, linux, net, ccna);
		System.out.println("������������������������������������������������������������������������������������������������");
	}

}
