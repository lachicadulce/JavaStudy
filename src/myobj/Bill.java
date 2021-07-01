package myobj;

public class Bill {

	final int MAX_QUEUE_SIZE = 10;
	int queue_index;
	GongCha[] queue;
	
	Bill() {
		queue = new GongCha[MAX_QUEUE_SIZE];
	}
	
	boolean checkMaxQueue() {
		return queue_index == MAX_QUEUE_SIZE;
	}

	void orderUrongMilkTea() {
		if(checkMaxQueue()) {
			System.out.println("주문 대기열 가득참. 우롱밀크티 추가 불가.");
			return;
		}
		queue[queue_index++] = new GongCha("UrongMilkTea", 0, 50);
	}

	void orderUrongTea() {
		if(checkMaxQueue()) {
			System.out.println("주문 대기열 가득참. 우롱티 추가 불가.");
			return;
		}
		queue[queue_index++] = new GongCha("UrongTea", 50, 50);
	}
	
	void orderBlackMilkTea() {
		if(checkMaxQueue()) {
			System.out.println("주문 대기열 가득참. 블랙밀크티 추가 불가.");
			return;
		}
		queue[queue_index++] = new GongCha("BlackMilkTea");
	}
}
