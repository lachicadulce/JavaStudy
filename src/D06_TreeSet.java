import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class D06_TreeSet {

	/*
	 	# TreeSet
	 	
	 	 - ������ �ִ� Set (������ ���� ���� Hash�� Ư¡)
	 	 - �ߺ��� ������� �ʴ´� (Set�� Ư¡)
	 	 - �����͸� �߰��� �� ���� �����ؼ� �ֱ� ������ HashSet�� ���� ���� �ӵ��� ������
	 	 - �̸� ������ �Ǿ� �ֱ� ������ ���ĵ� ������ ���� ������ ���� Set�̴�
	 	 - �ش� TreeSet �ν��Ͻ����� ����� Comparator�� ������ �� �ִ�
	 */
	
	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();
		
		numbers.add(10);
		numbers.add(99);
		numbers.add(86);
		numbers.add(41);
		numbers.add(50);
		numbers.add(13);
		
		System.out.println(numbers);
		
		TreeSet<Integer> numbers2 = new TreeSet<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// �ڸ��� �ٲٰ� �ʹٸ� ��� ����
				// �ڸ��� �ٲٱ� ������ ���� ����
				// �� ���� ���� ���̸� 0 ����
				return o2 - o1;
			}
		});
		
		numbers2.addAll(numbers);
		
		System.out.println(numbers2);
		
		// * TreeSet�� Set�� �Ϻκ��� �����ϴµ��� Ưȭ�� ����� ����
		SortedSet<Integer> head = numbers.headSet(44);
		System.out.println(head);
		
		SortedSet<Integer> tail = numbers.tailSet(44);
		System.out.println(tail);
		
		// �̸� �����س��� ����� �ݴ� ������ Set �ν��Ͻ��� ��ȯ�Ѵ�
		NavigableSet<Integer> desc = numbers.descendingSet();
		System.out.println(desc);

		System.out.println("first? " + numbers.first());
		System.out.println("last? " + numbers.last());
		System.out.println("pollFirst? " + numbers.pollFirst());
		System.out.println(numbers);
		System.out.println("pollLast? " + numbers.pollLast());
		System.out.println(numbers);
		
		System.out.println(numbers.subSet(2, 50));
		
		System.out.println(numbers2.comparator());
		
		TreeSet<Integer> numbers3 = new TreeSet<>(numbers2.comparator());
		
		List<Integer> list = new ArrayList<>(numbers);
		Collections.sort(list, numbers2.comparator());
		
		System.out.println("list? " + list);
		System.out.println("contains 41? " + numbers.contains(41));
		System.out.println("contains 42? " + list.contains(42));
		
		
		// �Ʒ��� �ڵ尡 true�� �������� null�� �ٸ� ������ �ٲ㺸����
		System.out.println(list.containsAll(numbers));
		System.out.println(list.containsAll(list));
		System.out.println(list.containsAll(numbers3));
		
		// �л� �ν��Ͻ��� 100�� �����, Ʈ���¿� ��� ���� ������ ������ ��
		// ��� ������ 50������ 70�� ������ �л��� ��� ������� �������
		TreeSet<StudentInfo> students = new TreeSet<>();
		
		for (int i = 0; i < 100; i++) {
			students.add(new StudentInfo(i + 1));
		}
		System.out.println(students);
		System.out.println("��ü �л� ��: " + students.size());
		System.out.println("��������� 50�� �̻� 70�� �̸��� �л� ��: " + (students.subSet(new StudentInfo(0, 50, 50), new StudentInfo(0, 70, 70)).size()));
		
		TreeSet<ColorInfo> colors = new TreeSet<>();

		for (int i = 1; i <= 100; i++) {
			colors.add(new ColorInfo(i, "#" + Integer.toString((int)(Math.random() * 16777216), 16)));
		}
		System.out.println(colors);

		ColorInfo c1 = new ColorInfo();
		ColorInfo c2 = new ColorInfo();
		c1.rgb = "#777777";
		c2.rgb = "#ffffff";
		System.out.println("#000000 ~ #777777 ��: " + colors.subSet(c1, c2).size());
	}
}

class StudentInfo implements Comparable<StudentInfo>{
	int num;
	int math;
	int science;
	double average;
	public StudentInfo(int num) {
		this.num = num;
		math = (int)(Math.random() * 101);
		science = (int)(Math.random() * 101);
		average = (math + science) / 2.0;
	}
	public StudentInfo(int num, int math, int science) {
		this.num = num;
		this.math = math;
		this.science = science;
		average = (math + science) / 2.0;
	}
	@Override
	public String toString() {
		return String.format("��ȣ: %d / ���: %.2f", num, average);
	}
	@Override
	public int compareTo(StudentInfo o) {
		return Double.compare(this.average, o.average) != 0 ? Double.compare(this.average, o.average) : Integer.compare(this.num, num);
	}
}

class ColorInfo implements Comparable<ColorInfo>{
//	static String[] names = {"RED"};
//	static String[] codes = {"#FF0000"};
	
	int num;
	String rgb;
	
	public ColorInfo() {
		
	}
	public ColorInfo(int num, String rgb) {
		this.num = num;
		this.rgb = rgb;
	}
	@Override
	public int compareTo(ColorInfo o) {
		return this.rgb.compareTo(o.rgb) != 0 ? this.rgb.compareTo(o.rgb) : Integer.compare(this.num, num);
	}
	@Override
	public String toString() {
		return String.format("%d�� rgb�� %s�Դϴ�.\n", num, rgb);
	}
}