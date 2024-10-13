package java_session;

public class String_Buffer_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer("hello world");
		
		Thread t = new Thread(()->{
				buffer.append(" java");
		});
		
		Thread t2 = new Thread(()->{
			buffer.insert(4, "hii\n");
		});
		t2.start();
		t.start();
		
		try {
			t2.join();
			t.join();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println(buffer);
	}

}
