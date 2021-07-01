import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;

public class D08_String {

	/*
	 	
	 */
	public static void main(String[] args) {
		
		String fruits = "apple/banana/orange/pineapple";
		
		// split(delimiter) : ���ڿ��� ���ϴ� �������� �ڸ� ���ڿ� �迭�� ��ȯ�Ѵ�.
		String[] splitted = fruits.split("/");
		
		for (int i = 0; i < splitted.length; ++i) {
			System.out.println(i + ": " + splitted[i]);
		}
		
		// String.join(delimiter, �̾���̰� ������...)
		String after = String.join(", ", splitted);
		System.out.println(after);
		System.out.println(String.join("-", "����", "���", "����", "�췰", "����"));

		printRabbitWithMessage("coffee", "milk", "juice", "carrot", "paprica");
		printRabbitWithMessage("potato", "sweet potato");
		
		// substring(start) : ���ڿ��� ��ŸƮ���� ���������� �ڸ� �ν��Ͻ��� ��ȯ
		// substring(start, end) : ���ڿ��� start���� end�̸����� �ڸ� �ν��Ͻ��� ��ȯ
		
		// contains(seq) : ���ڿ��� �ش� ���ڿ��� ���ԵǾ� �ִ��� �˻��Ѵ�
		String ph = "010-1234-1234";
		System.out.println("ph�� 1234�� ���ԵǾ� �ֳ���? " + ph.contains("1234"));
		
		// startsWith(seq) : ���ڿ��� �ش� ���ڿ��� �����ϴ��� �˻��Ѵ�
		System.out.println("ph�� 010���� �����ϳ���? " + ph.startsWith("010"));
		
		// endsWith(seq) : ���ڿ��� �ش� ���ڿ��� �������� �˻��Ѵ�
		System.out.println("ph�� 4�� ��������? " + ph.endsWith("4"));
		
		// replace(old, new) : ���ڿ��� �ٸ� ���ڿ��� ��ü�� �ν��Ͻ��� ��ȯ�Ѵ�
		String result = ph.replace("1234", "abcd");
		System.out.println("���� : " + ph + ", ��� : " + result);
		
		// getBytes() : ���ڿ��� byte[]�� ��ȯ�Ѵ�
		System.out.println(Arrays.toString("Hello".getBytes()));
		System.out.println(Arrays.toString("�ȳ��ϼ��� �ݰ����ϴ�".getBytes()));
		
		// � ��Ģ�� ����� byte[]�� ��ȯ���� ������ �� �ִ�
		try {
			System.out.println(Arrays.toString("�ȳ��ϼ���".getBytes("UTF-8")));
//			System.out.println(Arrays.toString("�ȳ��ϼ���".getBytes("UTF-16")));
//			System.out.println(Arrays.toString("�ȳ��ϼ���".getBytes("UCK-KR")));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		// byte[]�� �������� �����͵��� �ٽ� ���ڿ��� ��ĥ �� �ֵ�
		byte[] message = "�ȳ��ϼ��� �ݰ����ϴ�.".getBytes();
		System.out.println(new String(message));
		
		// trim() : ���ڿ� �ٱ����� ������ �������ش�
		String user_input = "  java  \n";
		String answer = "java";
		
		System.out.println(user_input.trim().equals(answer));
		
		// toUpperCase() : ���ڿ��� �빮�ڷ� ��ȯ�� �ν��Ͻ��� ��ȯ�Ѵ�
		// toLowerCase() : ���ڿ��� �ҹ��ڷ� ��ȯ�� �ν��Ͻ��� ��ȯ�Ѵ�
		String text = "hello, java!!";
		System.out.println(text.toUpperCase());
		System.out.println(text.toUpperCase().toLowerCase());

		// indexOf(seq) : ���ϴ� ���ڿ��� �ε����� ��ȯ�Ѵ�
		// indexOf(seq, start) : ���� ��ġ���� ���ϴ� ���ڿ��� �ε����� ��ȯ�Ѵ�
		String languages = "Java, Python, C, C++, C#, Kotlin, Javascript";
		languages += languages;
		languages += languages;
		languages += languages;
		
		System.out.println(languages.indexOf("Java"));
		System.out.println(languages.indexOf("Java", 1));
		
		// ����: languages���� "Java"��� ���ڿ��� ��� �ε����� ã�� �� ������ �÷��ǿ� �����Ͽ� ����غ�����
		System.out.println(languages);
		ArrayList<Integer> index = new ArrayList<>();
		int i = -1;
		while((i = languages.indexOf("Java", ++i)) != -1) {
			index.add(i);
		}
		System.out.println(index);
	}
	
	// Type... : ��������, �������� ���� ������ ���ڸ� �ش� Ÿ�� �迭�� �Ѱܹ��� �� �ִ�
	// �� �������ڴ� �׻� �޼����� �������� �����ؾ� �Ѵ�
	static void printRabbitWithMessage(String... msgs) {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		System.out.println("(  >��");
		System.out.println(Arrays.toString(msgs));
	}
}
