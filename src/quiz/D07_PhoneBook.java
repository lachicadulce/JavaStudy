package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class D07_PhoneBook {

	public static class Info implements Comparable<Info>{
		// ������ ��ɲ�
		String name;
		String address;
		String office;
		int age;
		int sortBy;
		
		@Override
		public int compareTo(Info o) {
			if(sortBy == 0) {
				return this.name.compareTo(o.name) != 0 ? this.name.compareTo(o.name) : this.address.compareTo(o.address);
			} else if(sortBy == 1){
				return this.address.compareTo(o.address) != 0 ? this.address.compareTo(o.address) : this.name.compareTo(o.name);
			} else if(sortBy == 2){
				return this.office.compareTo(o.office) != 0 ? this.office.compareTo(o.office) : this.name.compareTo(o.name);
			} else {
				return this.age - o.age != 0 ? this.age - o.age : this.name.compareTo(o.name);
			}
		}
		@Override
		public String toString() {
			return String.format("�̸�: %s, �ּ�: %s, ����: %s, ����: %d\n", name, address, office, age);
		}
	}
	
	HashMap<String, HashMap<String, Info>> phonebook;
	
	public D07_PhoneBook() {
		phonebook = new HashMap<>();
	}
	
	/*
	 	# HashMap�� �̿��� ��ȭ��ȣ�θ� �����غ�����
	 	
	 	 1. phonebook���� �׷�/��ȭ��ȣ/������ ������ �� �ִ�
	 	 2. �׷���� Ű������ ������ �ش� �׷쿡 �ش��ϴ� HashMap�� ���� �� �ִ�
	 	 3. ���� HashMap�� ��ȭ��ȣ�� ������ �̸��� ���� �� �ִ�
	 	 �׷��̸�/��ȭ��ȣ/�̸� (ģ��/010-1234-5678/�¹�)
	 	 
	 	# �����ؾ� �� �޼���
	 	
	 	 1. ���ο� �׷��� �߰��ϴ� �޼���
	 	 2. �׷쿡 ���ο� ��ȭ��ȣ�� ����ϴ� �޼���
	 	 3. ��ϵ� ��� ��ȣ�� ������ �׸�(Info) �������� ����/������������ �����ִ� �޼���
	 	 4. �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ �˻��Ǵ� �޼���
	 	 5. ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ ��µǴ� �޼���
	 */
	
	// 1. ���ο� �׷��� �߰��ϴ� �޼���
	void addGroup(String group) {
		if (!phonebook.containsKey(group)) {
			phonebook.put(group, new HashMap<>());
		}
	}
	
	// 2. �׷쿡 ���ο� ��ȭ��ȣ�� ����ϴ� �޼���
	void addNumber(String group, String phone, String name, String address, String office, int age) {
		Info info = new Info();
		info.address = address;
		info.name = name;
		info.office = office;
		info.age = age;
		
		HashMap<String, Info> infos = phonebook.get(group);
		infos.put(phone, info);
		phonebook.put(group, infos);
	}
	
	// 3. ��ϵ� ��� ��ȣ�� ������ �׸�(Info) �������� ����/������������ �����ִ� �޼���
	void showAllNumber(int sortBy) {
		ArrayList<Info> pbList = new ArrayList<>();
		for (String group : phonebook.keySet()) {
			HashMap<String, Info> infos = phonebook.get(group);
			System.out.println("[" + group + "]");
			pbList.clear();
			for (Info i : infos.values()) {
				i.sortBy = sortBy;
				pbList.add(i);
			}
			Collections.sort(pbList);
			System.out.println(pbList);
		}
	}
	
	// 4. �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ �˻��Ǵ� �޼���
	void searchByName(String name, String address, String office) {
		for (String group : phonebook.keySet()) {
			HashMap<String, Info> infos = phonebook.get(group);
			for (Info i : infos.values()) {
				if (i.name.contains(name) && i.address.contains(address) && i.office.contains(office)) {
					System.out.println(i);
				}
			}
		}
	}
	
	// 5. ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ ��µǴ� �޼���
	void searchByNum(String name) {
		for (String group : phonebook.keySet()) {
			HashMap<String, Info> infos = phonebook.get(group);
			for (String i : infos.keySet()) {
				if (i.contains(name)) {
					System.out.println(phonebook.get(group).get(i));
				}
			}
		}
	}
	
	public static void main(String[] args) {
		D07_PhoneBook pb = new D07_PhoneBook();
		String group;
		String name;
		String address;
		String phone;
		String office;
		int age;
		int input;
		
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("���ϴ� �׸��� ����ּ���. (1. �׷� ��� 2. ��ȣ ��� 3. ���� �˻� 4. ��ȣ �˻� 5. ��ü ��� 6. ������)");
			input = sc.nextInt();
			if (input == 1) {
				System.out.println("�߰��Ͻ÷��� �׷���� �Է��ϼ���.");
				group = sc.next();
				if (pb.phonebook.containsKey(group)) {
					System.out.println("�̹� �����ϴ� �׷��̿���.");
				} else {
					pb.addGroup(group);
				}
				
			} else if (input == 2) {
				System.out.println("����Ͻ÷��� �׷��� �Է��ϼ���.");
				group = sc.next();
				if (!pb.phonebook.containsKey(group)) {
					System.out.println("�������� �ʴ� �׷��̿���.");
				} else {
					System.out.println("����Ͻ÷��� ��ȣ�� �Է��ϼ���.");
					phone = sc.next();
					System.out.println("�̸��� �Է��ϼ���.");
					name = sc.next();
					System.out.println("�ּҸ� �Է��ϼ���.");
					address = sc.next();
					System.out.println("�����ּҸ� �Է��ϼ���.");
					office = sc.next();
					System.out.println("���̸� �Է��ϼ���.");
					age = sc.nextInt();
					pb.addNumber(group, phone, name, address, office, age);
				}
			} else if (input == 3) {
				System.out.println("������ �������ּ���. (0. �̸�/1. �ּ�/2. ����)");
				input = sc.nextInt();
			
				name = "";
				address = "";
				office = "";
				System.out.println("�˻�� �Է��ϼ���.");
				if (input == 0) {
					name = sc.next();
				} else if (input == 1) {
					address = sc.next();
				} else if (input == 2) {
					office = sc.next();
				} else {
					System.out.println("�߸��� ����!");
					continue;
				}
				pb.searchByName(name, address, office);
			} else if (input == 4) {
				System.out.println("�˻�� �Է��ϼ���.");
				phone = sc.next();
				pb.searchByNum(phone);
			} else if (input == 5) {
				System.out.println("������ �������ּ���. (0. �̸�/1. �ּ�/2. ����/3. ����)");
				input = sc.nextInt();
				pb.showAllNumber(input);
			} else if (input == 6) {
				System.out.println("�̿��� �ּż� �����մϴ�.");
				break;
			}
		}
	}
	
	class SortByAdd implements Comparator<Info>{
		@Override
		public int compare(Info o1, Info o2) {
			// TODO Auto-generated method stub
			return o1.address.compareTo(o2.address) != 0 ? o1.address.compareTo(o2.address) : o1.name.compareTo(o2.name);
		}
	}
	
}
//pb.addGroup("����");
//pb.addGroup("ģ��");
//pb.addNumber("����", "010-3857-0480", "��ҿ�", "��⵵ȭ���õ�ź���ӷ�95", "������ּҾ���", 27);
//pb.addNumber("����", "010-6398-0480", "���ѿ�", "��󳲵����ֽ��������ŵ���", "��󳲵���õ��", 33);
//pb.addNumber("����", "010-3630-0480", "�鳫��", "ȭ���õ�ź���ӷ�95", "�ƺ�", 62);
//pb.addNumber("����", "010-3768-0480", "������", "��ź���ӷ�95", "����", 58);
//pb.addNumber("ģ��", "010-0000-0000", "�忬��", "�ϻ�", "����", 26);
//pb.addNumber("ģ��", "010-0000-0001", "������", "�Ȼ�", "����", 27);
//pb.addNumber("ģ��", "010-0000-0002", "��ҿ�", "����", "����", 25);
//pb.addNumber("ģ��", "010-0000-0003", "�̿���", "����", "����", 25);