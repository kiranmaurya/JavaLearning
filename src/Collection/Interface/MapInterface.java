package Collection.Interface;
import java.util.*;
public class MapInterface {
        public static void main(String[] args) {

            // 1) HashMap
            Map<Integer, String> hashMap = new HashMap<>();
            hashMap.put(3, "Banana");
            hashMap.put(1, "Apple");
            hashMap.put(2, "Mango");
            hashMap.put(null, "NullKeyValue"); // allowed

            // 2) LinkedHashMap
            Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.put(1, "Red");
            linkedHashMap.put(3, "Blue");
            linkedHashMap.put(2, "Green");

            // 3) TreeMap
            Map<Integer, String> treeMap = new TreeMap<>();
            treeMap.put(20, "Dog");
            treeMap.put(10, "Cat");
            treeMap.put(30, "Cow");
            // treeMap.put(null, "No"); // ❌ Null key NOT allowed

            System.out.println("==== HashMap ====");
            showMapMethods(hashMap);

            System.out.println("\n==== LinkedHashMap ====");
            showMapMethods(linkedHashMap);

            System.out.println("\n==== TreeMap ====");
            showMapMethods(treeMap);
        }

        // Method to display methods
        public static <K, V> void showMapMethods(Map<K, V> map) {

            System.out.println("Original Map: " + map);

            // get()
            System.out.println("get(1): " + map.get(1));

            // containsKey()
            System.out.println("containsKey(2): " + map.containsKey(2));

            // containsValue()
            System.out.println("containsValue(\"Blue\"): " + map.containsValue("Blue"));

            // remove()
            if (!map.isEmpty()) {
                K firstKey = map.keySet().iterator().next();
                System.out.println("remove(" + firstKey + "): " + map.remove(firstKey));
            }
            System.out.println("After remove: " + map);

            // replace()
            if (!map.isEmpty()) {
                K key = map.keySet().iterator().next();
                map.replace(key, (V) "ReplacedValue");
                System.out.println("After replace: " + map);
            }

            // putIfAbsent()
            map.putIfAbsent((K) Integer.valueOf(100), (V) "NewItem");
            System.out.println("After putIfAbsent: " + map);

            // keySet()
            System.out.println("keySet(): " + map.keySet());

            // values()
            System.out.println("values(): " + map.values());

            // entrySet()
            System.out.println("entrySet(): ");
            for (Map.Entry<K, V> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " → " + entry.getValue());
            }

            // Size
            System.out.println("Size: " + map.size());

            // isEmpty()
            System.out.println("Is Empty? " + map.isEmpty());
        }
}
