package quiz;

import java.util.Scanner;

import myobj.password.CheckRules;

public class C17_InputRightPassword {

	/*
	 	# 올바른 패스워드를 만들기 위한 규칙
	 	
	 	 1. 모두 숫자이면 안됨
	 	 
	 	 2. 대문자와 소문자 숫자 특수문자가 섞여있어야 함
	 	 
	 	 3. 특수 문자는 !, @, #, $, %, ^, &, *만 사용 가능합니다.
	 	 
	 	 4. 비밀번호의 길이가 8자리 이상 24자리 이하여야 함
	 	 
	 	 위의 규칙을 어긴 경우 예외를 발생시켜서 알맞은 안내 문구를 출력해보세요
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pwd;
		System.out.print("Input password: ");
		pwd = sc.next();
		try {
			check_pwd(pwd.toCharArray());
			System.out.println("비밀번호 생성 완료!");
		} catch (AllNumbers e){
			System.out.println("작성하신 비밀번호가 규칙에 맞지 않습니다.");
		} catch (DoesntHaveAllKindsOfThings e){
			System.out.println("작성하신 비밀번호가 규칙에 맞지 않습니다.");
		} catch (HasWrongScpecialCharacter e){
			System.out.println("작성하신 비밀번호가 규칙에 맞지 않습니다.");
		} catch (WrongPasswordLength e){
			System.out.println("작성하신 비밀번호가 규칙에 맞지 않습니다.");
		}
	}

	public static void check_pwd(char[] pwd) throws AllNumbers, DoesntHaveAllKindsOfThings, HasWrongScpecialCharacter, WrongPasswordLength {
		CheckRules cr = new CheckRules(pwd);

		if(cr.isAllNum()) {
			throw new AllNumbers();
		}
		
		if(cr.hasAllKinds()) {
			throw new DoesntHaveAllKindsOfThings();
		}
		
		if(cr.isDefinedSpecialChar()) {
			throw new HasWrongScpecialCharacter();
		}
		
		if(cr.lengthCheck()) {
			throw new WrongPasswordLength();
		}
	}
}
class AllNumbers extends Exception {
	public AllNumbers() {
		System.out.println("모두 숫자에요...");
	}
}
class DoesntHaveAllKindsOfThings extends Exception {
	public DoesntHaveAllKindsOfThings() {
		System.out.println("대문자, 소문자, 숫자, 특수문자로만 한개 이상 사용해야해요...");
	}
}
class HasWrongScpecialCharacter extends Exception {
	public HasWrongScpecialCharacter() {
		System.out.println("정해진 특수문자가 아니에요...");
	}
}
class WrongPasswordLength extends Exception {
	public WrongPasswordLength() {
		System.out.println("비밀번호의 길이는 8자 이상 24자 이하여야해요...");
	}
}