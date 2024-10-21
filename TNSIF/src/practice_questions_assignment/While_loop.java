package practice_questions_assignment;

public class While_loop {
	public static void main(String[] args) {
		int i = 2;
		int sum = 0;
		while(i<101) {
			sum+= i;
			i+= 2;
		}
		System.out.println("sum of all even numbers between 1-100 is : "+sum);
		
		//or
		int j=1;
		int sum2 = 0;
		while(j<101) {
			if(j%2==0) {
				sum2+= j;
			}
			j++;
		}
		System.out.println("sum of all even numbers between 1-100 is : "+sum2);
	}

}
