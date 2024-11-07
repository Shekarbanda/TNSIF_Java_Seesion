package lambda_Function;

interface Printing{
	public void print();
}

class Printing_class implements Printing{
	int print =10;
	public void print() {
		System.out.println("printing "+print);
	}
}

public class Without_Lambda_Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Printing_class p = new Printing_class();
		
		p.print();
	}

}
