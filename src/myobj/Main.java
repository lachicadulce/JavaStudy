package myobj;

public class Main {

	public static void main(String[] args) {
//		Barrack b1 = new Barrack();
//
//		b1.createSheep();
//		b1.createSheep();
//		b1.createSheep();
//		b1.createCow();
//		b1.createCow();
//		b1.createCow();
//
//		System.out.println(b1.queue[0].name);
//		System.out.println(b1.queue[1].name);
//		System.out.println(b1.queue[2].name);
//		System.out.println(b1.queue[3].name);
//		System.out.println(b1.queue[4].name);
		
//		Bill b1 = new Bill();
//
//		b1.orderBlackMilkTea();
//		b1.orderUrongMilkTea();
//		b1.orderUrongTea();
//		b1.orderBlackMilkTea();
//		b1.orderUrongMilkTea();
//		b1.orderUrongTea();
//		b1.orderBlackMilkTea();
//		b1.orderUrongMilkTea();
//		b1.orderUrongTea();
//		b1.orderUrongTea();
//		b1.orderUrongTea();
//		
//		System.out.println(b1.queue[0].name);
//		System.out.println(b1.queue[1].name);
//		System.out.println(b1.queue[2].name);
//		System.out.println(b1.queue[3].name);
//		System.out.println(b1.queue[4].name);
//		System.out.println(b1.queue[5].name);
//		System.out.println(b1.queue[6].name);
//		System.out.println(b1.queue[7].name);
//		System.out.println(b1.queue[8].name);
//		System.out.println(b1.queue[9].name);
		
		
		Weapon w1 = new Weapon();
		
		w1.attack();
		System.out.println();
		
		for (int i = 0; i < 100; i++) {
			w1.powerUp();
			w1.attack();
			System.out.println();
		}
		
	}
}
