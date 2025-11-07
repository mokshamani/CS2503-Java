import java.util.ArrayList;

public class WarehouseDemo {
    public static void main(String[] args) {
        System.out.println("🏭 Warehouse Inventory Tracker\n");

        // Creating boxes of different types
        Box<Integer> intBox = new Box<>(100);      // Autoboxing int → Integer
        Box<Double> doubleBox = new Box<>(75.5);   // Autoboxing double → Double
        Box<String> stringBox = new Box<>("Laptop");
        Box<Boolean> boolBox = new Box<>(true);

        // Displaying box contents
        intBox.displayItem();
        doubleBox.displayItem();
        stringBox.displayItem();
        boolBox.displayItem();

        System.out.println("\n📋 Tracking items in ArrayList with autoboxing...");

        // Using ArrayList with autoboxing
        ArrayList<Integer> itemIDs = new ArrayList<>();
        itemIDs.add(101);  // int → Integer (autoboxing)
        itemIDs.add(102);
        itemIDs.add(103);

        System.out.println("🗂️ Item IDs in warehouse: " + itemIDs);
    }
}
