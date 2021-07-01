package quiz;

import myobj.GongCha;

public class C07_School {

	/*
	 	1. �� ���� ������ 30���̴�.
	 	2-1. ���α׷��� �� �л����� ������ ����, ����, ����, ���α׷��� ���, �˰���, �ڷᱸ�� ������ �ִ�
	 	2-2. ��Ʈ��ũ �� �л����� ������ ����, ����, ������, ��Ʈ��ũ, CCNA ������ �ִ�
	 	2-3. �ӽŷ��� �� �л����� ������ ����, ����, ����, �����, ���α׷��� ��� ������ �ִ�
	 	3. ��� �л��� ���� ������ �̸��� �������� �����Ѵ�.
	 	   �й��� �ߺ����� ���������� �����Ǿ�� �Ѵ�. (�Ǵ� �ߺ����� ������ ����)
	 	4. ����ǥ �޼��带 ���� �� �л��� �̸�/����/��������� �� �� �־�� �Ѵ�.
	 */
	public static void main(String[] args) {
		Students s1 = new Students();
		
		for(int i = 0; i < 30; i++) {
			s1.addStudent();
		}
		for(int i = 0; i < 30; i++) {
			s1.reportcard();
		}
	}
	
}

abstract class Classes {
	int no;
	String name;
	String[] names = {"�ҿ�", "����", "����", "�ҿ�", "����", "����", "����", "����", "����", "����",
			"ä��", "����", "����", "�μ�", "����", "�ѿ�", "ġ��", "����", "ȣ��", "����",
			"����", "����", "�α�", "����", "ä��", "����", "����", "����", "����", "����"};
	double koreanScore, englishScore;
	int subjectsCnt;
	double sum;
	
	Classes(int no, int name, int subjectsCnt, double koreanScore, double englishScore) {
		this.no = no;
		this.name = names[name];
		this.subjectsCnt = subjectsCnt;
		this.koreanScore = koreanScore;
		this.englishScore = englishScore;
		sum = koreanScore + englishScore;
	}
	abstract void reportCard();
}

class Programming extends Classes {

	double mathScore, programmingScore, algorithmScore, dataStructureScore;

	Programming(int no) {
		super(no, (int)(Math.random() * 30), 6, (int)(Math.random() * 101), (int)(Math.random() * 101));
		this.mathScore = (int)(Math.random() * 101);
		this.programmingScore = (int)(Math.random() * 101);
		this.algorithmScore = (int)(Math.random() * 101);
		this.dataStructureScore = (int)(Math.random() * 101);
		super.sum += this.mathScore + this.programmingScore + this.algorithmScore + this.dataStructureScore;
	}
	@Override
	void reportCard() {
		System.out.println("[���α׷��ֹ�] ��ȣ: " + super.no + ", �̸�: " + super.name + ", ����: " + super.sum + ", �������: " + super.sum / super.subjectsCnt);
	}
	
}

class Network extends Classes {

	double linuxScore, networkScore, ccnaScore;
	
	Network(int no) {
		super(no, (int)(Math.random() * 30), 5, (int)(Math.random() * 101),(int)(Math.random() * 101));
		this.linuxScore = (int)(Math.random() * 101);
		this.networkScore = (int)(Math.random() * 101);
		this.ccnaScore = (int)(Math.random() * 101);
		super.sum += this.linuxScore + this.networkScore + this.ccnaScore;
	}

	@Override
	void reportCard() {
		System.out.println("[��Ʈ��ũ��] ��ȣ: " + super.no + ", �̸�: " + super.name + ", ����: " + super.sum + ", �������: " + super.sum / super.subjectsCnt);
	}
	
}

class MachineLearning extends Classes {

	double mathScore, statisticsScore, programmingScore;
	
	MachineLearning(int no) {
		super(no, (int)(Math.random() * 30), 5, (int)(Math.random() * 101), (int)(Math.random() * 101));
		this.mathScore = (int)(Math.random() * 101);
		this.statisticsScore = (int)(Math.random() * 101);
		this.programmingScore = (int)(Math.random() * 101);
		super.sum += this.mathScore + this.statisticsScore + this.programmingScore;
	}

	@Override
	void reportCard() {
		System.out.println("[�ӽŷ��׹�] ��ȣ: " + super.no + ", �̸�: " + super.name + ", ����: " + super.sum + ", �������: " + super.sum / super.subjectsCnt);
	}
	
}

class Students {
	final int MAX_NO = 30;
	int index;
	Programming[] queue1;
	Network[] queue2;
	MachineLearning[] queue3;
	
	Students() {
		queue1 = new Programming[MAX_NO];
		queue2 = new Network[MAX_NO];
		queue3 = new MachineLearning[MAX_NO];
	}
	
	boolean checkMaxNo() {
		return index == MAX_NO;
	}
	
	void addStudent() {
		if(checkMaxNo()) {
			System.out.println("�����ʰ�.");
			return;
		}
		queue1[index] = new Programming(index + 1);
		queue2[index] = new Network(index + 1);
		queue3[index] = new MachineLearning(index + 1);
		index++;
	}
	
	void reportcard() {
		for(int i = 0; i < 30; i++) {
			queue1[i].reportCard();
//			queue2[i].reportCard();
//			queue3[i].reportCard();
		}
		for(int i = 0; i < 30; i++) {
//			queue1[i].reportCard();
			queue2[i].reportCard();
//			queue3[i].reportCard();
		}
		for(int i = 0; i < 30; i++) {
//			queue1[i].reportCard();
//			queue2[i].reportCard();
			queue3[i].reportCard();
		}
	}
}