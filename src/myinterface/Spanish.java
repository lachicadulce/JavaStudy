package myinterface;

public class Spanish implements Language{

	String lan;
	
	public Spanish(String lan) {
		this.lan = lan;
	}
	
	@Override
	public void verbose() {
		System.out.println("Let's start studying " + lan);
		
	}
	
	@Override
	public void bye() {
		System.out.println("adios");
		
	}
	@Override
	public void hello() {
		System.out.println("hola");
		
	}
	@Override
	public void seeyoulater() {
		System.out.println("hasta luego");
		
	}
	@Override
	public void thanks() {
		System.out.println("gracias");
		
	}
}
