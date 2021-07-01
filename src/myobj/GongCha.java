package myobj;

public class GongCha {

	String name;
	int sweet;
	int ice;

	GongCha(String name, int sweet, int ice) {
		this.name = name;
		this.sweet = sweet;
		this.ice = ice;
	}
	
	GongCha(String name) {
		this.name = name;
		this.sweet = 30;
		this.ice = 50;
	}
}
