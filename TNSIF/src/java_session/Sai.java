package java_session;

class Book {
    String title;
    String name;
    double price;

    public Book(String title, String name, double price) {
        this.title = title;
        this.name = name;
        this.price = price;
    }
    public void display() {
        System.out.println("Title: " + title + ", Author: " + name + ", Price: " + price);
    }
}

class Sai {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book("Java", "Sai", 1000);
        books[1] = new Book("Java", "Loki", 2000);
        books[2] = new Book("Java", "Siva", 3000);
//        books[3] = new Book("Java", "anjhdb", 3009990);

        for (Book book : books) {
            book.display();
        }
    }
}



