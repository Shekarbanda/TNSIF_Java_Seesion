package lambda_Function;

interface Getting{
	int get(int x);
}

public class Single_Parameter_Lambda_Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Getting g = (val)->{
			return val;
		};
		
		System.out.println(g.get(10));
	}

}
