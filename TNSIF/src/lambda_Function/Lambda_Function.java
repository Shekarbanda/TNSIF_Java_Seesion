package lambda_Function;

interface Printing1{
	public void print();
}

public class Lambda_Function {

	public static void main(String[] args) {
		
		int print = 10;
		Printing1 p1 = ()->{
			System.out.println("printing "+print);
		};
		
		p1.print();
	}

}
