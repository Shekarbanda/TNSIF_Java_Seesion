package lambda_Function;

import java.util.ArrayList;
import java.util.List;

public class ForEach_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> arr = new ArrayList<>();
		
		arr.add(10);
		arr.add(11);
		arr.add(12);
		arr.add(13);
		
		List<String> data = new ArrayList<>();
		
		data.add("anu");
		data.add("raj");
		data.add("sai");
		
		arr.forEach(i->System.out.println(i));
		System.out.println();
		data.forEach(i->System.out.println(i));
	}

}
