package myobj.pirate;

import java.util.Arrays;

public class MrTong {
	
	// true: �ش� ������ ���� ����
	// false: �ش� ������ ���� ���� ����
	boolean[] stabbed;
	boolean[] launch;
	
	// launched�� true�� ��������� �߻�� ����
	public boolean launched;
	
	public MrTong(int size) {
		stabbed = new boolean[size];
		
		// ���� ��ġ ����
		for(int i = 0; i < 4; ++i) {
			launch[(int)(Math.random() * size)] = true;
		}
	}
	
	public boolean[] getStabbed() {
		return stabbed;
	}
	
	// �̹� �� ���̶�� return false, �ƴ϶�� ��� �� �񷶴ٸ� return true
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
