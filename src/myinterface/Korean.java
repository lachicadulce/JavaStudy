package myinterface;

public class Korean implements Language{

	String lan;
	
	public Korean(String lan) {
		this.lan = lan;
	}
	
	@Override
	public void verbose() {
		System.out.println("Let's start studying " + lan);
		
	}
	
	@Override
	public void bye() {
		System.out.println("잘가");
		
	}
	@Override
	public void hello() {
		System.out.println("안녕");
		
	}
	@Override
	public void seeyoulater() {
		System.out.println("다음에 봐");
		
	}
	@Override
	public void thanks() {
		System.out.println("고마워");
		
	}
}
