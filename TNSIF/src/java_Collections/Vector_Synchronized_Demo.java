package java_Collections;
import java.util.*;

public class Vector_Synchronized_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> v1 = new Vector<>();
		
		Thread t1 = new Thread(()->{
			for(int i=1;i<5;i++) {
				v1.add(i);
				System.out.println("Thread 1 added "+i);
			}
		});
		
		
		//for removing elements
		
		Thread t2 = new Thread(()-> {
			for(int i=1;i<5;i++) {
				if(!v1.isEmpty()) {
					System.out.println("Thread 2 is removed "+v1.remove(0));
				}
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}
		catch(Exception e) {
			System.out.println(e);
		}

		System.out.println(v1);
	}

}
