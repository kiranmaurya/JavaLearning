package Arrays;
import java.util.Scanner;

public class AverageMarksCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n]; // Array is Declare
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": "); // Access Array using for loop
            marks[i] = sc.nextInt();
            sum += marks[i];
        }

        double average = (double) sum / n;
        System.out.println("Average Marks = " + average);
    }
}
