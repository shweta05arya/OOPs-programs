import java.util.*;

public class SortedMapExample {
    public static void main(String[] args) {

        // Creating a SortedMap
        SortedMap<Integer, String> map = new TreeMap<>();

        // 🔸 Insertion
        map.put(3, "Mango");
        map.put(1, "Apple");
        map.put(2, "Banana");

        System.out.println("After Insertion (Sorted): " + map);

        // 🔸 Updation
        map.put(2, "Orange"); // replaces Banana
        System.out.println("After Updation: " + map);

        // 🔸 Searching
        System.out.println("Value for key 1: " + map.get(1));

        // 🔸 Deletion
        map.remove(3);
        System.out.println("After Deletion: " + map);

        // 🔸 Traversal
        System.out.println("Traversal:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 🔸 Special SortedMap Methods
        System.out.println("First Key: " + map.firstKey());
        System.out.println("Last Key: " + map.lastKey());

        System.out.println("HeadMap (keys < 2): " + map.headMap(2));
        System.out.println("TailMap (keys >= 2): " + map.tailMap(2));
    }
}