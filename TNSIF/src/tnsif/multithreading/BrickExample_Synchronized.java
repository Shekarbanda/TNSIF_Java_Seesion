package tnsif.multithreading;

class Dairy{
	int count=0;
	int count1 = 0;
	 void increment() {
		count+=50;
		synchronized(this) {
			count1+=50;
		}
	}
}

public class BrickExample_Synchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dairy d = new Dairy();
		Runnable r1 = ()->{
			for(int i=1;i<200000;i+=50) {
				d.increment();
			}
		};
		
		Runnable r2 = ()->{
			for(int i=1;i<20000;i+=50) {
				d.increment();
			}
		};
		
		Runnable r3 = ()->{
			for(int i=1;i<60000;i+=50) {
				d.increment();
			}
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println(d.count);
		System.out.println(d.count1);
		
		System.out.println(Thread.currentThread().getId()+" >> "+Thread.currentThread().getName());
		
		System.out.println(Thread.activeCount());

	}
	

}

