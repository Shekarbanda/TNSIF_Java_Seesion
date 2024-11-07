package lambda_Function;


interface Addition{
	int sum(int a,int b);
}

public class Multiple_Parameter_Lambda_Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//without return keyword
		Addition a = (x,y)->x+y;
		
//		with return keyword
//		Addition a = (x,y)->{
//			return x+y;  
//		};
		
		System.out.println(a.sum(10,90));

	}

}
