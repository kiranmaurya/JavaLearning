package Collection.Interface;
import java.util.*;
public class CollectionInterfaceMethods {
        public static void main(String[] args) {

            Collection<String> names = new ArrayList<>();

            // add()
            System.out.println("add() Method");
            names.add("Kiran");
            names.add("Aman");
            names.add("Riya");

            // size()
            System.out.println("size() Method");
            System.out.println("Size: " + names.size());

            // contains()
            System.out.println("contains() Method");
            System.out.println("Contains Aman? " + names.contains("Aman"));

            // isEmpty()
            System.out.println("isEmpty() Method");
            System.out.println("Is Empty? " + names.isEmpty());

            // remove()
            System.out.println("remove() Method");
            names.remove("Aman");
            System.out.println("After removing Aman: " + names);

            // addAll()
            System.out.println("addAll() Method");
            Collection<String> extra = Arrays.asList("Dev", "Nikita");
            names.addAll(extra);
            System.out.println("After addAll: " + names);

            // containsAll()
            System.out.println("containsAll() Method");
            System.out.println("Contains all from extra? " + names.containsAll(extra));

            // removeAll()
            System.out.println("removeAll() Method");
            names.removeAll(extra);
            System.out.println("After removeAll: " + names);

            // removeIf()
            System.out.println("removeIf() Method");
            names.removeIf(n -> n.startsWith("R")); // remove names starting with R
            System.out.println("After removeIf R*: " + names);

            // toArray()
            System.out.println("toArray() Method");
            Object[] arr = names.toArray();
            System.out.println("Array length: " + arr.length);

            // stream()
            System.out.println("stream() Method");
            names.stream().forEach(System.out::println);

            //Iterator()
            System.out.println("Iterator() Method");
            List<String> list = List.of("A", "B", "C");
            Iterator<String> it = list.iterator();

            while (it.hasNext()) {
                System.out.println(it.next());
            }

            //parallelStream()
            System.out.println("parallelStream() Method");
            List<Integer> nums = List.of(1, 2, 3, 4, 5);

            nums.parallelStream().forEach(n ->
                    System.out.println(n + " " + Thread.currentThread().getName())
            );


            //Object[] toArray()
            System.out.println("Object[] toArray()Method");
            List<String> list2 = List.of("A", "B", "C");
            Object[] arr2 = list2.toArray();

            System.out.println(Arrays.toString(arr2));

            //T[] toArray(T[] arr)
            System.out.println("T[] toArray T[] arr Method");
            List<String> list3 = List.of("A", "B", "C");

            String[] arr3 = list3.toArray(new String[0]);

            System.out.println(Arrays.toString(arr3));


            //removeIf(Predicate filter)
            System.out.println("removeIf(Predicate filter) Method");
            List<Integer> num = new ArrayList<>(List.of(1,2,3,4,5,6));
            num.removeIf(n -> n % 2 == 0);

            System.out.println(num);  // [1, 3, 5]




        }
}
