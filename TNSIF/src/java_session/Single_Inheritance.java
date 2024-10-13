package java_session;


class A{
	int a = 10;
	void display() {
		System.out.println("from A");
	}
}

class B extends A{
	int a = 11;
	
	void display() {
		System.out.println("from B"+" "+super.a);
		super.display();
	}
	
}

public class Single_Inheritance {
	public static void main(String[] args) {
		B obj = new B();
		obj.display();
		
	}

}
