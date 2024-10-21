package practice_questions_assignment;

public class Method_overloading {
	int sum(int a,int b) {
		return a+b;
	}
	float sum(float x,float y) {
		return x+y;
	}
	public static void main(String[] args) {
		Method_overloading obj = new Method_overloading();
		int sum1 = obj.sum(1, 2);
		float sum2 = obj.sum(10.2f, 20.1f);

		System.out.println("sum of int values : "+sum1);
		System.out.println("sum of float values : "+sum2);
	}
}
