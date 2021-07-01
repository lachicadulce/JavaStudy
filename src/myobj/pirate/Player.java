package myobj.pirate;

public class Player {
	
	
	String name;
	int win;
	int lose;
	
	public Player(String name) {
		this.name = name;
	}
	
	public void win() {
		win++;
	}
	
	public void lose() {
		lose++;
	}
	
	public String getName() {
		return name;
	}
	
	public void printScore() {
		System.out.printf("%s���� �¸�: %d, �й�: %d\n", name, win, lose);
	}
}
