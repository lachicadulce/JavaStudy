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
		System.out.println("�߰�");
		
	}
	@Override
	public void hello() {
		System.out.println("�ȳ�");
		
	}
	@Override
	public void seeyoulater() {
		System.out.println("������ ��");
		
	}
	@Override
	public void thanks() {
		System.out.println("����");
		
	}
}
