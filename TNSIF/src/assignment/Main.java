package assignment;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. AirIndia");
		System.out.println("2. KingFisher");
		System.out.println("3. Indigo");
		
		System.out.println("Choose your Choice from 1-3 :");
		
		//taking input from user
		int userChoice = scan.nextInt();
		int hour;
		double cost;
		Airfare airfareObj;
		double total;
		
		switch(userChoice) {
		case 1:
			System.out.println("Enter No.of Hours : ");
			hour = scan.nextInt();
			System.out.println("Enter Cost Per Hour : ");
			cost = scan.nextDouble();
			
			//assigning values through constructor
			airfareObj = new AirIndia(hour,cost);
			
			//assigning values through setters
//			airfareObj.setHours(hour);
//			airfareObj.setCostPerHour(cost);
			
			//calculating fare
			total  = airfareObj.calculateAmount();
			System.out.printf("%.2f",total);
		
			break;
			
		case 2:
			System.out.println("Enter No.of Hours : ");
			hour = scan.nextInt();
			System.out.println("Enter Cost Per Hour : ");
			cost = scan.nextDouble();
			
			//assigning values through constructor
			airfareObj = new KingFisher(hour,cost);
			
			//assigning values through setters
//			kingfisherObj.setHours(hour);
//			kingfisherObj.setCostPerHour(cost);
			
			//calculating fare
			total  = airfareObj.calculateAmount();
			System.out.printf("%.2f",total);

			break;
			
		case 3:
			System.out.println("Enter No.of Hours : ");
			hour = scan.nextInt();
			System.out.println("Enter Cost Per Hour : ");
			cost = scan.nextDouble();
			
			//assigning values through constructor
			airfareObj = new Indigo(hour,cost);
			
			//assigning values through setters
//			indigoObj.setHours(hour);
//			indigoObj.setCostPerHour(cost);
			
			//calculating fare
			total  = airfareObj.calculateAmount();
			System.out.printf("%.2f",total);
			break;
			
		default:
			System.err.println("Invalid Option");
			break;
		}
		
		scan.close();
	}

}
