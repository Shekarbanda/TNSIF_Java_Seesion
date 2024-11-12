package lambda_Function;

interface Mutiple{
	String wish(String msg);
}

public class Multiple_Statements {

	public static void main(String[] args) {
		
		Mutiple m1 = (msg)->{
			String def = "welcome";
			String final_msg = def+" "+msg;
			return final_msg;
		};

		System.out.println(m1.wish("anu"));
	}

}
