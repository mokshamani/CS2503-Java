import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentMarksDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an ArrayList to store student marks
        ArrayList<Integer> marksList = new ArrayList<>();

        System.out.println("🎓 Student Marks List Management\n");

        // Add some initial marks
        marksList.add(85);
        marksList.add(92);
        marksList.add(78);
        marksList.add(90);

        // Display initial marks
        System.out.println("Initial Marks List: " + marksList);

        // CRUD Operations

        // Create (Add)
        System.out.print("\nEnter marks to add: ");
        int addMark = sc.nextInt();
        marksList.add(addMark);
        System.out.println("✅ Marks added: " + marksList);

        // Read (Display)
        System.out.println("\n📋 Displaying marks using Iterator:");
        Iterator<Integer> itr = marksList.iterator();
        while (itr.hasNext()) {
            System.out.println("Mark: " + itr.next());
        }

        // Update
        System.out.print("\nEnter index to update: ");
        int updateIndex = sc.nextInt();
        System.out.print("Enter new marks: ");
        int newMark = sc.nextInt();
        if (updateIndex >= 0 && updateIndex < marksList.size()) {
            marksList.set(updateIndex, newMark);
            System.out.println("✅ Updated Marks List: " + marksList);
        } else {
            System.out.println("❌ Invalid index!");
        }

        // Delete
        System.out.print("\nEnter index to delete: ");
        int deleteIndex = sc.nextInt();
        if (deleteIndex >= 0 && deleteIndex < marksList.size()) {
            int removed = marksList.remove(deleteIndex);
            System.out.println("✅ Removed mark: " + removed);
            System.out.println("Updated Marks List: " + marksList);
        } else {
            System.out.println("❌ Invalid index!");
        }

        sc.close();
    }
}
