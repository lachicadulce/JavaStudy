package myobj.item;

public class Bag extends Item {
	
	public Bag(String name, int price) {
		super(name, price);
	}
	
	@Override
	public void use() {
		System.out.println("물건 담기");
	}
}
