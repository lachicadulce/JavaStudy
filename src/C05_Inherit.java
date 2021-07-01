
public class C05_Inherit {

	/*
		# Ŭ���� ���
		
		 - ������ �̸� ����� �״� Ŭ������ �״�� �����޾Ƽ� ����ϴ� ��
		 - �������� �Ŀ��� �ش� Ŭ������ ������� ���ļ� ����� �� �ִ� (Override)
		 - ������ �����ϸ鼭 ���Ӱ� �����غ� �� �ִ� ���� �����̴�
		 - ��ӹ޴� Ŭ������ �ڽ� Ŭ���� �Ǵ� ���� Ŭ������� �θ���
		 - ������ִ� Ŭ������ �θ� Ŭ���� �Ǵ� ���� Ŭ������� �θ���
		 
		# ����� ��Ģ
		 
		 - extends��� Ű���带 ����Ѵ�
		 - �����ڿ��� �ݵ�� ���� ���� �θ� Ŭ������ �����ڸ� ȣ���ؾ� �Ѵ�
		 - �θ� Ŭ������ �ڽ� Ŭ������ �Ȱ��� �̸��� ���� �ڿ��� �ִ� ��쿡��
		   super�� this�� ��Ȯ�ϰ� ������ �� �ִ�
		 - super()�� �θ��� �����ڸ� ���Ѵ� �� this()�� �ڽ��� �����ڸ� ���Ѵ�
	 */
	public static void main(String[] args) {
		Person2 gildong = new Person2("Gildong Go", 42);
		
		gildong.sayHi();
		
		Programmer chulsoo = new Programmer("Chulsoo Kim", 28);

//		Programmer�� sayHi()�� �������� ������ �θ��� �޼��带 �����޾� ����ϰ� �ִ�
		chulsoo.sayHi();
//		�������� �� �ڽ� Ŭ�������� ���� �߰��� �޼���
//		�θ� Ŭ������ ������ �Ѽ����� �ʰ� �߰����� ������ ������ �� �ִ�
		chulsoo.program("Omok");
	}
}

class Person2 {
	String name;
	int age;
	
	Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void sayHi() {
		System.out.println("Hi? My name is " + name + ". I'm " + age + ".");
	}
}

// Person2 Ŭ������ ��ӹ��� Programmer Ŭ����
class Programmer extends Person2 {

	Programmer(String name, int age) {
		super(name, age);
	}
	
	void program(String to_program) {
		System.out.println("Programmer, " + name + " will make " + to_program + ".");
	}
	
//	Override(¢���) : �ڽ� Ŭ������ �θ��� �޼��带 ������� �����ؼ� ����� �� �ִ�.
	void sayHi() {
		System.out.println(name + " said \"Hello, world!\"");
	}
}

class Tree {
	Tree(int abc) {
		
	}
}

class OrangeTree extends Tree {
	public OrangeTree() {
		super(123); // �θ�Ŭ������ �⺻ �����ڰ� �ִ� ���� super()�� ������ �� �ִ�
	}
}



