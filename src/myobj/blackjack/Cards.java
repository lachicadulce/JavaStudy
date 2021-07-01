package myobj.blackjack;

public class Cards {

	String[] cards = {"♥A", "♥2", "♥3", "♥4", "♥5", "♥6", "♥7", "♥8", "♥9", "♥10", "♥J", "♥Q", "♥K",
			"♣A", "♣2", "♣3", "♣4", "♣5", "♣6", "♣7", "♣8", "♣9", "♣10", "♣J", "♣Q", "♣K",
			"◆A", "◆2", "◆3", "◆4", "◆5", "◆6", "◆7", "◆8", "◆9", "◆10", "◆J", "◆Q", "◆K",
			"♠A", "♠2", "♠3", "♠4", "♠5", "♠6", "♠7", "♠8", "♠9", "♠10", "♠J", "♠Q", "♠K"};
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
		System.out.print("당신의 카드: ");
		printCards(myCards);
		System.out.print("딜러의 카드: ");
		System.out.println(dealerCards[0]);
		printSum();
	}
	
	public void printSum() {
		mySum = sum(myCards);
		dealerSum = Integer.parseInt(dealerCards[0].substring(1));
		System.out.println("당신의 합: " + mySum + ", 딜러의 합: " + dealerSum);
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
		System.out.print("당신의 카드: ");
		printCards(myCards);
		System.out.print("딜러의 카드: ");
		System.out.println(dealerCards[0]);
	}
	
	// 중복되지 않는 카드 한장 꺼내기.
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
	
	// 점수 합계
	public int sum(String[] myCards) {
		int sum = 0;
		int aCheck = 0;
		
		for (String card : myCards) {
			if(card == null) {
				break;
			}
			String checkChar = card.substring(1);
//			System.out.println("지금 카드 숫자 " + checkChar);
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
//		System.out.println("합: " + sum);
		return sum;
	}
	
	// stand하고 딜러가 카드를 뽑는다.
	public void stand() {

		boolean result = false;
//		mySum = sum(myCards);
//		if (mySum == 21) {
//			System.out.println("당신의 승리!");
//			finish = true;
//			return;
//		} else if (mySum > 21) {
//			System.out.println("딜러의 승리!");
//			finish = true;
//			return;
//		}

		dealerSum = sum(dealerCards);
		for (int i = 2;;i++) {
			if(dealerSum <= 16) {
				pickOneCard();
				dealerCards[i] = pickOneCard();
				System.out.print("딜러 카드: ");
				printCards(dealerCards);
				dealerSum = sum(dealerCards);
			} else {
				break;
			}
		}
		mySum = sum(myCards);
		System.out.println("당신의 합: " + mySum + ", 딜러의 합: " + dealerSum);
		if (mySum > dealerSum && mySum <= 21) {
			result = true;
		} else if (mySum == 21 && dealerSum == 21 || mySum > 21 && dealerSum > 21) {
			System.out.println("무승부!");
			finish = true;
			return;
		} else if (mySum <= 21 && dealerSum > 21) {
			result = true;
		}
		if (result) {
			System.out.println("당신의 승리!");
		} else {
			System.out.println("딜러의 승리!");
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
				System.out.println("당신의 승리!");
				return;
			}
			stand();
		} else {				
			System.out.print("당신의 카드: ");
			printCards(myCards);
			printSum();
			System.out.println();
		}
	}
}
