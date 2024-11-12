package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Intermediate_Operations_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(3,1,1,1,7,5,4,6,2,8,9);
		
		List<List<Integer>> matrix = Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5,6),Arrays.asList(7,8,9));
		
		//map
		List<Integer> doubledlist = list.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println("doubledlist : "+doubledlist);

		//filter
		List<Integer> evennumbers = list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("evennumbers : "+evennumbers);
		
		//sorted
		List<Integer> sortednumbers = list.stream().sorted().collect(Collectors.toList());
		System.out.println("sortednumbers : "+sortednumbers);
		
		//distinct
		List<Integer> distinctnumbers = list.stream().distinct().collect(Collectors.toList());
		System.out.println("distinctnumbers : "+distinctnumbers);
		
		//limit
		List<Integer> limitednumbers = list.stream().limit(4).collect(Collectors.toList());
		System.out.println("limitednumbers : "+limitednumbers);
		
		//skip
		List<Integer> skippednumbers = list.stream().skip(4).collect(Collectors.toList());
		System.out.println("skippednumbers : "+skippednumbers);
		
		//flatMap
		List<Integer> flattedMatrix = matrix.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println("flattedmatrix : "+flattedMatrix);
		
		
	}

}
