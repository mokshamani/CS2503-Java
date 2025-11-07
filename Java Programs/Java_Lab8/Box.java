// Generic class to hold any type of data
public class Box<T> {
    private T item;

    // Constructor
    public Box(T item) {
        this.item = item;
    }

    // Getter method
    public T getItem() {
        return item;
    }

    // Setter method
    public void setItem(T item) {
        this.item = item;
    }

    // Display method
    public void displayItem() {
        System.out.println("📦 Box contains: " + item + " (Type: " + item.getClass().getSimpleName() + ")");
    }
}
