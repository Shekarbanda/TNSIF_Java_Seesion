package java_Collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class Queue_ArrayDequeue_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> q1 = new ArrayDeque<>();

		q1.add(1);
		q1.add(2);
		q1.add(3);
		q1.add(4);
		
		//print
		System.out.println(q1);
		
		//remove element
		System.out.println(q1.poll());
		System.out.println(q1.remove(2));
		
		//get element
		System.out.println(q1.element());
		
		//peek element
		System.out.println(q1.peek());
		
		//isempty
		System.out.println("is empty : "+q1.isEmpty());
		
		
		System.out.println(q1);
		
		//size
		System.out.println("size is : "+q1.size());
		
		//check ir contains or not
		System.out.println("is it contains 2 element : "+q1.contains(2));
		
		
	}

}
