package Collection.Interface;
import java.util.*;
public class QueueInterface {
        public static void main(String[] args) {

            // 1) LinkedList → FIFO Queue + supports null
            Queue<String> linkedListQueue = new LinkedList<>();
            linkedListQueue.add("A");
            linkedListQueue.add("B");
            linkedListQueue.add("C");

            // 2) PriorityQueue → Sorted Priority (natural ordering)
            Queue<Integer> priorityQueue = new PriorityQueue<>();
            priorityQueue.add(30);
            priorityQueue.add(10);
            priorityQueue.add(20);

            // 3) ArrayDeque → Fast Queue, No NULL allowed
            ArrayDeque<String> arrayDeque = new ArrayDeque<>();
            arrayDeque.add("Dog");
            arrayDeque.add("Cat");
            arrayDeque.add("Cow");

            System.out.println("=== LinkedList Queue ===");
            showQueueMethods(linkedListQueue, "NEW");

            System.out.println("\n=== PriorityQueue ===");
            showQueueMethods(priorityQueue, 99);

            System.out.println("\n=== ArrayDeque ===");
            showQueueMethods(arrayDeque, "NEW");
        }

        // Method for showing common queue operations
        public static <T> void showQueueMethods(Queue<T> q, T newElement)
    {

            System.out.println("Original Queue: " + q);

            // peek()
            System.out.println("peek(): " + q.peek());

            // element() → same as peek but throws exception if empty
            System.out.println("element(): " + q.element());

            // poll() → removes head, returns null if empty
            System.out.println("poll(): " + q.poll());
            System.out.println("After poll: " + q);

            // remove() → removes head, throws exception if empty
            System.out.println("remove(): " + q.remove());
            System.out.println("After remove: " + q);

            // offer() – NO CASTING NOW
            q.offer(newElement);
            System.out.println("After offer(" + newElement + "): " + q);

            // size()
            System.out.println("Size: " + q.size());

            // isEmpty()
            System.out.println("Is Empty? " + q.isEmpty());
        }
}
