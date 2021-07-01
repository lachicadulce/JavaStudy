package myobj.item;

public class Cellphone extends Item {

	public Cellphone() {
		super("iphone12mini", 1000000);
	}

	@Override
	public void use() {
		System.out.println("전화 받기");		
	}
}
