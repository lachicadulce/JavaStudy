package myinterface;

public class Main {

	public static void main(String[] args) {
		
		// vehicle 인터페이스를 구현한 무언가를 만들고 테스트해보세요
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
			System.out.println("속도를 더 냈습니다.");
			System.out.println("현재 속도는 " + vehicle.acceleration() + "km/h 입니다.");
		}

		System.out.println("무서워서 속도를 감소합니다.");
		for(int i = 0; i < 30; ++i) {
			System.out.println("현재 속도는 " + vehicle.deceleration() + "km/h 입니다.");
		}
		
		for(int i = 0; i < 15; ++i) {
			if(!vehicle.ride()) {
				System.out.println("더 이상 탈 수 없습니다.");
			} else {
				System.out.println("한명이 더 탔습니다.");
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
