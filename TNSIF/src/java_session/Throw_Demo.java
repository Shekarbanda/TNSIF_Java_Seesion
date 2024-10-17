package java_session;

public class Throw_Demo {

	void validateage(int age) {
		try {
		if(age<18) {
			throw new ArithmeticException("not eligible");
		}
		else {
			System.out.println("eligible");
		}
		}
		catch(Exception e) {
			
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throw_Demo obj = new Throw_Demo();
		obj.validateage(15);
	}

}
