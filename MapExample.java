import java.util.*;

public class MapExample {
    public static void main(String[] args) {

        // Creating a Map
        Map<Integer, String> map = new HashMap<>();

        // 🔸 Insertion
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");

        System.out.println("After Insertion: " + map);

        // 🔸 Updation
        map.put(2, "Orange"); // replaces Banana
        System.out.println("After Updation: " + map);

        // 🔸 Searching
        System.out.println("Value for key 3: " + map.get(3));

        // 🔸 Deletion
        map.remove(1);
        System.out.println("After Deletion: " + map);

        // 🔸 Traversal
        System.out.println("Traversal:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}