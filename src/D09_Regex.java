import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D09_Regex {
	/*
	 	# ����ǥ���� (Regular Expression)
	 	
	 	 - ���ڿ��� ������ ǥ���� �� �ִ� ǥ����
	 	 - Ư�� ���α׷��� �� ���ӵ��� �ʴ� ������ ��Ģ�̴�
	 	 - ������ ���ڿ� ���ϰ� ��ġ�ϴ� ���ڿ��� �ɷ��� �� �ִ�
	 	 
	 	# Java���� ����ǥ������ �ٷ� �� ����ϴ� Ŭ����
	 	
	 	 - Pattern
	 	 - Matcher
	 	 
	 */
	
	public static void main(String[] args) {
		
		// Pattern.matches(regex, input) : input�� regex�� ��ġ�ϴ��� ���θ� �˻�
		System.out.println(Pattern.matches("sleep", "sleep"));
		
		// [] : �ش� ��ġ�� �� ���ڿ� � ���ڵ��� �� �� �ִ��� �����ϴ� ǥ����
		System.out.println(Pattern.matches("s[l@]eep", "sleep"));
		System.out.println(Pattern.matches("s[l@]eep", "sheep"));
		System.out.println(Pattern.matches("s[l@]eep", "s@eep"));
		System.out.println(Pattern.matches("s[l@]eep", "saeep"));
		System.out.println(Pattern.matches("s[l@]ee[abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ]", "sleek"));
		System.out.println(Pattern.matches("s[l@]ee[abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ]", "sleeK"));
		
		/*
		 	[abc] : �ش� �ڸ��� a �Ǵ� b �Ǵ� c�� ���
		 	[^abc] : �ش� �ڸ��� abc�� ������ ��� ���� ���
		 	[a-z] : a���� z���� ��� ���
		 	[A-Z] : A���� Z���� ��� ���
		 	[\\-] : ���ڷμ� -�� ��� (Escape)
		 	[a-e&&c-z] : a-e�� c-z�� ��� ������Ű�� ���ڸ� ���(������)
		 */
		System.out.println(Pattern.matches("s[A-Z]eep", "s-eep"));
		System.out.println(Pattern.matches("s[A\\-Z]eep", "s-eep"));
		System.out.println(Pattern.matches("s[123]eep", "s2eep"));
		
		/*
		 	# �ϳ��� ���� ���ڸ� ��Ÿ���� �͵�
		 	
		 	 . : ��� ����
		 	 \d : ��� ����
		 	 \D : ���ڸ� ������ ��� ��
		 	 \s : ��� ���� (\t, \n, \r, ' ')
		 	 \S : ������ ������ ��� ��
		 	 \w : �Ϲ����� ���ڵ��� ��� [a-zA-Z0-9_]
		 	 \W : \w�� ������ ��� ��
		 */
		System.out.println(Pattern.matches("s\\seep", "s eep"));
		
		/*
		 	# �ش� ������ ����� ������ ������ �����ϴ� ���
		 	
		 	 [.]{n} : {}���� ������ n�� ��ġ�ؾ� �Ѵ�
		 	 [.]{n,m} : {}���� ������ �ּ� n�� �ִ� m�� ��ġ�ؾ� �Ѵ�
		 	 [.]{n,} : {}���� ������ �ּ� n�� �̻� ��ġ�ؾ� �Ѵ�
		 	 [.]? : ? ���� ������ 0�� �Ǵ� �ѹ� ���;� �Ѵ�
		 	 [.]+ : + ���� ������ �ּ� �ѹ� �̻� ���;� �Ѵ�
		 	 [.]* : * ���� ������ 0�� �̻� ���;� �Ѵ�
		 	 
		 */
		System.out.println(Pattern.matches("[.]{5}", "....."));
		System.out.println(Pattern.matches("[.a-zA-Z]{5}", "abs.."));
		System.out.println(Pattern.matches("[.]{2,5}", "."));
		System.out.println(Pattern.matches("[.]{2,5}", ".."));
		System.out.println(Pattern.matches("[.]{2,5}", "..."));
		System.out.println(Pattern.matches("[.]{2,5}", "...."));
		System.out.println(Pattern.matches("[.]{2,5}", "....."));
		
		// ��������: �ش� ���ڿ��� �ڵ��� ��ȣ���� �˻��� �� �ִ� ����ǥ������ ��������
		String phone = "010-3857-0480";
		String num = "940520-2000000";
		System.out.println("[��ȭ��ȣ �˻��ϱ�] " + phone);
		System.out.println(Pattern.matches("010-?[2-9]\\d{3}-?\\d{4}", phone));
		// ��������: �ش� ���ڿ��� �ֹε�Ϲ�ȣ���� �˻��� �� �ִ� ����ǥ������ ��������
		System.out.println("[�ֹι�ȣ �˻��ϱ�] " + num);
		System.out.println(Pattern.matches("\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])-?[1-4]\\d{6}", num));
		
		// ��������: �ش� ���ڿ��� �̸������� �˻��� �� �ִ� ����ǥ������ ��������
		// 5~20���� ���� �ҹ���, ���ڿ� Ư����ȣ(_),(-)�� ��� �����մϴ�.
		// @naver.com @daum.net @seoul.co.kr
		
		String email = "abc123@naver......com";
		System.out.println("[�̸��� �˻��ϱ�] " + email);
		System.out.println(Pattern.matches("[\\d-_a-z]{5,20}@([a-z]+[.])+[a-z]+", email));
		System.out.println(Pattern.matches("[\\d-_a-z]{5,20}@([a-z]+[.])+[a-z]+", email));
		
		// # Matcher ����ؼ� �� ���ڿ� �˻��ϱ�
		String fruit = "apple/banana/orange/pineapple/greenapple/redapple/mango";
		
		Pattern pattern1 = Pattern.compile("na");
		
		// pattern1�� fruit�� �˻��� ����� ��ȯ�Ѵ�
		Matcher matcher = pattern1.matcher(fruit);
		
		// matcher.find() : ã�� �͵� �߿� ���� ���� �����ϸ� true
		while(matcher.find()) {
			System.out.println("ã�� ��: " + matcher.group());
			System.out.println("��ġ: " + matcher.start() + "���� " + matcher.end());
			System.out.println(fruit.substring(matcher.start(), matcher.end()));
		}
		
		// http://nowand.com/common/board/content.asp?board_id=data_intermark_speech&ref=17
		
		
		
		
		
		
		
		
		
	}
}
