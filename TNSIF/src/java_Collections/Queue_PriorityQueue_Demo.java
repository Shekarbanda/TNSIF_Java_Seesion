package java_Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_PriorityQueue_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> q2 = new PriorityQueue<>();
		
		q2.add(5);
		q2.add(4);
		q2.add(10);
		q2.add(2);
		q2.add(1);

		//print
		System.out.println(q2); //1 2 10 4 5
		//but internally stores as 1 2 4 5 10
		
		//get element
		System.out.println("using element : "+q2.element());
		System.out.println("using peek : "+q2.peek());
		
		//remove element
		System.out.println("using poll : "+q2.poll());
		System.out.println("using remove : "+q2.remove(3));
		
		
		//isempty
		System.out.println("is empty : "+q2.isEmpty());
		
		
		System.out.println(q2);
		
		//size
		System.out.println("size is : "+q2.size());
		
		//check ir contains or not
		System.out.println("is it contains 2 element : "+q2.contains(2));
		
		
	}

}
