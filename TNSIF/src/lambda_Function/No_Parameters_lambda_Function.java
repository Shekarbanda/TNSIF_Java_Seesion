package lambda_Function;


interface Drawing{
	String draw();
}

public class No_Parameters_lambda_Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawing d1 = ()->{
			return "Drawing";
		};
		
		System.out.println(d1.draw());
		

	}

}
