import java.util.*;
import java.util.function.Consumer;

public class ProductSorter {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product(101, "Laptop", 55000));
        products.add(new Product(102, "Smartphone", 35000));
        products.add(new Product(103, "Headphones", 2000));
        products.add(new Product(104, "Monitor", 12000));

        System.out.println("📦 Original List:");
        products.forEach(System.out::println);

        // 🔹 Sort by price using lambda expression
        products.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        System.out.println("\n💰 Sorted by Price (Ascending):");
        products.forEach(System.out::println);

        // 🔹 Sort by name using lambda expression
        products.sort((p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName()));
        System.out.println("\n🔤 Sorted by Name (Alphabetical):");
        products.forEach(System.out::println);

        // 🔹 Using a custom functional interface with lambda
        System.out.println("\n🧮 Applying Discount using Functional Interface:");
        Discount discount = (p) -> p.getPrice() * 0.90; // 10% off
        products.forEach(p -> System.out.println(p.getName() + " after discount: ₹" + discount.apply(p)));

        // 🔹 Using Consumer functional interface
        System.out.println("\n📋 Displaying all products using Consumer Lambda:");
        Consumer<Product> display = (p) -> System.out.println("Product -> " + p.getName() + " | Price -> ₹" + p.getPrice());
        products.forEach(display);
    }
}

// ✅ Functional Interface
@FunctionalInterface
interface Discount {
    double apply(Product p);
}
