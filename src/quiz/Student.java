package quiz;

abstract public class Student {
	
	static int MAX_SCORE = 100;
	static String[] lastNameArray = {"��", "��", "��", "��", "��", "��", "��", "��", "��", "����", "����", "��",
			"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "����"};
	static String[] firstNameArray = {"��ȯ", "�Ǽ�", "����", "����", "õ��", "�ҿ�", "��ö", "�¸�", "����", "�¹�", "����", "����",
			"��ȣ", "�ѳ�", "����", "�ν�", "����", "��ȣ"};
	static String generateRadomName() {
		return lastNameArray[(int)(Math.random() * lastNameArray.length)]
				+ firstNameArray[(int)(Math.random() * firstNameArray.length)];
	}

	static int generateRandomScore() {
		return (int)(Math.random() * MAX_SCORE + 1);
	}
	
	String name;
	int kor;
	int eng;
	
	public Student() {
		name = generateRadomName();
		kor = generateRandomScore();
		eng = generateRandomScore();
	}
	
	public String getName() {
		return name;
	}
	
	abstract void printGradeCard();
}
