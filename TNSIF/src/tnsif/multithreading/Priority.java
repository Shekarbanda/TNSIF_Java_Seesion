package tnsif.multithreading;


class Notepad3 extends Thread{
	public void run() {
		System.out.println("notepad running"+Thread.currentThread().getId());
	}
}

class Chrome3 extends Thread{
	public void run() {
		System.out.println("chrome running"+Thread.currentThread().getId());
	}
}

class Game3 extends Thread{
	public void run() {
		System.out.println("game running"+Thread.currentThread().getId());
	}
}

public class Priority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notepad3 n = new Notepad3();
		n.start();
		n.setPriority(Thread.MIN_PRIORITY);
		
		Chrome3 c = new Chrome3();
		c.start();
		c.setPriority(Thread.MAX_PRIORITY);
		
		Game3 g = new Game3();
		g.start();
		g.setPriority(Thread.NORM_PRIORITY);
	
//		for(int i=0;i<5;i++) {
//			System.out.println("main "+Thread.currentThread().getId());
//
//		}
		
	}

}
