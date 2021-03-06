package myobj.FiveDice;

import java.util.Arrays;
import java.util.Random;

public class Dice {

	final static int MAX_DICES = 5;
	final static int MAX_DICE_NUM = 6;
	int[] dices;
	int[] counts;
	
	Random ran;
	
	public Dice() {
		ran = new Random();
		dices = new int[MAX_DICES];
		counts = new int[MAX_DICE_NUM];
	}
	
	public void roll() {
		for (int i = 0; i < MAX_DICES; i++) {
//			dices[i] = (int)(Math.random() * MAX_DICE_NUM + 1);
			dices[i] = ran.nextInt(MAX_DICE_NUM) + 1;
		}
	}
	
	public void rollOne(int index) {
		dices[index - 1] = (int)(Math.random() * MAX_DICE_NUM + 1);
	}
	
	public void countDices() {
		// 배열 초기화
		Arrays.fill(counts, 0);
		
		for (int i = 0; i < MAX_DICES; i++) {
			counts[dices[i] - 1]++;
		}
	}
	
	public void checkAll() {
		System.out.println("Your dices: " + Arrays.toString(dices));
		if (checkNo5()) {
			System.out.println("5 다이스!!");
		} else if (checkNo4()) {
			System.out.println("4 다이스!!");
		} else if (checkNo3()) {
			System.out.println("라지 스트레이트!!");
		} else if (checkNo2()) {
			System.out.println("스몰 스트레이트!!");
		} else if (checkNo1()) {
			System.out.println("풀하우스!!");
		} else {
			System.out.println("아쉽지만..아무것도 아니에요..");
		}
	}
	
	// 풀하우스 확인하기.
	boolean checkNo1() {
		boolean check2 = false;
		boolean check3 = false;
		
		for (int count : counts) {
			if (count == 2) {
				check2 = true;
			} else if (count == 3) {
				check3 = true;
			}
		}
		return check2 && check3;
	}
	
	// 스몰 스트레이트 확인하기.
	boolean checkNo2() {
		boolean check = false;
		
		if (counts[2] >= 1 && counts[3] >= 1) {
			if (counts[0] >= 1 && counts[1] >= 1 || counts[1] >= 1 && counts[4] >= 1 || counts[4] >= 1 && counts[5] >= 1) {
				check = true;
			}
		}
		return check;
	}
	
	// 라지 스트레이트 확인하기.
	boolean checkNo3() {
		boolean check = false;
		
		if (counts[1] >= 1 && counts[2] >= 1 && counts[3] >= 1 && counts[4] >= 1) {
			if (counts[0] >= 1 || counts[5] >= 1) {
				check = true;
			}
		}
		return check;
	}
	
	// 4 다이스 확인하기.
	boolean checkNo4() {
		boolean check = false;
		for (int count : counts) {
			if (count >= 4) {
				check = true;
			}
		}
		return check;
	}
	
	// 5 다이스 확인하기.
	boolean checkNo5() {
		boolean check = false;
		for (int count : counts) {
			if (count == 5) {
				check = true;
			}
		}
		return check;
	}
}


// 강사님코드
//package myobj.yacht;
//
//import java.util.Arrays;
//import java.util.Random;
//
//public class YachtDice {
//
//        final static int MAX_DICE_NUM = 6;
//        final static int DICE_SIZE = 5;
//        
//        int[] dices;
//        int[] counts;
//        
//        Random ran;
//        
//        public YachtDice() {
//                ran = new Random();
//                dices = new int[DICE_SIZE];
//                counts = new int[MAX_DICE_NUM];
//                
//                // Arrays.fill() : 배열을 원하는 숫자로 초기화 해주는 메서드
//                // ※ Arrays 클래스에는 배열을 편하게 다룰 수 있는 다양한 기능들이 모여있다 (JAVA API 참조) 
//                Arrays.fill(dices, 1);                
//        }        
//        
//        public void roll() {
//                for (int i = 0; i < DICE_SIZE; ++i) {
//                        dices[i] = ran.nextInt(6) + 1;
//                }
//        }
//        
//        public void printDice() {
//                System.out.println(Arrays.toString(dices));
//        }
//        
//        private String available() {
//                String result = "";
//                
//                return result;
//        }
//        
//        boolean checkNo1() {
//                boolean check2 = false;
//                boolean check3 = false;
//                
//                for (int count : counts) {
//                        if (count == 2) {
//                                check2 = true;
//                        } else if (count == 3) {
//                                check3 = true;
//                        }
//                }
//                return check2 && check3;
//        }
//        
//        public void countDices() {
//                for (int i = 0; i < MAX_DICE_NUM; i++) {
//                        counts[i] = 0;
//                }
//                
//                for (int i = 0; i < DICE_SIZE; i++) {
//                        counts[dices[i] - 1]++;
//                }
//        }
//        
//        // 스몰 스트레이트 확인하기.
//        boolean checkNo2() {
//                boolean check = false;
//                
//                if (counts[2] >= 1 && counts[3] >= 1) {
//                        if (counts[0] >= 1 && counts[1] >= 1 || counts[1] >= 1 && counts[4] >= 1 || counts[4] >= 1 && counts[5] >= 1) {
//                                check = true;
//                        }
//                }
//                return check;
//        }
//        
//        // 라지 스트레이트 확인하기.
//        boolean checkNo3() {
//                boolean check = false;
//                
//                if (counts[1] >= 1 && counts[2] >= 1 && counts[3] >= 1 && counts[4] >= 1) {
//                        if (counts[0] >= 1 || counts[5] >= 1) {
//                                check = true;
//                        }
//                }
//                return check;
//        }
//        
//        // 4 다이스 확인하기.
//        boolean checkNo4() {
//                boolean check = false;
//                for (int count : counts) {
//                        if (count >= 4) {
//                                check = true;
//                        }
//                }
//                return check;
//        }
//        
//        // 5 다이스 확인하기.
//        boolean checkNo5() {
//                boolean check = false;
//                for (int count : counts) {
//                        if (count == 5) {
//                                check = true;
//                        }
//                }
//                return check;
//        } 
//}











