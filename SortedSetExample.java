import java.util.*;

public class SortedSetExample {
    public static void main(String[] args) {

        // Creating a SortedSet
        SortedSet<Integer> set = new TreeSet<>();

        // 🔸 Insertion
        set.add(30);
        set.add(10);
        set.add(20);
        set.add(10); // duplicate (ignored)

        System.out.println("After Insertion (Sorted): " + set);

        // 🔸 Searching
        System.out.println("Is 20 present? " + set.contains(20));

        // 🔸 Deletion
        set.remove(30);
        System.out.println("After Deletion: " + set);

        // 🔸 Updation (Not direct)
        set.remove(10);
        set.add(15);
        System.out.println("After Updation: " + set);

        // 🔸 Traversal
        System.out.println("Traversal:");
        for (Integer num : set) {
            System.out.println(num);
        }

        // 🔸 Special SortedSet Methods
        System.out.println("First Element: " + set.first());
        System.out.println("Last Element: " + set.last());

        System.out.println("HeadSet (<15): " + set.headSet(15));
        System.out.println("TailSet (>=15): " + set.tailSet(15));
    }
}