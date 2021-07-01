package myinterface;

public class English implements Language{

	String lan;
	
	public English(String lan) {
		this.lan = lan;
	}
	
	@Override
	public void verbose() {
		System.out.println("Let's start studying " + lan);
		
	}
	
	@Override
	public void bye() {
		System.out.println("bye");
	}
	@Override
	public void hello() {
		System.out.println("hi");
		
	}
	@Override
	public void seeyoulater() {
		System.out.println("see you later");
		
	}
	@Override
	public void thanks() {
		System.out.println("thanks");
		
	}
}
