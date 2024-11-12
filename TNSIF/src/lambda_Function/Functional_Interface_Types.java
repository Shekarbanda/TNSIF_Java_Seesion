package lambda_Function;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Functional_Interface_Types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Supplier
		Supplier<String> s = ()-> "from supplier";
		String svalue = s.get();
		System.out.println(svalue);
		
		//Predicate
		Predicate<Integer> p = (n)-> n%2==0;
		int num = 16;
		
		if(p.test(num)) {
			System.out.println(num+" is even");
		}
		else {
			System.out.println(num+" is odd");
		}
		
		//Consumer
		Consumer<String> c = msg-> System.out.println("from consumer "+msg);
		c.accept("anu");

	}

}
