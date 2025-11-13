package Arrays;
import java.util.Arrays;

public class Arraysmethods {
        public static void main(String[] args) {

            // 1️⃣ Creating an array
            int[] numbers = {5, 2, 8, 1, 3};

            // 2️⃣ toString() - Convert array to string for easy printing
            System.out.println("Original Array: " + Arrays.toString(numbers));

            // 3️⃣ sort() - Sort array in ascending order
            Arrays.sort(numbers);
            System.out.println("Sorted Array: " + Arrays.toString(numbers));

            // 4️⃣ binarySearch() - Find element (works only on sorted arrays)
            int index = Arrays.binarySearch(numbers, 3);
            System.out.println("Index of 3: " + index);

            // 5️⃣ copyOf() - Copy first n elements to a new array
            int[] copy = Arrays.copyOf(numbers, 3);
            System.out.println("Copied first 3 elements: " + Arrays.toString(copy));

            // 6️⃣ copyOfRange() - Copy a range of elements
            int[] rangeCopy = Arrays.copyOfRange(numbers, 1, 4);
            System.out.println("Copied range (1-3): " + Arrays.toString(rangeCopy));

            // 7️⃣ equals() - Compare two arrays for equality
            System.out.println("Is copy equal to rangeCopy? " + Arrays.equals(copy, rangeCopy));

            // 8️⃣ fill() - Fill array with a particular value
            int[] filled = new int[5];
            Arrays.fill(filled, 9);
            System.out.println("Filled array: " + Arrays.toString(filled));

            // 9️⃣ mismatch() - Find first index where arrays differ
            int[] arr1 = {1, 2, 3, 4};
            int[] arr2 = {1, 2, 5, 4};
            System.out.println("Mismatch index: " + Arrays.mismatch(arr1, arr2));

            // 🔟 compare() - Compare lexicographically (-, 0, +)
            System.out.println("Compare arr1 & arr2: " + Arrays.compare(arr1, arr2));

            // 1️⃣1️⃣ parallelSort() - Faster sorting for large arrays (multi-threaded)
            int[] bigArray = {9, 7, 3, 1, 2};
            Arrays.parallelSort(bigArray);
            System.out.println("Parallel sorted: " + Arrays.toString(bigArray));

            // 1️⃣2️⃣ stream() - Convert array to Stream (for advanced operations)
            long count = Arrays.stream(numbers).filter(n -> n > 2).count();
            System.out.println("Count of numbers > 2: " + count);
        }
}
