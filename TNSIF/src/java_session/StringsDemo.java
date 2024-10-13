package java_session;

public class StringsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello world";
		String s3 = "hello world";
		
		if(s==s3)
			System.out.println("yes");
		
		s="hello";

		if(s==s3)
			System.out.println("yes");
		
		String s1 = new String("hello");
		String s2 = s1;
		
		
		
		if(s1==s2)
			System.out.println("s1==s2"+"yes");
		
		
		System.out.println(s);
		
		System.out.println(s.substring(2));
		
	}

}
