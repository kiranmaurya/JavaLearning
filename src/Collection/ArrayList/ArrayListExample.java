package Collection.ArrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Kiran");
        students.add("Aarav");
        students.add("Riya");
        students.add("Kiran"); // duplicate allowed

        System.out.println("👩‍🎓 Student List: " + students);

        students.remove("Aarav");
        System.out.println("After removal: " + students);

        System.out.println("Total Students: " + students.size());
        System.out.println("Contains Riya? " + students.contains("Riya"));
    }
}
