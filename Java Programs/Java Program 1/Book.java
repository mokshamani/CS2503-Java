// Book.java
public class Book {
    // Instance variables
    String title;
    String author;
    double price;

    // Default constructor (constructor chaining to the parameterized one)
    public Book() {
        this("Unknown", "Unknown", 0.0);
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;   // "this" distinguishes instance fields from parameters
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book Title : " + this.title);
        System.out.println("Author     : " + this.author);
        System.out.println("Price      : ₹" + this.price);
        System.out.println("--------------------------------");
    }

    // Main method for testing
    public static void main(String[] args) {
        // Using default constructor
        Book b1 = new Book();
        b1.displayDetails();

        // Using parameterized constructor
        Book b2 = new Book("The Alchemist", "Paulo Coelho", 499.99);
        b2.displayDetails();

        Book b3 = new Book("Clean Code", "Robert C. Martin", 899.50);
        b3.displayDetails();
    }
}
