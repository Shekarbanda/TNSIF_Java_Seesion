package java_session;

public class SingleDimentional_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4};

		for(int i: a) {
			System.out.println(i);
		}
		
		//dynamic initialization
		int b[] = new int[5];
		
		for(int i=0;i<b.length;i++) {
			b[i]=i;
			System.out.println(b[i]);
		}
	}

}
