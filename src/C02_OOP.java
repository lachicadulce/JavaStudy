
public class C02_OOP {

	/*
		# ��ü���� ���α׷��� (OOP: Object Oriented Programming)
			- ���� �����ϴ� ��� �͵��� ������ �Լ��� ǥ���Ϸ��� ���α׷��� �����
			- ������ �Լ��� ���к��ϰ� ����ϱ� ���ٴ�
			  ���ǿ� �����ϴ� ��ü ������ ��� ǥ���Ͽ� �������� �ø���
			- ��ü(Object) : ���� �����ϴ� ��� �� (�繰, ����, .. ���)
			
			ex: ���
				- ����� ���� : ũ��, �絵, ����, Į�θ�, �������, ���...
				- ����� �Լ�
					�Դ´� (ũ�Ⱑ �پ��鼭 Į�θ���ŭ ���� ����� Į�θ� ����)
					���� ���Ѵ�
					��������� �پ���
					������ (ũ�⸸ŭ�� �������� ������)
					����� �����Ѵ� (��������� ������ �����Ѵ�)
					
			�� Ŭ������ ���� �ִ� �Լ����� �޼����� �θ��� (JAVA���� �޼���ۿ� ����)
		
		# Ŭ���� (Class)
		 - ��ü�� ���α׷��� ���� ǥ���� ��
		 - Ŭ������ �ش� ��ü�� ���赵�� (������ ���������� ��ü�� ����)
		 - ���赵��� ���� ���� ��ü�� '�ν��Ͻ�'��� �θ���
		 - Ŭ������ ������ ���� Ÿ���̴�
	 */
	
//	public static void main(String[] args) {
//		Apple a1 = new Apple();
//		Apple a2 = new Apple();
//		Apple a3 = new Apple();
//		
//		a1.size = 15;
//		a1.color = "������";
//
//		a2.size = 13;
//		a2.color = "�����";
//		
//		a3.size = 25;
//		a3.calorie = 100;
//
//		System.out.println(a1.color);
//		System.out.println(a2.color);
//
//		System.out.println("�Ա� �� a3�� ũ��: " + a3.size);
//		System.out.println("�Ա� �� a3�� Į�θ�: " + a3.calorie);
//		
//		a3.eat();
//		System.out.println("���� �� a3�� ũ��: " + a3.size);
//		System.out.println("���� �� a3�� Į�θ�: " + a3.calorie);
//	}
	
	public static void doSomething(int a, String b, char c, float d, double e) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
	}
	
	public static void main(String[] args) {
		String flavor = "choco";
		String color = "mint";
		int price = 1500;
		int calorie = 800;
		String product = "nongshim";
		String type = "bar";
		
		IceCream gugucon = new IceCream();
		
		IceCream[] icebox = new IceCream[10];
		icebox[0] = new IceCream();
		System.out.println(icebox[0].flavor);
		System.out.println(gugucon.color);
		System.out.println(gugucon.price);
	}
	
//	public static void main(String[] args) {
//		Person yang = new Person();
//		
//		yang.age = 30;
//		yang.tall = 175.4;
//		yang.job = "������";
//		yang.salary = 4000;
//		yang.promotion = false;
//		yang.weight = 76;
//		
//		System.out.println("�ʱ�ȭ");
//		System.out.printf("tall: %.1f, weight: %.1f, job: %s, salary: %.1f\n", yang.tall, yang.weight, yang.job, yang.salary);
//		yang.getOld();
//		yang.workOneYear();
//		System.out.println("1�� ��");
//		System.out.printf("tall: %.1f, weight: %.1f, job: %s, salary: %.1f\n", yang.tall, yang.weight, yang.job, yang.salary);
//
//		yang.promotion = true;
//		yang.getOld();
//		yang.workOneYear();
//		System.out.println("1�� �� (����)");
//		System.out.printf("tall: %.1f, weight: %.1f, job: %s, salary: %.1f\n", yang.tall, yang.weight, yang.job, yang.salary);
//		
//	}
	
	public static void doSomething(Box box) {
		System.out.println(box.a);
		System.out.println(box.b);
		System.out.println(box.c);
		System.out.println(box.d);
		System.out.println(box.e);
	}
}


class IceCream {
	String flavor;
	String color;
	int price;
	int calorie;
	String product;
	String type;
	
}

class Box {
	int a;
	String b;
	char c;
	float d;
	double e;
}

class Person {
	double tall;
	double weight;
	String job;
	int age;
	double salary;
	boolean promotion;
	
	void getOld() {
		age++;
		if (age < 20) {
			tall+= 3;
			weight += 5;
		} else if (age > 60) {
			tall -= 0.1;
			weight -= 0.2;
		}
	}
	
	void workOneYear() {
		if(promotion) {
			salary *= 1.1;
		} else {
			salary *= 1.05;
		}
	}
}

class Apple {
	
//	# �ν��Ͻ� ����
//	�ν��Ͻ� ���� ������ ������ ������ �ִ� ������
	int size;
	double sweet;
	String color;
	int calorie;
	
	/*
	 * # �ν��Ͻ� ���
	 *  - �ν��Ͻ� ������ ���� �ش� �ν��Ͻ��� ���¸� ��ȭ��Ű�� �޼���
	 */
	void eat() {
		size--;
		calorie -= 10;
	}
}


/*
	��������: ������ ��ü�� �����Ͽ� Ŭ������ �ϳ� ������ �� �ν��Ͻ��� �����ϰ� ���� ä����� ����غ�����
	
	�� �ν��Ͻ� ������ 3�� �̻�, �ν��Ͻ� �޼��� 2�� �̻�, ���� ����
*/



class Window {
	boolean open;
	boolean lock;
	
	void open() {
		open = true;
	}
	
	void close() {
		open = false;
	}
	
	void lock() {
		lock = true;
	}
	
	void unlock() {
		
	}
	void status() {
		System.out.printf("�� â���� %s. [%s]", open ? "�����ֽ��ϴ�" : "�����ֽ��ϴ�", lock ? "����ֽ��ϴ�" : "��������ʽ��ϴ�");
	}
	String getStatus() {
		return String.format("�� â���� %s. [%s]\n", open ? "�����ֽ��ϴ�" : "�����ֽ��ϴ�", lock ? "����ֽ��ϴ�" : "������������Դϴ�");
	}
}
