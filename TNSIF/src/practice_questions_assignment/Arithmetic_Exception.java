package practice_questions_assignment;

public class Arithmetic_Exception {
	public static void main(String[] args) {
		try {
			int a = 10/0;
			System.out.println(a);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
	}
}
