package myobj.pirate;

import java.util.Arrays;

public class MrTong {
	
	// true: 해당 구멍은 찔린적 있음
	// false: 해당 구멍은 아직 찔린적 없음
	boolean[] stabbed;
	boolean[] launch;
	
	// launched가 true면 통아저씨가 발사된 상태
	public boolean launched;
	
	public MrTong(int size) {
		stabbed = new boolean[size];
		
		// 정답 위치 생성
		for(int i = 0; i < 4; ++i) {
			launch[(int)(Math.random() * size)] = true;
		}
	}
	
	public boolean[] getStabbed() {
		return stabbed;
	}
	
	// 이미 찔린 곳이라면 return false, 아니라면 찌르고 잘 찔렀다며 return true
	public boolean stab(int index) {
		if(stabbed[index]) {
			return false;
		} else {
			stabbed[index] = true;
			launched = launch[index];
			return true;
		}
	}
}
