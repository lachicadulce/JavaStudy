package quiz;

import myobj.GongCha;

public class C07_School {

	/*
	 	1. 각 반의 정원은 30명이다.
	 	2-1. 프로그래밍 반 학생들은 각자의 국어, 영어, 수학, 프로그래밍 언어, 알고리즘, 자료구조 점수가 있다
	 	2-2. 네트워크 반 학생들은 각자의 국어, 영어, 리눅스, 네트워크, CCNA 점수가 있다
	 	2-3. 머신러닝 반 학생들은 각자의 국어, 영어, 수학, 통계학, 프로그래밍 언어 점수가 있다
	 	3. 모든 학생의 과목별 점수와 이름을 랜덤으로 생성한다.
	 	   학번은 중복없이 순차적으로 생성되어야 한다. (또는 중복없이 랜덤도 가능)
	 	4. 성적표 메서드를 통해 각 학생의 이름/총점/평균점수를 볼 수 있어야 한다.
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
	String[] names = {"소영", "연하", "은정", "소연", "유진", "여진", "윤정", "소현", "수영", "수지",
			"채린", "지수", "수빈", "민수", "윤희", "한욱", "치수", "예림", "호선", "민지",
			"지안", "대한", "민국", "만세", "채원", "가람", "성민", "현수", "영서", "정원"};
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
		System.out.println("[프로그래밍반] 번호: " + super.no + ", 이름: " + super.name + ", 총점: " + super.sum + ", 평균점수: " + super.sum / super.subjectsCnt);
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
		System.out.println("[네트워크반] 번호: " + super.no + ", 이름: " + super.name + ", 총점: " + super.sum + ", 평균점수: " + super.sum / super.subjectsCnt);
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
		System.out.println("[머신러닝반] 번호: " + super.no + ", 이름: " + super.name + ", 총점: " + super.sum + ", 평균점수: " + super.sum / super.subjectsCnt);
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
			System.out.println("정원초과.");
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