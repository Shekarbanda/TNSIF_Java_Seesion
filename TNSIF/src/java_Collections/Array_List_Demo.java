package java_Collections;
import java.util.*;

public class Array_List_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a = new ArrayList<>();
		
		//inserting data into ArrayList
		a.add("anu");
		a.add("raj");
		a.add("sai");
		a.add("ram");
		
		//modify the data already present
		a.set(1, "geetha");
		
		//removes the data from arraylist
//		a.remove(1);
		//checks whether data present or not
		System.out.println(a.contains("anu"));
		
		//to get the particular data via index
		System.out.println(a.get(1));
		
		System.out.println(a);
		
		for(String i:a) {
			System.out.println(i);
		}
		
		//size of the arraylist
		System.out.println(a.size());
		
		//removes all the data 
		a.clear();
		System.out.println(a.size());
		
		List<Integer>marks = new ArrayList<>();
		
		for(int i=1;i<6;i++) {
			marks.add(i);
		}
		
		System.out.println(marks);
		
		for(int j : marks) {
			System.out.println(j);
		}
		

	}

}
