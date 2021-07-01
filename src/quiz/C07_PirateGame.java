package quiz;

import java.util.Scanner;

public class C07_PirateGame {

	/*
		1. 플레이어는 원하는 곳에 돌아가면서 칼을 찌른다
		
		2. 해적 아저씨가 날아가는 구멍이 랜덤으로 설정된다
		
		3. 플레이어는 여러명이 될 수 있다 (최소 2인, 최대는 구멍 숫자만큼)
		
		4. 새 게임 생성시 구멍 개수를 설정할 수 있다
		
		5. 해적 아저씨를 날린 플레이어가 패배한다
	 */
	
	int people; // 플레이어 수
	int holes; // 구멍 수
	int[] mrNum; // 함정 번호들이 담긴 배열
	int pickNum; // 플레이어가 선택한 수
	int[] hole; // 구멍의 크기만큼의 구멍 배열 (0이면 칼이 안꼽힌곳, 1이면 꼽힌곳)
	
	C07_PirateGame(int people, int holes){
		this.people = people;
		this.holes = holes;
		hole = new int[holes];
		// 함정 구멍은 1개 ~ 전체 구멍의수 / 3개로 세팅
		mrNum = new int[(int)(Math.random() * (holes / 3 < 1 ? 1 : holes / 3) + 1)];
	}
	
	// 함정 구멍 랜덤으로 정하기
	void randomHoles() {
		int randomNum;
		int numLen = mrNum.length;
		boolean check = false;
		for(int i = 0; i < numLen; ) {
			randomNum = (int)(Math.random() * holes);
			check = false;
			
			// 함정 구멍이 겹치는지 확인
			for(int j = 0; j < numLen; j++) {
				if(mrNum[j] == randomNum) {
					check = true;
					break;
				}
			}
			if(!check) {
				mrNum[i] = randomNum;
				i++;
			}
			
		}
		
		// 단지 함정의 번호 확인용
//		for(int i = 0; i < numLen; i++) {
//			System.out.println(mrNum[i] + 1);
//		}
	}
	
	// 0은 □로 1은 ■로 hole 배열 출력
	void printHoles() {
		for (int i = 0; i < holes; i++) {
			System.out.printf("%d번째: %s ", i+1, (hole[i] == 0) ? "□" : "■");
		}
		System.out.println();
	}
	
	// 이미 칼이 꼽힌 위치인지 확인
	boolean checkEmptyHoles() {
		return hole[pickNum-1] == 1;
	}
	
	// 함정번호와 같은지 확인
	boolean checkHoles() {
		for (int i =0; i < mrNum.length; i++) {
			if (pickNum-1 == mrNum[i]) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int people = 0;
		int holes = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(people < 2) {
			System.out.print("플레이어 수 (2인 이상): ");
			people = sc.nextInt();
		}
		
		// 사람수 이상의 구멍을 입력
		while(holes < people) {
			System.out.printf("구멍 수 (%d개 이상): ", people);
			holes = sc.nextInt();
		}
		
		C07_PirateGame pg = new C07_PirateGame(people, holes);
		pg.randomHoles();
		int i = 0;
		
		// 구멍만큼의 반복 (함정을 마주하면 break;)
		while(i <= holes) {
			System.out.printf("플레이어%d님 어느 구멍에 칼을 찌를거에용? (1 ~ %d): ",i % people + 1, holes);
			pg.pickNum = sc.nextInt();
			
			// 올바른 구멍 번호 확인
			if (pg.pickNum <= 0 || pg.pickNum > holes) {
				continue;
			}
			
			// 구멍이 칼을 꼽아도 되는 구멍인지 맞다면 함정은 아닌지 확인
			if(!pg.checkEmptyHoles()) {
				if (!pg.checkHoles()) {
					pg.hole[pg.pickNum - 1] = 1;
					pg.printHoles();
					i++;
					System.out.println();
				} else {
					System.out.println("해적 아저씨가 나타났다!!!!!");
					System.out.printf("플레이어%d님이 졌어요.", i % people + 1);
					break;
				}
				
			} else {
				System.out.println("그 구멍은 이미 칼이 꼽혀있어요!");
				continue;
			}
		}
	}
	
	
}

