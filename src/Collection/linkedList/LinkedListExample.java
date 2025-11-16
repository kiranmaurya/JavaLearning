package Collection.linkedList;
import java.util.*;

public class LinkedListExample {
        public static void main(String[] args) {

            // ---------- Creating LinkedList ----------
            LinkedList<String> list = new LinkedList<>();

            // ---------- Add Elements ----------
            list.add("A");
            list.add("B");
            list.add("C");

            list.addFirst("Start");
            list.addLast("End");

            System.out.println("After Adding: " + list);

            // ---------- Get Elements ----------
            System.out.println("First Element: " + list.getFirst());
            System.out.println("Last Element: " + list.getLast());
            System.out.println("Element at index 2: " + list.get(2));

            // ---------- Update (Set) ----------
            list.set(2, "BB");  // updates value
            System.out.println("After Updating index 2: " + list);

            // ---------- Check ----------
            System.out.println("List contains 'C'? : " + list.contains("C"));
            System.out.println("Size: " + list.size());
            System.out.println("Is Empty? : " + list.isEmpty());

            // ---------- Remove Elements ----------
            list.removeFirst();
            list.removeLast();
            list.remove("B");
            list.remove(1);

            System.out.println("After Removing: " + list);

            // ---------- Add for traversal ----------
            list.add("X");
            list.add("Y");
            list.add("Z");

            // ---------- Traversal (Different ways) ----------
            System.out.println("\nTraversal using for-each:");
            for(String s : list){
                System.out.print(s + " ");
            }

            System.out.println("\n\nTraversal using Iterator:");
            Iterator<String> it = list.iterator();
            while(it.hasNext()){
                System.out.print(it.next() + " ");
            }

            System.out.println("\n\nTraversal using for-loop:");
            for(int i = 0; i < list.size(); i++){
                System.out.print(list.get(i) + " ");
            }

            System.out.println("\n\nTraversal using descendingIterator:");
            Iterator<String> rev = list.descendingIterator();
            while(rev.hasNext()){
                System.out.print(rev.next() + " ");
            }

            // ---------- Clear ----------
            list.clear();
            System.out.println("\n\nAfter Clear: " + list);
        }
}
