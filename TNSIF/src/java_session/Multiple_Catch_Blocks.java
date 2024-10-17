package java_session;

public class Multiple_Catch_Blocks {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		
		try {
			arr[7] = 10/0;
		}
		catch(ArithmeticException e) {
			System.out.println("arithmetic exception"+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("array out of bound"+ e.getMessage());
		}

	}

}
