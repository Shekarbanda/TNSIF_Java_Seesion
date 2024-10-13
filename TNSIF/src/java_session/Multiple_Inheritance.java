package java_session;


interface Student1{
	void display1();
}

interface Employee1{
	default void print() {
		System.out.println("default");
	}
	abstract void display2();
}

class Person1 implements Student1,Employee1{
	
	
	
	public void display1(){
		Employee1.super.print();
		System.out.println("yeesss from student");
	}
	public void display2(){
		 System.out.println("from employee");
	 }
}

public class Multiple_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 p = new Person1();
		p.display1();
		p.display2();

		
	}

}
