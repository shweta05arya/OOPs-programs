import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        // Creating a Set
        Set<String> set = new HashSet<>();

        // 🔸 Insertion
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Apple"); // duplicate (ignored)

        System.out.println("After Insertion: " + set);

        // 🔸 Searching
        System.out.println("Is Mango present? " + set.contains("Mango"));

        // 🔸 Deletion
        set.remove("Banana");
        System.out.println("After Deletion: " + set);

        // 🔸 Updation (Not direct)
        set.remove("Apple");
        set.add("Orange");
        System.out.println("After Updation: " + set);

        // 🔸 Traversal
        System.out.println("Traversal:");
        for (String item : set) {
            System.out.println(item);
        }
    }
}