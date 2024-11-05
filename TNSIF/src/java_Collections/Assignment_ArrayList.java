package java_Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Assignment_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("size of array : ");
		int size = scan.nextInt();
		
		List<Integer> data = new ArrayList<>();
		
		System.out.println("Enter "+size+" scores with space : ");
		
		for(int i=0;i<size;i++) {
			int score = scan.nextInt();
			data.add(score);
		}
		
		System.out.println("All scores are : ");
		
		for(int s:data) {
			System.out.println(s);
		}
		scan.close();
	}

}
