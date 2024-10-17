package tnsif.multithreading;



class Notepad extends Thread{
	public void run() {
		System.out.println("notepad running"+Thread.currentThread().getId());
	}
}

class Chrome extends Thread{
	public void run() {
		System.out.println("chrome running"+Thread.currentThread().getId());
	}
}

class Game extends Thread{
	public void run() {
		System.out.println("game running"+Thread.currentThread().getId());
	}
}

public class MutliThreading {
public static void main(String[] args) {
	
	// TODO Auto-generated method stub
		Notepad n = new Notepad();
		n.start();
		
		Chrome c = new Chrome();
		c.start();
		
		Game g = new Game();
		g.start();
	
		for(int i=0;i<5;i++) {
			System.out.println("main "+Thread.currentThread().getId());

		}
		
}

}
