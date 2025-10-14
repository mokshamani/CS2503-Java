// Main.java
public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "James Gosling", 499.99);
        Book b2 = new Book("Clean Code", "Robert C. Martin", 599.50);

        b1.displayDetails();
        b2.displayDetails();
    }
}
