package myobj.password;

public class CheckRules {

	char[] pwd;
	int pwdLen;
	
	public CheckRules(char[] pwd) {
		this.pwd = pwd;
		pwdLen = pwd.length;
	}
	
	public boolean isAllNum() {
		int count = 0;
		
		for (int i = 0; i < pwdLen; i++) {
			if (pwd[i] >= '0' && pwd[i] <= '9') {
				count++;
			}
		}
		return count == pwdLen;
	}
	
	public boolean check_numeric(char[] pass) {
		for(int i = 0, len = pass.length; i<len; ++i) {
			char ch = pass[i];
			if(ch < '0' || ch > '9') {
				return false;
			}
		}
		return true;
	}
	
	public boolean hasAllKinds() {
		int[] count = new int[4];
		for (int i = 0; i < pwdLen; i++) {
			if (pwd[i] >= '0' && pwd[i] <= '9') {
				count[0]++;
			} else if (pwd[i] >= 'A' && pwd[i] <= 'Z') {
				count[1]++;
			} else if (pwd[i] >= 'a' && pwd[i] <= 'z') {
				count[2]++;
			} else if (pwd[i] == '!' || pwd[i] == '@' || pwd[i] == '#' || pwd[i] == '$' || pwd[i] == '%' || pwd[i] == '^' || pwd[i] == '&' || pwd[i] == '*') {
				count[3]++;
			} else {
				return true;
			}
		}
		for (int i = 0; i < 4; i++) {
			if (count[i] == 0) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isDefinedSpecialChar() {
		for (int i = 0; i < pwdLen; i++) {
			if (!(pwd[i] >= '0' && pwd[i] <= '9') && !(pwd[i] >= 'A' && pwd[i] <= 'Z') && !(pwd[i] >= 'a' && pwd[i] <= 'z')) {
				if (!(pwd[i] == '!' || pwd[i] == '@' || pwd[i] == '#' || pwd[i] == '$' || pwd[i] == '%' || pwd[i] == '^' || pwd[i] == '&' || pwd[i] == '*')) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean lengthCheck() {
		return !(pwdLen >= 8 && pwdLen <= 24);
	}
}
