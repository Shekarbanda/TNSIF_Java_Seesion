package java_session;


class Animal{
	void eat() {
		System.out.println("eating");
	}
}

class mummle extends Animal{
	void feed() {
		System.out.println("give milk");
	}
}

class Dog extends mummle{
	void bark() {
		System.out.println("bark");
	}
}

public class MultiLevel_Inheritance {
	public static void main(String args[]) {
		Dog dog = new Dog();
		dog.eat();
		dog.feed();
		dog.bark();
	}

}
