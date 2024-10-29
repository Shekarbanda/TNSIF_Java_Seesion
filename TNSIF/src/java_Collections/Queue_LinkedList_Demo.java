package java_Collections;
import java.util.*;

public class Queue_LinkedList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> q = new LinkedList<>();
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		
		System.out.println(q);
		
		//to get elements
		System.out.println(q.element());
		
		//remove peek element
		System.out.println(q.poll());
		
		//peek element
		System.out.println(q.peek());
		
		//empty check
		System.out.println("is queue is empty : "+q.isEmpty());
		
		

	}

}
