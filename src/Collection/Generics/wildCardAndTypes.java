package Collection.Generics;

import java.util.*;

public class wildCardAndTypes {

    // 1️⃣ Unbounded Wildcard (?) → Read-only, type doesn't matter
        public static void printAnything(List<?> list) {
            System.out.println("Printing list:");
            for (Object item : list) {
                System.out.println(item);
            }
            System.out.println();
        }

        // 2️⃣ Upper Bounded Wildcard (? extends Number) → Read numbers safely
        public static double sumNumbers(List<? extends Number> list) {
            double sum = 0;
            for (Number n : list) {
                sum += n.doubleValue();
            }
            return sum;
        }

        // 3️⃣ Lower Bounded Wildcard (? super Integer) → Can add Integers safely
        public static void addIntegers(List<? super Integer> list) {
            list.add(10);
            list.add(20);
            list.add(30);
        }

        public static void main(String[] args) {

            // Integer list
            List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3));

            // Double list
            List<Double> doubleList = Arrays.asList(2.5, 3.5, 4.5);

            // Object list (for ? super Integer example)
            List<Object> objList = new ArrayList<>();

            // 1️⃣ Using unbounded wildcard (?)
            printAnything(intList);      // works
            printAnything(doubleList);   // works

            // 2️⃣ Using upper bounded wildcard (? extends Number)
            System.out.println("Sum of intList: " + sumNumbers(intList));
            System.out.println("Sum of doubleList: " + sumNumbers(doubleList));
            System.out.println();

            // 3️⃣ Using lower bounded wildcard (? super Integer)
            addIntegers(objList); // we can add integers
            printAnything(objList); // view list after adding items
        }
    }


