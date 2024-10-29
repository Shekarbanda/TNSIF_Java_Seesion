package java_Collections;
import java.util.*;

public class Map_hashmap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> m = new HashMap<>();
		
		m.put("anu", 100);
		m.put("raju", 95);
		m.put("sai", 92);
		
		//initial map
		System.out.println(m);
		
		
		//get data via key
		System.out.println(m.get("sai"));
		
		//update data by key
		m.put("sai", 88);
		
		System.out.println("map after update : "+m);

		//remove a data by key
		m.remove("raju");
		
		//map after remove 
		System.out.println("map after removing : "+m);
		
		//containskey
		System.out.println("is map contains anu key : " +m.containsKey("anu"));
		
		//containsValue
		System.out.println("is map contains 100 value : "+m.containsValue(100));
		
		//for each
		  for (String key : m.keySet()) {
	            System.out.println("Key: " + key);
	        }
	}

}
