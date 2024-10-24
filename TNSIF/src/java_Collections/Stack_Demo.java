package java_Collections;
import java.util.Stack;

public class Stack_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> s = new Stack<>();
		
		//insert data
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(3);
		
		System.out.println(s.search(1));
		System.out.println(s.search(2));
		System.out.println(s.search(3));
		System.out.println(s.search(3));
		
		//return top element
		System.out.println("top element in the stack: " +s.peek());
		
		//remove top element
		System.out.println("popped ");s.pop();
		
		//search element return 1 if true and -1 for false
		System.out.println(s.search(3));
		if(s.search(3)==1) {
			System.out.println("10 is present in the stack at :"+s.search(3));
		}
		else {
			System.out.println("10 is not present in the stack");
		}
		
		//stack is empty or not
		System.out.println("is stack empty? : "+ s.isEmpty());
		
		//display data
		System.out.println(s);

	}

}
