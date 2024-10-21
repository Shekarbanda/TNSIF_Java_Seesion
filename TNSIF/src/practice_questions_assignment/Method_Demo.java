package practice_questions_assignment;
import java.util.Scanner;

public class Method_Demo {
	public int product(int a,int b) {
		return a*b;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value : ");
		int a = scan.nextInt();
		System.out.println("Enter b value : ");
		int b = scan.nextInt();
		Method_Demo obj = new Method_Demo();
		System.out.println("product of "+a +" and "+b+" is : "+obj.product(a,b));
	}

}
