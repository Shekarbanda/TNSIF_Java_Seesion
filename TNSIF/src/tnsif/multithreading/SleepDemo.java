package tnsif.multithreading;


class Notepad4 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("notepad running"+Thread.currentThread().getId());
		try{
			sleep(1000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	}
	
}



public class SleepDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notepad4 n = new Notepad4();
		n.start();
		
	
//		for(int i=0;i<5;i++) {
//			System.out.println("main "+Thread.currentThread().getId());
//
//		}
		
	}

}

