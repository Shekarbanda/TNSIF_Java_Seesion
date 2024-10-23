package java_Collections;
import java.util.Vector;
import java.util.LinkedList;
import java.util.List;

public class Vector_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> v = new Vector<>();
		
		//to add elements
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		
		//to access elements
		System.out.println(v.get(0));
		System.out.println(v.get(1));
		
		//print the all data
		for(int i:v) {
			System.out.println(i);
		}
		
		System.out.println(v);
		
		v.set(1, 2);
		
		//removes the data from vector
		v.remove(1);
		//checks whether data present or not
		
		System.out.println("is 2 exists : "+v.contains(2));
		
		if(v.contains(Integer.valueOf(40))) {
			System.out.println("40 is present");
		}
		else {
			System.out.println("40 is not present");
		}
		
		//to get the particular data via index
		System.out.println(v.get(1));
		
		System.out.println(v);
			
			//size of the vector
			System.out.println(v.size());
		
			//removes all the data 
			System.out.println("size of vector v is : "+v.size());
			v.clear();
			System.out.println("size of vector v after clearing: "+v.size());
			
			
			List<Integer>data = new Vector<>();
			
			for(int i=1;i<6;i++) {
				data.add(i);
			}
			
			System.out.println(data);
			
			for(int j : data) {
				System.out.println(j);
			}
	

	}

}
