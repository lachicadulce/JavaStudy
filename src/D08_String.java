import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;

public class D08_String {

	/*
	 	
	 */
	public static void main(String[] args) {
		
		String fruits = "apple/banana/orange/pineapple";
		
		// split(delimiter) : 문자열을 원하는 기준으로 자른 문자열 배열을 반환한다.
		String[] splitted = fruits.split("/");
		
		for (int i = 0; i < splitted.length; ++i) {
			System.out.println(i + ": " + splitted[i]);
		}
		
		// String.join(delimiter, 이어붙이고 싶은것...)
		String after = String.join(", ", splitted);
		System.out.println(after);
		System.out.println(String.join("-", "연어", "장어", "광어", "우럭", "도미"));

		printRabbitWithMessage("coffee", "milk", "juice", "carrot", "paprica");
		printRabbitWithMessage("potato", "sweet potato");
		
		// substring(start) : 문자열을 스타트부터 마지막까지 자른 인스턴스를 반환
		// substring(start, end) : 문자열을 start부터 end미만까지 자른 인스턴스를 반환
		
		// contains(seq) : 문자열에 해당 문자열이 포함되어 있는지 검사한다
		String ph = "010-1234-1234";
		System.out.println("ph에 1234가 포함되어 있나요? " + ph.contains("1234"));
		
		// startsWith(seq) : 문자열이 해당 문자열로 시작하는지 검사한다
		System.out.println("ph가 010으로 시작하나요? " + ph.startsWith("010"));
		
		// endsWith(seq) : 문자열이 해당 문자열로 끝나는지 검사한다
		System.out.println("ph가 4로 끝나나요? " + ph.endsWith("4"));
		
		// replace(old, new) : 문자열을 다른 문자열로 교체한 인스턴스를 반환한다
		String result = ph.replace("1234", "abcd");
		System.out.println("원본 : " + ph + ", 결과 : " + result);
		
		// getBytes() : 문자열을 byte[]로 변환한다
		System.out.println(Arrays.toString("Hello".getBytes()));
		System.out.println(Arrays.toString("안녕하세요 반갑습니다".getBytes()));
		
		// 어떤 규칙을 사용해 byte[]로 변환할지 결정할 수 있다
		try {
			System.out.println(Arrays.toString("안녕하세요".getBytes("UTF-8")));
//			System.out.println(Arrays.toString("안녕하세요".getBytes("UTF-16")));
//			System.out.println(Arrays.toString("안녕하세요".getBytes("UCK-KR")));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		// byte[]로 나눠졌던 데이터들을 다시 문자열로 합칠 수 있따
		byte[] message = "안녕하세요 반갑습니다.".getBytes();
		System.out.println(new String(message));
		
		// trim() : 문자열 바깥쪽의 공백을 제거해준다
		String user_input = "  java  \n";
		String answer = "java";
		
		System.out.println(user_input.trim().equals(answer));
		
		// toUpperCase() : 문자열을 대문자로 변환한 인스턴스를 반환한다
		// toLowerCase() : 문자열을 소문자로 변환한 인스턴스를 반환한다
		String text = "hello, java!!";
		System.out.println(text.toUpperCase());
		System.out.println(text.toUpperCase().toLowerCase());

		// indexOf(seq) : 원하는 문자열의 인덱스를 반환한다
		// indexOf(seq, start) : 시작 위치부터 원하는 문자열의 인덱스를 반환한다
		String languages = "Java, Python, C, C++, C#, Kotlin, Javascript";
		languages += languages;
		languages += languages;
		languages += languages;
		
		System.out.println(languages.indexOf("Java"));
		System.out.println(languages.indexOf("Java", 1));
		
		// 연습: languages에서 "Java"라는 문자열의 모든 인덱스를 찾은 뒤 적절한 컬렉션에 저장하여 출력해보세요
		System.out.println(languages);
		ArrayList<Integer> index = new ArrayList<>();
		int i = -1;
		while((i = languages.indexOf("Java", ++i)) != -1) {
			index.add(i);
		}
		System.out.println(index);
	}
	
	// Type... : 가변인자, 정해지지 않은 개수의 인자를 해당 타입 배열로 넘겨받을 수 있다
	// ※ 가변인자는 항상 메서드의 마지막에 정의해야 한다
	static void printRabbitWithMessage(String... msgs) {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		System.out.println("(  >♡");
		System.out.println(Arrays.toString(msgs));
	}
}
