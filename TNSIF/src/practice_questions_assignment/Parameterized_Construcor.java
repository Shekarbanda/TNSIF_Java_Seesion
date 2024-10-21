package practice_questions_assignment;

class Book{
	String title;
	String author;
	Book(String title,String author){
		this.title = title;
		this.author = author;
	}
	void display() {
		System.out.println("Book title is : "+title);
		System.out.println("Book author is : "+author);
	}
}
public class Parameterized_Construcor {
	public static void main(String[] args) {
		Book book = new Book("Mahabharath","Ved Vyasa");
		book.display();
	}
}
