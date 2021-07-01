package myobj;

public class Weapon {

	/*
		������ �Ӽ�
		 - ���ݷ�
		 - ���� ��ȭ ���
		 - ��ȭ ��޺� ��ȭ Ȯ�� (��޸��� ��ȭ Ȯ���� �ٸ�)
		 - ��ȭ ��޺� ���ݷ� ������
		 
		������ �޼���
		 - ��ȭ�ϱ�
		   ��ȭ ��޺� ��ȭ Ȯ���� ���� ��ȭ�� �����ϰų� �����Ѵ� (����)
		   �����ϸ� ��ȭ ����� 1 �����Ѵ�
		   �����ϸ� ��ȭ ����� �״�� �����ȴ� (���Ѵٸ� ����߷��� ����)
		 
		 - �����ϱ�
		   ���ݷ��� Ȯ���� �� �ִ�
	 */
	
	int power; // ���ݷ�
	int level; //���� ��ȭ ���
	int levelPer; // ��ȭ ��޺� ��ȭ Ȯ��
	int powerGap; // ��ȭ ��޺� ���ݷ� ������
	
//	Weapon() {
//		level = 1;
//		levelPer = 100;
//		powerGap = 50;
//		System.out.printf("successed make your weapon. your weapon level: %d\n", level);
//		System.out.printf("���ݷ� ������: %d, ��ȭ Ȯ��:%d\n", powerGap, levelPer);
//	}
	
	void powerUp() {
		int success = (int)(Math.random() * 100);
		if (success < levelPer) {
			level++;
			power += powerGap;
			if (levelPer - 2 >= 0) {
				levelPer -= 2;
			}
			powerGap += 20;
			System.out.printf("��ȭ ����!!. ���� ��ȭ ���: %d\n", level);
			System.out.printf("���ݷ� ������: %d, ��ȭ Ȯ��:%d\n", powerGap, levelPer);
		} else {
			System.out.printf("��ȭ ����!!. ���� ��ȭ ���: %d\n", level);
			System.out.printf("���ݷ� ������: %d, ��ȭ Ȯ��:%d\n", powerGap, levelPer);
		}
	}
	
	void attack() {
		System.out.printf("���ݷ�: %d\n", power);
	}
	
	
	
	
//	�����
	String name;
	int base_attack, attack;
	int grade;
	int[] upgrade_chance = {90, 90, 80, 80, 80, 70, 70, 30, 30, 30, 15, 15, 15, 10, 10, 10, 10, 5, 5, 5};
	int[] attack_increment = {10,30,100,150,200,300,700,700,700,700,1000,1000,1000,1000,1500,1500,2500,2500,3000,3500};
	
	Weapon(){
		name = "��������";
		base_attack = 5;
		grade = 1;
	}
	
	Weapon(int attack, String name) {
		this.base_attack = attack;
		this.name = name;
		grade = 0;
	}
	
	boolean upgrade() {
		int value = (int)(Math.random() * 100);
		
		if (value < upgrade_chance[grade]) {
			System.out.printf("\"%s %+d\" ��ȭ�� �����ϼ̽��ϴ�!\n ", name, grade);
			grade++;
			return true;
		} else {
			System.out.println("��ȭ ����...\n");
			return false;
		}
	}
	
	void attack2() {
		int damage = attack;
		
		for (int i = 0; i < grade; ++i) {
			damage += attack_increment[i];
		}
		System.out.printf("\"%s %+d\"�� �ֵѷ����ϴ�. [������:%d]\n", name, grade, attack + attack_increment[grade]);
	}
	public static void main(String[] args) {
//	��ü ������ ���� ���� �޼��尡 ���ο��� ��� ���� ������ �����ϸ鼭 ����� ���� ����
		Weapon gun = new Weapon(10, "�񴰹�� ��");
		
		for(int i = 0; i < 30; ++i) {
			gun.upgrade();
		}
		
		gun.attack2();
	}
}
