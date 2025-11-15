package Collection.Interface;
import java.util.*;
public class ListInterface {
        public static void main(String[] args) {

            // 1) ArrayList
            List<String> arrayList = new ArrayList<>();
            arrayList.add("A");
            arrayList.add("B");
            arrayList.add("C");

            // 2) LinkedList
            List<String> linkedList = new LinkedList<>();
            linkedList.add("X");
            linkedList.add("Y");
            linkedList.add("Z");

            // 3) Vector
            List<String> vector = new Vector<>();
            vector.add("P");
            vector.add("Q");
            vector.add("R");

            // 4) Stack (extends Vector)
            Stack<String> stack = new Stack<>();
            stack.push("One");
            stack.push("Two");
            stack.push("Three");

            System.out.println("=== ArrayList ===");
            showListMethods(arrayList);

            System.out.println("\n=== LinkedList ===");
            showListMethods(linkedList);

            System.out.println("\n=== Vector ===");
            showListMethods(vector);

            System.out.println("\n=== Stack ===");
            System.out.println("Stack before pop: " + stack);
            System.out.println("Popped element: " + stack.pop());
            System.out.println("Stack after pop: " + stack);
            showListMethods(stack);
        }

        // METHOD TO SHOW ALL IMPORTANT LIST METHODS
        public static void showListMethods(List<String> list) {

            System.out.println("Original List: " + list);

            // get()
            System.out.println("Element at index 1: " + list.get(1));

            // set()
            list.set(1, "UPDATED");
            System.out.println("After set(): " + list);

            // add(index, element)
            list.add(1, "INSERTED");
            System.out.println("After add(index, element): " + list);

            // remove(index)
            list.remove(0);
            System.out.println("After removing index 0: " + list);

            // indexOf()
            System.out.println("Index of UPDATED: " + list.indexOf("UPDATED"));

            // size()
            System.out.println("Size: " + list.size());

            // contains()
            System.out.println("Contains UPDATED? " + list.contains("UPDATED"));

            // isEmpty()
            System.out.println("Is empty? " + list.isEmpty());
        }
}
