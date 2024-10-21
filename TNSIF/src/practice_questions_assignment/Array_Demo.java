package practice_questions_assignment;
import java.util.Scanner;
public class Array_Demo {
	public static void main(String[] args) {
		int a1[] = new int[5];
		//for storing values into array
		for(int i=0;i<5;i++) {
			a1[i] = i+1;
		}
		//print array elements
		System.out.println("Array elements are : ");
		for(int i=0;i<5;i++) {
			a1[i] = i+1;
			System.out.println(a1[i]);
		}
		//or
		//by taking inputs from user and storing in a array and printing them
		Scanner scan = new Scanner(System.in);
		int a[] = new int[5];
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter integer value for array of index "+i +" :");
			a[i] = scan.nextInt();
		}
		System.out.println("Array elements are : ");
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}
		scan.close();
	}
}
