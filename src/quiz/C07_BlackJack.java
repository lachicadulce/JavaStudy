package quiz;

import java.util.Scanner;

import myobj.blackjack.Cards;

public class C07_BlackJack {

	/*
		# ī��
			4������ ����: ��Ʈ, Ŭ�ι�, ���̾Ƹ��, �����̵�
			����: A 2 3 4 5 6 7 8 9 10 J Q K
			�� ���迡���� A�� 1�� �� ���� �ְ� 11�ε� �� �� ����
			   J, Q, K�� 10
			   
		# ������ ����� ������
		
		1. ��ǻ��(����)�� ���(�÷��̾�)�� ī�带 �̴´�
		
		2. ó������ �� ��� 2�徿 �޴´�. �� �� ������ ī��� ���� �������´�.
		
		3. �÷��̾�� ��Ȳ�� ���� �� ������(hit) ���⼭ ��������(stand) �����Ѵ�
		
		4. �÷��̾ ���߸� ������ ������ �ִ� ī�带 �����ϰ� ��Ģ�� ���� ī�带 �̴´�.
		   (������ �ݵ�� ī�� ���� 16�����϶� ������ �̰�, 17 �̻��̸� ������ ����� �Ѵ�)
		   
		5. �÷��̾��� ī�� ���ڵ��� ���� �������� ���ų� ��Ȯ�ϰ� 21�̶�� �¸��Ѵ�.
		   �÷��̾��� ī�� ���ڵ��� ���� 21���� ũ�� �й��Ѵ�. (A ~ K)
	 */
	
	public static void main(String[] args) {
		Cards blackjack = new Cards();
		Scanner sc = new Scanner(System.in);
		String input;
		while(!blackjack.finish) {
			System.out.print("hit/stand: ");
			input = sc.next();
			if (input.equals("hit")) {
				blackjack.hit();
			} else if (input.equals("stand")) {
				blackjack.stand();
			}
		}
	}
}