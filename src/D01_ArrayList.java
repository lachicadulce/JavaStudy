import java.util.ArrayList;

public class D01_ArrayList {

	/*
	 	# Java Collections
	 	
	 		- �ڹٿ��� �⺻������ �����ϴ� �ڷᱸ�� �������̽�
	 		- Collection �������̽��� ������ Ŭ������ List, Set ���� �ִ�
	 		
	 	# java.util.ArrayList
	 	
	 		- �迭�� ���������� ũ�Ⱑ �ڵ����� �����Ǵ� �ڷᱸ�� Ŭ����
	 		- �迭ó�� �����͸� ���������� �����Ѵ�
	 		- ���������� ��� �����Ϳ� �����ؾ��� �� ���� �����ϴ�
	 		
	 */
	public static void main(String[] args) {
		/*
		 	# Ÿ���� �����ϸ� ArrayList �����ϱ�
		 		- Ÿ���� ������ �� ����ϴ� <>�� ���׸�(Generic)�̶�� �θ���
		 		- �ش� Ŭ���� ������ ���� �������� ���� Ÿ���� �����ϴ� �����̴�
		 		- ���׸����� �⺻�� Ÿ���� ����� �� ����
		 */
		ArrayList<String> fruits = new ArrayList<>();
		ArrayList<Integer> numbers = new ArrayList<>();
		ArrayList<Character> chars = new ArrayList<>();
		

		chars.add('a');
		chars.add('b');
		chars.add('a');
		chars.add('b');
		chars.add('a');
		chars.add('b');
		chars.add('a');
		chars.add('b');
		chars.add('a');
		chars.add('b');
		
//		add(item): ����Ʈ�� �� �ڿ� ���ϴ� �����͸� �߰��Ѵ�
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("banana");
		
		numbers.add(3);
		
//		add(index, item): ���ϴ� ��ġ�� ���ϴ� �����͸� �߰��Ѵ�
		numbers.add(0, 35);
		numbers.add(1, 5);
		
		
		System.out.println(fruits);
		System.out.println(numbers);
		
//		get(index): ����Ʈ���� �ش� �ε����� �����͸� �ϳ� ��ȯ�Ѵ�
		System.out.println(fruits.get(3));
		System.out.println(numbers.get(0));
		
//		size(): �ش� �÷����� ũ�⸦ ��ȯ�Ѵ�
		System.out.println("���� ����ִ� ���� ����: " + fruits.size());
		
//		remove(index): �ش� ��° �����͸� �����Ѵ�. ��� ���� �����͸� ��ȯ�Ѵ�.
		System.out.println(fruits.remove(0));

//		remove(item): �ش� ���� �����Ѵ�. ���� ���� ���θ� ��ȯ�Ѵ�.
		System.out.println(numbers.remove(new Integer(77)));
		System.out.println(chars.remove(2));
		System.out.println(chars.remove(new Character('a')));
		System.out.println(fruits.remove("kiwi"));
		System.out.println(fruits.remove("banana"));
	}
}
