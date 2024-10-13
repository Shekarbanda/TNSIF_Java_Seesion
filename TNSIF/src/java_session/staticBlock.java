package java_session;


class etc{
	
	
	public void display2() {
		System.out.println("hello");
	}
	
	static {
		System.out.println("static first");
	}
	
	static {
		System.out.println("static second");
	}
}

public class staticBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		etc obj = new etc();
		obj.display2();
	}

}
