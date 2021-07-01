package quiz;

import java.util.Scanner;

import myobj.password.CheckRules;

public class C17_InputRightPassword {

	/*
	 	# �ùٸ� �н����带 ����� ���� ��Ģ
	 	
	 	 1. ��� �����̸� �ȵ�
	 	 
	 	 2. �빮�ڿ� �ҹ��� ���� Ư�����ڰ� �����־�� ��
	 	 
	 	 3. Ư�� ���ڴ� !, @, #, $, %, ^, &, *�� ��� �����մϴ�.
	 	 
	 	 4. ��й�ȣ�� ���̰� 8�ڸ� �̻� 24�ڸ� ���Ͽ��� ��
	 	 
	 	 ���� ��Ģ�� ��� ��� ���ܸ� �߻����Ѽ� �˸��� �ȳ� ������ ����غ�����
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pwd;
		System.out.print("Input password: ");
		pwd = sc.next();
		try {
			check_pwd(pwd.toCharArray());
			System.out.println("��й�ȣ ���� �Ϸ�!");
		} catch (AllNumbers e){
			System.out.println("�ۼ��Ͻ� ��й�ȣ�� ��Ģ�� ���� �ʽ��ϴ�.");
		} catch (DoesntHaveAllKindsOfThings e){
			System.out.println("�ۼ��Ͻ� ��й�ȣ�� ��Ģ�� ���� �ʽ��ϴ�.");
		} catch (HasWrongScpecialCharacter e){
			System.out.println("�ۼ��Ͻ� ��й�ȣ�� ��Ģ�� ���� �ʽ��ϴ�.");
		} catch (WrongPasswordLength e){
			System.out.println("�ۼ��Ͻ� ��й�ȣ�� ��Ģ�� ���� �ʽ��ϴ�.");
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
		System.out.println("��� ���ڿ���...");
	}
}
class DoesntHaveAllKindsOfThings extends Exception {
	public DoesntHaveAllKindsOfThings() {
		System.out.println("�빮��, �ҹ���, ����, Ư�����ڷθ� �Ѱ� �̻� ����ؾ��ؿ�...");
	}
}
class HasWrongScpecialCharacter extends Exception {
	public HasWrongScpecialCharacter() {
		System.out.println("������ Ư�����ڰ� �ƴϿ���...");
	}
}
class WrongPasswordLength extends Exception {
	public WrongPasswordLength() {
		System.out.println("��й�ȣ�� ���̴� 8�� �̻� 24�� ���Ͽ����ؿ�...");
	}
}