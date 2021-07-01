package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class D07_PhoneBook {

	public static class Info implements Comparable<Info>{
		// 내용은 양심껏
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
			return String.format("이름: %s, 주소: %s, 직장: %s, 나이: %d\n", name, address, office, age);
		}
	}
	
	HashMap<String, HashMap<String, Info>> phonebook;
	
	public D07_PhoneBook() {
		phonebook = new HashMap<>();
	}
	
	/*
	 	# HashMap을 이용해 전화번호부를 구현해보세요
	 	
	 	 1. phonebook에는 그룹/전화번호/정보를 저장할 수 있다
	 	 2. 그룹명을 키값으로 넣으면 해당 그룹에 해당하는 HashMap을 꺼낼 수 있다
	 	 3. 꺼낸 HashMap에 전화번호를 넣으면 이름을 꺼낼 수 있다
	 	 그룹이름/전화번호/이름 (친구/010-1234-5678/승민)
	 	 
	 	# 구현해야 할 메서드
	 	
	 	 1. 새로운 그룹을 추가하는 메서드
	 	 2. 그룹에 새로운 전화번호를 등록하는 메서드
	 	 3. 등록된 모든 번호를 선택한 항목(Info) 기준으로 오름/내림차순으로 보여주는 메서드
	 	 4. 이름의 일부를 입력하면 일치하는 모든 정보가 검색되는 메서드
	 	 5. 전화번호의 일부를 입력하면 일치하는 모든 정보가 출력되는 메서드
	 */
	
	// 1. 새로운 그룹을 추가하는 메서드
	void addGroup(String group) {
		if (!phonebook.containsKey(group)) {
			phonebook.put(group, new HashMap<>());
		}
	}
	
	// 2. 그룹에 새로운 전화번호를 등록하는 메서드
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
	
	// 3. 등록된 모든 번호를 선택한 항목(Info) 기준으로 오름/내림차순으로 보여주는 메서드
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
	
	// 4. 이름의 일부를 입력하면 일치하는 모든 정보가 검색되는 메서드
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
	
	// 5. 전화번호의 일부를 입력하면 일치하는 모든 정보가 출력되는 메서드
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
			System.out.println("원하는 항목을 골라주세요. (1. 그룹 등록 2. 번호 등록 3. 정보 검색 4. 번호 검색 5. 전체 출력 6. 나가기)");
			input = sc.nextInt();
			if (input == 1) {
				System.out.println("추가하시려는 그룹명을 입력하세요.");
				group = sc.next();
				if (pb.phonebook.containsKey(group)) {
					System.out.println("이미 존재하는 그룹이에요.");
				} else {
					pb.addGroup(group);
				}
				
			} else if (input == 2) {
				System.out.println("등록하시려는 그룹을 입력하세요.");
				group = sc.next();
				if (!pb.phonebook.containsKey(group)) {
					System.out.println("존재하지 않는 그룹이에요.");
				} else {
					System.out.println("등록하시려는 번호를 입력하세요.");
					phone = sc.next();
					System.out.println("이름을 입력하세요.");
					name = sc.next();
					System.out.println("주소를 입력하세요.");
					address = sc.next();
					System.out.println("직장주소를 입력하세요.");
					office = sc.next();
					System.out.println("나이를 입력하세요.");
					age = sc.nextInt();
					pb.addNumber(group, phone, name, address, office, age);
				}
			} else if (input == 3) {
				System.out.println("기준을 선택해주세요. (0. 이름/1. 주소/2. 직장)");
				input = sc.nextInt();
			
				name = "";
				address = "";
				office = "";
				System.out.println("검색어를 입력하세요.");
				if (input == 0) {
					name = sc.next();
				} else if (input == 1) {
					address = sc.next();
				} else if (input == 2) {
					office = sc.next();
				} else {
					System.out.println("잘못된 기준!");
					continue;
				}
				pb.searchByName(name, address, office);
			} else if (input == 4) {
				System.out.println("검색어를 입력하세요.");
				phone = sc.next();
				pb.searchByNum(phone);
			} else if (input == 5) {
				System.out.println("기준을 선택해주세요. (0. 이름/1. 주소/2. 직장/3. 나이)");
				input = sc.nextInt();
				pb.showAllNumber(input);
			} else if (input == 6) {
				System.out.println("이용해 주셔서 감사합니다.");
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
//pb.addGroup("가족");
//pb.addGroup("친구");
//pb.addNumber("가족", "010-3857-0480", "백소영", "경기도화성시동탄숲속로95", "백수라서주소없음", 27);
//pb.addNumber("가족", "010-6398-0480", "백한욱", "경상남도진주시진주혁신도시", "경상남도사천시", 33);
//pb.addNumber("가족", "010-3630-0480", "백낙규", "화성시동탄숲속로95", "아빠", 62);
//pb.addNumber("가족", "010-3768-0480", "남윤희", "동탄숲속로95", "엄마", 58);
//pb.addNumber("친구", "010-0000-0000", "장연하", "일산", "김포", 26);
//pb.addNumber("친구", "010-0000-0001", "문은정", "안산", "역삼", 27);
//pb.addNumber("친구", "010-0000-0002", "김소연", "용인", "수원", 25);
//pb.addNumber("친구", "010-0000-0003", "이영서", "오산", "군포", 25);