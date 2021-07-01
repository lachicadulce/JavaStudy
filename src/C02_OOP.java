
public class C02_OOP {

	/*
		# 객체지향 프로그래밍 (OOP: Object Oriented Programming)
			- 세상에 존재하는 모든 것들을 변수와 함수로 표현하려는 프로그래밍 방법론
			- 변수와 함수를 무분별하게 사용하기 보다는
			  현실에 존재하는 객체 단위로 묶어서 표현하여 가독성을 올린다
			- 객체(Object) : 세상에 존재하는 모든 것 (사물, 개념, .. 등등)
			
			ex: 사과
				- 사과의 변수 : 크기, 당도, 색깔, 칼로리, 유통기한, 모양...
				- 사과의 함수
					먹는다 (크기가 줄어들면서 칼로리만큼 먹은 사람의 칼로리 증가)
					색이 변한다
					유통기한이 줄어든다
					던진다 (크기만큼의 데미지를 입힌다)
					냉장고에 보관한다 (유통기한이 느리게 감소한다)
					
			※ 클래스에 딸려 있는 함수들을 메서드라고 부른다 (JAVA에는 메서드밖에 없다)
		
		# 클래스 (Class)
		 - 객체를 프로그래밍 언어로 표현한 것
		 - 클래스는 해당 객체의 설계도다 (정의한 시점에서는 실체가 없다)
		 - 설계도대로 찍어내는 실제 객체를 '인스턴스'라고 부른다
		 - 클래스는 참조형 변수 타입이다
	 */
	
//	public static void main(String[] args) {
//		Apple a1 = new Apple();
//		Apple a2 = new Apple();
//		Apple a3 = new Apple();
//		
//		a1.size = 15;
//		a1.color = "빨간색";
//
//		a2.size = 13;
//		a2.color = "보라색";
//		
//		a3.size = 25;
//		a3.calorie = 100;
//
//		System.out.println(a1.color);
//		System.out.println(a2.color);
//
//		System.out.println("먹기 전 a3의 크기: " + a3.size);
//		System.out.println("먹기 전 a3의 칼로리: " + a3.calorie);
//		
//		a3.eat();
//		System.out.println("먹은 후 a3의 크기: " + a3.size);
//		System.out.println("먹은 후 a3의 칼로리: " + a3.calorie);
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
//		yang.job = "개발자";
//		yang.salary = 4000;
//		yang.promotion = false;
//		yang.weight = 76;
//		
//		System.out.println("초기화");
//		System.out.printf("tall: %.1f, weight: %.1f, job: %s, salary: %.1f\n", yang.tall, yang.weight, yang.job, yang.salary);
//		yang.getOld();
//		yang.workOneYear();
//		System.out.println("1년 후");
//		System.out.printf("tall: %.1f, weight: %.1f, job: %s, salary: %.1f\n", yang.tall, yang.weight, yang.job, yang.salary);
//
//		yang.promotion = true;
//		yang.getOld();
//		yang.workOneYear();
//		System.out.println("1년 후 (진급)");
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
	
//	# 인스턴스 변수
//	인스턴스 마다 각자의 영역을 가지고 있는 변수들
	int size;
	double sweet;
	String color;
	int calorie;
	
	/*
	 * # 인스턴스 멧드
	 *  - 인스턴스 변수를 통해 해당 인스턴스의 상태를 변화시키는 메서드
	 */
	void eat() {
		size--;
		calorie -= 10;
	}
}


/*
	연습문제: 현실의 객체를 참고하여 클래스를 하나 생성한 후 인스턴스를 생성하고 값을 채운다음 출력해보세요
	
	※ 인스턴스 변수는 3개 이상, 인스턴스 메서드 2개 이상, 과일 금지
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
		System.out.printf("이 창문은 %s. [%s]", open ? "열려있습니다" : "닫혀있습니다", lock ? "잠겨있습니다" : "잠겨있지않습니다");
	}
	String getStatus() {
		return String.format("이 창문은 %s. [%s]\n", open ? "열려있습니다" : "닫혀있습니다", lock ? "잠겨있습니다" : "잠금해제상태입니다");
	}
}
