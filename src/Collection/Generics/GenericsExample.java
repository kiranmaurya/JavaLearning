package Collection.Generics;
import java.util.*;

    // 1️⃣ Generic Interface
    interface Container<T> {
        T getValue();
    }

    // 2️⃣ Generic Class implementing Generic Interface
    class Box<T> implements Container<T> {
        private T value;

        // Generic Constructor
        public Box(T value) {
            this.value = value;
        }

        @Override
        public T getValue() {
            return value;
        }
    }

    // 3️⃣ Generic Class with Bounded Type
    class NumberBox<T extends Number> {
        private T num;

        public NumberBox(T num) {
            this.num = num;
        }

        public double doubleValue() {
            return num.doubleValue();
        }
    }

    // 4️⃣ Class with Generic Method
    class Util {
        public static <T> void printItem(T item) {
            System.out.println("Item: " + item);
        }

        // Using Upper-Bounded Wildcard
        public static double sumList(List<? extends Number> list) {
            double sum = 0;
            for (Number n : list) {
                sum += n.doubleValue();
            }
            return sum;
        }

        // Using Lower-Bounded Wildcard
        public static void addIntegers(List<? super Integer> list) {
            list.add(10);
            list.add(20);
            list.add(30);
        }

        // Unbounded Wildcard
        public static void printAnything(List<?> list) {
            for (Object item : list) {
                System.out.println(item);
            }
        }
    }

public class GenericsExample {
        public static void main(String[] args) {

            // 5️⃣ Using Generic Class
            Box<String> b1 = new Box<>("Hello");
            Box<Integer> b2 = new Box<>(100);

            System.out.println("Box value: " + b1.getValue());
            System.out.println("Box value: " + b2.getValue());
            System.out.println();

            // 6️⃣ Using Bounded Generic Class
            NumberBox<Integer> nb1 = new NumberBox<>(50);
            System.out.println("Double value: " + nb1.doubleValue());
            System.out.println();

            // 7️⃣ Using Generic Method
            Util.printItem("Kiran");
            Util.printItem(999);
            System.out.println();

            // 8️⃣ Using Wildcards
            List<Integer> intList = Arrays.asList(1, 2, 3, 4);
            List<Double> doubleList = Arrays.asList(2.5, 3.5, 4.5);

            System.out.println("Sum of intList: " + Util.sumList(intList));
            System.out.println("Sum of doubleList: " + Util.sumList(doubleList));
            System.out.println();

            // Lower bounded wildcard
            List<Object> objList = new ArrayList<>();
            Util.addIntegers(objList);
            Util.printAnything(objList);
            System.out.println();

            // Unbounded wildcard
            Util.printAnything(intList);
        }
    }
