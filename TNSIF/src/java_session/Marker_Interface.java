package java_session;



interface markerDemo{
	
}

class ex1 implements markerDemo{
	void getage1() {
		System.out.println("age is 20");
	}
}

public class Marker_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex1 m = new ex1();
		Object o = new Object();
		
		if(o instanceof markerDemo)
		m.getage1();
		else
		System.out.println("not found");

	}

}
