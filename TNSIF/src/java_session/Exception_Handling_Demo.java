package java_session;

public class Exception_Handling_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b=0;
		
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}

		System.out.println(a/10);
	}

}
