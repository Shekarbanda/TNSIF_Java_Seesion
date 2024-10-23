package java_Collections;
import java.util.*;

public class Linked_List_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new LinkedList<>();
		
		//insert elements
		list.add(22);
		list.add(31);
		list.add(41);
		
		//to access elements
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		//print the all data
		for(int i:list) {
			System.out.println(i);
		}
		
		System.out.println(list);
		
		list.set(1, 2);
		
		//removes the data from ll
		list.remove(1);
		//checks whether data present or not
		
		System.out.println(list.contains(2));
		
		//to get the particular data via index
		System.out.println(list.get(1));
		
		System.out.println(list);
		
	
		
		//size of the ll
		System.out.println(list.size());
	
		//removes all the data 
		list.clear();
		System.out.println(list.size());
		
		List<Integer>marks = new LinkedList<>();
		
		for(int i=1;i<6;i++) {
			marks.add(i);
		}
		
		System.out.println(marks);
		
		for(int j : marks) {
			System.out.println(j);
		}
		
	}

}
