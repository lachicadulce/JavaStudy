package myobj.item;

public class Watch extends Item {

	public Watch(String name, int price) {
		super(name, price);
	}

	@Override
	public void use() {
		System.out.println("���� �ð� Ȯ���ϱ�");
	}
}
