package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Terminal_Operations_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> data = Arrays.asList(5,6,7,4,3,2,1,8,9);
		
		List<String> names = Arrays.asList("a","b");
		
		//forEach
		System.out.println("elemetns in the data list : ");
		data.stream().forEach(i->System.out.print(i+" "));
		System.out.println();
		
		//toArray
		String[] arr = names.stream().toArray(String[]::new);
		System.out.println("to array is : "+Arrays.toString(arr));
		
		//reduce
		int sum = data.stream().reduce(0, Integer::sum);
		System.out.println("sum of elements : "+sum);
		
		//count
		long count = data.stream().count();
		System.out.println("count of elements : "+count);
		
		//minimum
		Optional<Integer> minimum = data.stream().min(Integer::compareTo);
		System.out.println("minimum number : "+minimum);
		
		//maximum
		Optional<Integer> maximum = data.stream().max(Integer::compareTo);
		System.out.println("maximum number : "+maximum);
		
		//allMatch
		boolean isPositive = data.stream().allMatch(i->i>0);
		System.out.println("all elements are positive : "+isPositive);

		//AnyMatch
		boolean isNegitive = data.stream().anyMatch(i->i<0);
		System.out.println("all elements are negative : "+isNegitive);
		
		//noneMatch
		boolean arePositive = data.stream().noneMatch(i->i<0);
		System.out.println("all elements are positive : "+arePositive);
		
		//firstMatch
		
		
	}

}
