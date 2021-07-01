package myinterface;

public class Sanitizer implements Bottle{

	int max;
	int current;
	
	public Sanitizer(int max) {
		this.max = max;
		current = max;
	}
	
	@Override
	public int drain() {
		if (current != 0) {
			current -= 5;
		} else {
			System.out.println("It's empty!!");
		}
		return current;
	}
	
	@Override
	public int fill() {
		if (current < max) {
			current += 10;
		} else {
			System.out.println("It's full.");
		}
		return current;
	}
	
	void use(Bottle bottle) {
		for (int i = 0; i < 30; i++) {
			System.out.println("use senitizer");
			bottle.drain();
		}
		for (int i = 0; i < 15; i++) {
			System.out.println("filling sanitizer");
			bottle.fill();
		}
	}
}
