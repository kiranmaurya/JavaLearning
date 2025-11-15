package Collection.Interface;
import java.util.*;
public class SetInterface {
        public static void main(String[] args) {

            // 1) HashSet → No order
            Set<String> hashSet = new HashSet<>();
            hashSet.add("Banana");
            hashSet.add("Apple");
            hashSet.add("Mango");
            hashSet.add("Apple"); // Duplicate ignored

            // 2) LinkedHashSet → Maintains insertion order
            Set<String> linkedHashSet = new LinkedHashSet<>();
            linkedHashSet.add("Dog");
            linkedHashSet.add("Cat");
            linkedHashSet.add("Cow");
            linkedHashSet.add("Dog"); // Duplicate ignored

            // 3) TreeSet → Sorted order (Ascending)
            Set<String> treeSet = new TreeSet<>();
            treeSet.add("Zebra");
            treeSet.add("Lion");
            treeSet.add("Tiger");
            treeSet.add("Lion"); // Duplicate ignored

            System.out.println("=== HashSet ===");
            showSetMethods(hashSet);

            System.out.println("\n=== LinkedHashSet ===");
            showSetMethods(linkedHashSet);

            System.out.println("\n=== TreeSet ===");
            showSetMethods(treeSet);
        }

        // Method to demonstrate Set operations
        public static void showSetMethods(Set<String> set) {

            System.out.println("Original Set: " + set);

            // contains()
            System.out.println("Contains element? " + set.contains(set.iterator().next()));

            // size()
            System.out.println("Size: " + set.size());

            // remove()
            String first = set.iterator().next(); // get first element using iterator
            set.remove(first);
            System.out.println("After removing \"" + first + "\": " + set);

            // add()
            set.add("NEW");
            System.out.println("After adding NEW: " + set);

            // isEmpty()
            System.out.println("Is empty? " + set.isEmpty());

            // toArray()
            Object[] arr = set.toArray();
            System.out.println("Array length: " + arr.length);

            // clear()
            // (Commented so result is visible; you can uncomment)
            // set.clear();
            // System.out.println("After clear: " + set);
        }

}
