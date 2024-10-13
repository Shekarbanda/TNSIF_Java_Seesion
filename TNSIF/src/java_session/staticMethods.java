package java_session;

class ex{
	public static void add() {
		int a = 10,b=10;
		System.out.println(a+b);
	}
	
	public static int add(int x,int y) {
		return x+y;
	}
}

public class staticMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex.add();
		System.out.println(ex.add(1,1));
	}

}
