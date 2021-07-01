package myobj.item;

public class Main {

	int money;
	
	public Main() {
		money = 1600000;
	}
	
	public void purchase(Item item) {
		this.money -= item.price;
		System.out.println(item.name + "을 사고 " + this.money + "원이 남았습니다.");
	}
	
	public static void main(String[] args) {
		Main m = new Main();

		m.purchase(new Bag("eco bag", 5000));
		m.purchase(new Watch("Apple Watch", 540000));
		m.purchase(new Cellphone());
	}
}
