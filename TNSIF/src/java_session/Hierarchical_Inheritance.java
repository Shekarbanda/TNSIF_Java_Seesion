package java_session;


class Animal1{
	void eat(String s) {
		System.out.println(s+"eating");
	}
}

class Dog1 extends Animal1{
	void bark() {
		System.out.println("bark");
	}
}

class Cat extends Animal1{
	void meow() {
		System.out.println("meow");
	}
}

public class Hierarchical_Inheritance {
	public static void main(String args[]) {
		Dog1 dog = new Dog1();
		Cat cat = new Cat();
		
		dog.eat("dog");
		dog.bark();
		cat.eat("cat");
		cat.meow();
	}
}
