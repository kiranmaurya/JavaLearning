package OopsJava.encapsulation;
// Encapsulation means - Wrapping data (variables) and methods (functions)
// together in a single unit (class), and restricting direct access to the data.
//Private variables — can’t be accessed directly (data hiding).
//Getters & Setters — used to read/update private data safely.
//Encapsulation — keeps data safe, allows control over how it’s changed.

public class encapsulation {

    // 🔒 Private variables — cannot be accessed directly outside this class
    private String name;
    private int age;

    // 🧱 Public "getter" method to read the private variable 'name'

    public String getName() {
        return name;
    }

    // 🧱 Public "setter" method to modify the private variable 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for 'age'
    public int getAge() {
        return age;
    }

    // Setter method for 'age'
    public void setAge(int age) {
        // 👇 You can add validation logic inside setter
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age! Age must be positive.");
        }
    }

    // 📘 A method to display details
    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // 🧩 main() method to test encapsulation
    public static void main(String[] args) {

        // Creating object of encapsulation class
        encapsulation person = new encapsulation();

        // Setting values using setter methods (not directly)
        person.setName("Kiran");
        person.setAge(22);

        // Getting values using getter methods
        System.out.println("Name using getter: " + person.getName());
        System.out.println("Age using getter: " + person.getAge());

        // Displaying all details using a class method
        person.showInfo();

        // Trying to set invalid data
        person.setAge(-5); // validation will trigger
    }
}
