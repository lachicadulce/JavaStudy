package quiz;

import java.util.Scanner;

public class C07_PirateGame {

	/*
		1. �÷��̾�� ���ϴ� ���� ���ư��鼭 Į�� ���
		
		2. ���� �������� ���ư��� ������ �������� �����ȴ�
		
		3. �÷��̾�� �������� �� �� �ִ� (�ּ� 2��, �ִ�� ���� ���ڸ�ŭ)
		
		4. �� ���� ������ ���� ������ ������ �� �ִ�
		
		5. ���� �������� ���� �÷��̾ �й��Ѵ�
	 */
	
	int people; // �÷��̾� ��
	int holes; // ���� ��
	int[] mrNum; // ���� ��ȣ���� ��� �迭
	int pickNum; // �÷��̾ ������ ��
	int[] hole; // ������ ũ�⸸ŭ�� ���� �迭 (0�̸� Į�� �Ȳ�����, 1�̸� ������)
	
	C07_PirateGame(int people, int holes){
		this.people = people;
		this.holes = holes;
		hole = new int[holes];
		// ���� ������ 1�� ~ ��ü �����Ǽ� / 3���� ����
		mrNum = new int[(int)(Math.random() * (holes / 3 < 1 ? 1 : holes / 3) + 1)];
	}
	
	// ���� ���� �������� ���ϱ�
	void randomHoles() {
		int randomNum;
		int numLen = mrNum.length;
		boolean check = false;
		for(int i = 0; i < numLen; ) {
			randomNum = (int)(Math.random() * holes);
			check = false;
			
			// ���� ������ ��ġ���� Ȯ��
			for(int j = 0; j < numLen; j++) {
				if(mrNum[j] == randomNum) {
					check = true;
					break;
				}
			}
			if(!check) {
				mrNum[i] = randomNum;
				i++;
			}
			
		}
		
		// ���� ������ ��ȣ Ȯ�ο�
//		for(int i = 0; i < numLen; i++) {
//			System.out.println(mrNum[i] + 1);
//		}
	}
	
	// 0�� ��� 1�� ��� hole �迭 ���
	void printHoles() {
		for (int i = 0; i < holes; i++) {
			System.out.printf("%d��°: %s ", i+1, (hole[i] == 0) ? "��" : "��");
		}
		System.out.println();
	}
	
	// �̹� Į�� ���� ��ġ���� Ȯ��
	boolean checkEmptyHoles() {
		return hole[pickNum-1] == 1;
	}
	
	// ������ȣ�� ������ Ȯ��
	boolean checkHoles() {
		for (int i =0; i < mrNum.length; i++) {
			if (pickNum-1 == mrNum[i]) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int people = 0;
		int holes = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(people < 2) {
			System.out.print("�÷��̾� �� (2�� �̻�): ");
			people = sc.nextInt();
		}
		
		// ����� �̻��� ������ �Է�
		while(holes < people) {
			System.out.printf("���� �� (%d�� �̻�): ", people);
			holes = sc.nextInt();
		}
		
		C07_PirateGame pg = new C07_PirateGame(people, holes);
		pg.randomHoles();
		int i = 0;
		
		// ���۸�ŭ�� �ݺ� (������ �����ϸ� break;)
		while(i <= holes) {
			System.out.printf("�÷��̾�%d�� ��� ���ۿ� Į�� ��ſ���? (1 ~ %d): ",i % people + 1, holes);
			pg.pickNum = sc.nextInt();
			
			// �ùٸ� ���� ��ȣ Ȯ��
			if (pg.pickNum <= 0 || pg.pickNum > holes) {
				continue;
			}
			
			// ������ Į�� �žƵ� �Ǵ� �������� �´ٸ� ������ �ƴ��� Ȯ��
			if(!pg.checkEmptyHoles()) {
				if (!pg.checkHoles()) {
					pg.hole[pg.pickNum - 1] = 1;
					pg.printHoles();
					i++;
					System.out.println();
				} else {
					System.out.println("���� �������� ��Ÿ����!!!!!");
					System.out.printf("�÷��̾�%d���� �����.", i % people + 1);
					break;
				}
				
			} else {
				System.out.println("�� ������ �̹� Į�� �����־��!");
				continue;
			}
		}
	}
	
	
}

