package Collection.Interface;
import java.util.*;
public class AllPrograms {

        public static void main(String[] args) {

            /* ------------------------------ LIST ------------------------------ */
            List<String> list = new ArrayList<>();
            list.add("A");
            list.add("B");
            list.add("A"); // duplicates allowed

            System.out.println("=== LIST (ArrayList) ===");
            System.out.println("List: " + list);
            System.out.println("get(1): " + list.get(1));
            System.out.println();


            /* ------------------------------ SET ------------------------------- */
            Set<Integer> set = new HashSet<>();
            set.add(10);
            set.add(20);
            set.add(10); // duplicate → ignored

            System.out.println("=== SET (HashSet) ===");
            System.out.println("Set: " + set);
            System.out.println("Contains 20? " + set.contains(20));
            System.out.println();


            /* ------------------------------ QUEUE ----------------------------- */
            Queue<String> queue = new LinkedList<>();
            queue.add("X");
            queue.add("Y");
            queue.add("Z");

            System.out.println("=== QUEUE (LinkedList) ===");
            System.out.println("Queue: " + queue);
            System.out.println("peek(): " + queue.peek());
            System.out.println("poll(): " + queue.poll());
            System.out.println("After poll: " + queue);
            System.out.println();


            /* ------------------------------ DEQUE ----------------------------- */
            Deque<String> deque = new ArrayDeque<>();
            deque.addFirst("Front1");
            deque.addLast("Rear1");
            deque.addFirst("Front2");

            System.out.println("=== DEQUE (ArrayDeque) ===");
            System.out.println("Deque: " + deque);
            System.out.println("removeFirst(): " + deque.removeFirst());
            System.out.println("removeLast(): " + deque.removeLast());
            System.out.println("After removals: " + deque);
            System.out.println();


            /* ------------------------------ MAP ------------------------------ */
            Map<Integer, String> map = new HashMap<>();
            map.put(1, "Apple");
            map.put(2, "Banana");
            map.put(1, "Mango");  // key duplicate → updates value

            System.out.println("=== MAP (HashMap) ===");
            System.out.println("Map: " + map);
            System.out.println("get(2): " + map.get(2));
            System.out.println("Contains key 1? " + map.containsKey(1));
            System.out.println();
        }
}
