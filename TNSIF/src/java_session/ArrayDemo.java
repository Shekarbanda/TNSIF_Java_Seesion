package java_session;

public class ArrayDemo {
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4};
		
		//static initialization
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		//dynamic initialization
		int b[] = new int[5];
		
		for(int i=0;i<b.length;i++) {
			b[i]=i;
			System.out.println(b[i]);
		}
	}

}
