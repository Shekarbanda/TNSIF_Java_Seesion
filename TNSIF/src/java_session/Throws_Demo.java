package java_session;
import java.io.IOException;

public class Throws_Demo {

	int division(int a,int b) throws ArithmeticException,IOException
	{
		if(b==0) {
			throw new ArithmeticException("divide by zero");
		}
		else {
			return a/b;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throws_Demo d = new Throws_Demo();
		try {
			System.out.println(d.division(8,0));
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(IOException e) {
			System.out.println(e);
		}

	}

}
