package myinterface;

public class Main {

	public static void main(String[] args) {
		
		// vehicle �������̽��� ������ ���𰡸� ����� �׽�Ʈ�غ�����
//		test(new SoCar(6));

		studyLanguage(new Korean("Korean"));
		studyLanguage(new English("English"));
		studyLanguage(new Spanish("Spanish"));
	}
	
	public static void studyLanguage(Language language) {
		language.verbose();
		System.out.print("hello: ");
		language.hello();
		System.out.print("thanks: ");
		language.thanks();
		System.out.print("bye: ");
		language.bye();
		System.out.print("see you later: ");
		language.seeyoulater();
		System.out.println("the end of study!");
		System.out.println();
	}
	
	public static void test(Vehicle vehicle) {
		for(int i = 0; i < 100; ++i) {
			System.out.println("�ӵ��� �� �½��ϴ�.");
			System.out.println("���� �ӵ��� " + vehicle.acceleration() + "km/h �Դϴ�.");
		}

		System.out.println("�������� �ӵ��� �����մϴ�.");
		for(int i = 0; i < 30; ++i) {
			System.out.println("���� �ӵ��� " + vehicle.deceleration() + "km/h �Դϴ�.");
		}
		
		for(int i = 0; i < 15; ++i) {
			if(!vehicle.ride()) {
				System.out.println("�� �̻� Ż �� �����ϴ�.");
			} else {
				System.out.println("�Ѹ��� �� �����ϴ�.");
			}
		}
	}
}

class SoCar implements Vehicle {
	int currentSpeed;
	int passengers;
	int seat;
	
	public SoCar(int seat) {
		this.seat = seat;
	}
	
	@Override
	public int acceleration() {
		return ++currentSpeed;
	}
	
	@Override
	public int deceleration() {
		return --currentSpeed;
	}
	
	@Override
	public boolean ride() {
		if(passengers < seat) {
			passengers++;
			System.out.println("passengers: "+ passengers);
			return true;
		} else {
			System.out.println("All seats are occupied.");
			return false;
		}
	}
}
