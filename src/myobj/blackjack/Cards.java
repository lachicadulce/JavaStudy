package myobj.blackjack;

public class Cards {

	String[] cards = {"��A", "��2", "��3", "��4", "��5", "��6", "��7", "��8", "��9", "��10", "��J", "��Q", "��K",
			"��A", "��2", "��3", "��4", "��5", "��6", "��7", "��8", "��9", "��10", "��J", "��Q", "��K",
			"��A", "��2", "��3", "��4", "��5", "��6", "��7", "��8", "��9", "��10", "��J", "��Q", "��K",
			"��A", "��2", "��3", "��4", "��5", "��6", "��7", "��8", "��9", "��10", "��J", "��Q", "��K"};
	boolean[] openCards = new boolean[52];

	public String[] myCards;
	String[] dealerCards;
	int index;
	public boolean finish;
	int mySum;
	int dealerSum;
	
	public Cards() {
		myCards = new String[10];
		dealerCards = new String[10];
		for (int i = 0; i < 2; i++) {
			myCards[i] = pickOneCard();
			dealerCards[i] = pickOneCard();
		}
		index = 2;
		System.out.print("����� ī��: ");
		printCards(myCards);
		System.out.print("������ ī��: ");
		System.out.println(dealerCards[0]);
		printSum();
	}
	
	public void printSum() {
		mySum = sum(myCards);
		dealerSum = Integer.parseInt(dealerCards[0].substring(1));
		System.out.println("����� ��: " + mySum + ", ������ ��: " + dealerSum);
	}
	
	public void printCards(String[] myCards) {
		for(int i = 0;;i++) {
			if (myCards[i] == null) {
				break;
			}
			System.out.print(myCards[i]);
		}
		System.out.println();
	}
	public void showCards() {
		System.out.print("����� ī��: ");
		printCards(myCards);
		System.out.print("������ ī��: ");
		System.out.println(dealerCards[0]);
	}
	
	// �ߺ����� �ʴ� ī�� ���� ������.
	public String pickOneCard() {
		
		while(true) {
			int pick = (int)(Math.random() * 52);
			if (openCards[pick]) {
				continue;
			} else {
				openCards[pick] = true;
				return cards[pick];
			}
		}
	}
	
	// ���� �հ�
	public int sum(String[] myCards) {
		int sum = 0;
		int aCheck = 0;
		
		for (String card : myCards) {
			if(card == null) {
				break;
			}
			String checkChar = card.substring(1);
//			System.out.println("���� ī�� ���� " + checkChar);
			if (checkChar.equals("A")) {
				sum += 11;
				aCheck ++;
			} else if (checkChar.equals("J") || checkChar.equals("Q") || checkChar.equals("K")) {
				sum += 10;
			} else {
				sum += (Integer.parseInt(checkChar));
			}
		}
		for(int i = 0; i < aCheck; i++) {
			if (sum > 21 && aCheck > 0) {
				sum -= 10;
			}
		}
//		System.out.println("��: " + sum);
		return sum;
	}
	
	// stand�ϰ� ������ ī�带 �̴´�.
	public void stand() {

		boolean result = false;
//		mySum = sum(myCards);
//		if (mySum == 21) {
//			System.out.println("����� �¸�!");
//			finish = true;
//			return;
//		} else if (mySum > 21) {
//			System.out.println("������ �¸�!");
//			finish = true;
//			return;
//		}

		dealerSum = sum(dealerCards);
		for (int i = 2;;i++) {
			if(dealerSum <= 16) {
				pickOneCard();
				dealerCards[i] = pickOneCard();
				System.out.print("���� ī��: ");
				printCards(dealerCards);
				dealerSum = sum(dealerCards);
			} else {
				break;
			}
		}
		mySum = sum(myCards);
		System.out.println("����� ��: " + mySum + ", ������ ��: " + dealerSum);
		if (mySum > dealerSum && mySum <= 21) {
			result = true;
		} else if (mySum == 21 && dealerSum == 21 || mySum > 21 && dealerSum > 21) {
			System.out.println("���º�!");
			finish = true;
			return;
		} else if (mySum <= 21 && dealerSum > 21) {
			result = true;
		}
		if (result) {
			System.out.println("����� �¸�!");
		} else {
			System.out.println("������ �¸�!");
		}
		finish = true;
	}
	
	// hit
	public void hit() {
		myCards[index++] = pickOneCard();
		if (sum(myCards) >= 21) {
			showCards();
			printSum();
			if(sum(myCards)==21) {
				finish = true;
				System.out.println("����� �¸�!");
				return;
			}
			stand();
		} else {				
			System.out.print("����� ī��: ");
			printCards(myCards);
			printSum();
			System.out.println();
		}
	}
}
