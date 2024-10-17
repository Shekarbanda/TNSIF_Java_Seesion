package tnsif.multithreading;


class Notepad1 implements Runnable{
	public void run() {
		System.out.println("Notepad running "+Thread.currentThread().getId());
	}
}

public class Runnable_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notepad1 note = new Notepad1();
		Thread thread = new Thread(note);
		
		thread.start();
		System.out.println("main id"+Thread.currentThread().getId());
	}

}
