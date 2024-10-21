package practice_questions_assignment;

class Car{
	String model;
	int price;
	Car(){
		this.model = "Kia";
		this.price = 200000;
	}
	void display() {
		System.out.println("car model is : "+model);
		System.out.println("car price is : "+price);
	}
}
public class Default_Constructor {
	public static void main(String[] args) {
		Car car = new Car();
		car.display();
	}
}
