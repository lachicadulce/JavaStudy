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
			System.out.println("�ֹ� ��⿭ ������. ��չ�ũƼ �߰� �Ұ�.");
			return;
		}
		queue[queue_index++] = new GongCha("UrongMilkTea", 0, 50);
	}

	void orderUrongTea() {
		if(checkMaxQueue()) {
			System.out.println("�ֹ� ��⿭ ������. ���Ƽ �߰� �Ұ�.");
			return;
		}
		queue[queue_index++] = new GongCha("UrongTea", 50, 50);
	}
	
	void orderBlackMilkTea() {
		if(checkMaxQueue()) {
			System.out.println("�ֹ� ��⿭ ������. ����ũƼ �߰� �Ұ�.");
			return;
		}
		queue[queue_index++] = new GongCha("BlackMilkTea");
	}
}
