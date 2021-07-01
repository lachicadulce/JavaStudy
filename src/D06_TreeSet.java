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
	 	
	 	 - 순서가 있는 Set (순서가 없는 것은 Hash의 특징)
	 	 - 중복은 허용하지 않는다 (Set의 특징)
	 	 - 데이터를 추가할 때 값을 정렬해서 넣기 때문에 HashSet에 비해 저장 속도가 느리다
	 	 - 미리 정렬이 되어 있기 때문에 정렬된 순서로 값을 꺼내기 편리한 Set이다
	 	 - 해당 TreeSet 인스턴스에서 사용할 Comparator를 지정할 수 있다
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
				// 자리를 바꾸고 싶다면 양수 리턴
				// 자리를 바꾸기 싫으면 음수 리턴
				// 두 값이 같은 값이면 0 리턴
				return o2 - o1;
			}
		});
		
		numbers2.addAll(numbers);
		
		System.out.println(numbers2);
		
		// * TreeSet은 Set의 일부분을 리턴하는데에 특화된 기능이 많다
		SortedSet<Integer> head = numbers.headSet(44);
		System.out.println(head);
		
		SortedSet<Integer> tail = numbers.tailSet(44);
		System.out.println(tail);
		
		// 미리 정렬해놓은 방향과 반대 방향인 Set 인스턴스를 반환한다
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
		
		
		// 아래의 코드가 true가 나오도록 null을 다른 것으로 바꿔보세요
		System.out.println(list.containsAll(numbers));
		System.out.println(list.containsAll(list));
		System.out.println(list.containsAll(numbers3));
		
		// 학생 인스턴스를 100개 만들고, 트리셋에 평균 점수 순으로 저장한 후
		// 평균 점수가 50점에서 70점 사이인 학생이 모두 몇명인지 세어보세요
		TreeSet<StudentInfo> students = new TreeSet<>();
		
		for (int i = 0; i < 100; i++) {
			students.add(new StudentInfo(i + 1));
		}
		System.out.println(students);
		System.out.println("전체 학생 수: " + students.size());
		System.out.println("평균점수가 50점 이상 70점 미만인 학생 수: " + (students.subSet(new StudentInfo(0, 50, 50), new StudentInfo(0, 70, 70)).size()));
		
		TreeSet<ColorInfo> colors = new TreeSet<>();

		for (int i = 1; i <= 100; i++) {
			colors.add(new ColorInfo(i, "#" + Integer.toString((int)(Math.random() * 16777216), 16)));
		}
		System.out.println(colors);

		ColorInfo c1 = new ColorInfo();
		ColorInfo c2 = new ColorInfo();
		c1.rgb = "#777777";
		c2.rgb = "#ffffff";
		System.out.println("#000000 ~ #777777 수: " + colors.subSet(c1, c2).size());
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
		return String.format("번호: %d / 평균: %.2f", num, average);
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
		return String.format("%d의 rgb는 %s입니다.\n", num, rgb);
	}
}