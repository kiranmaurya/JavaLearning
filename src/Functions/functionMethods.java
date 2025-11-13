package Functions;

public class functionMethods {


        // 1️⃣ No return type, No parameters
        void greet() {
            System.out.println("Hello, welcome to Java!");
        }

        // 2️⃣ No return type, With parameters
        void greetUser(String name) {
            System.out.println("Hello " + name + ", have a great day!");
        }

        // 3️⃣ Return type, No parameters
        int getLuckyNumber() {
            return 7;
        }

        // 4️⃣ Return type, With parameters
        int add(int a, int b) {
            return a + b;
        }

        // 5️⃣ Static method
        static void info() {
            System.out.println("This is a static method in Java!");
        }

        public static void main(String[] args) {
            // Object creation for non-static methods
            functionMethods obj = new functionMethods();

            // Calling non-static methods
            obj.greet();
            obj.greetUser("Kiran");
            System.out.println("Lucky Number: " + obj.getLuckyNumber());
            System.out.println("Sum: " + obj.add(5, 10));

            // Calling static method
            functionMethods.info();
        }
}
