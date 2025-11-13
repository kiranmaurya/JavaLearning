package oopsKeywords.SuperKeywords;

public class Callparentmethod {

        void display() {
            System.out.println("Parent display()");
        }
    }

    class Child2 extends Callparentmethod {
        void display() {
            super.display(); // calls parent method
            System.out.println("Child display()");
        }

        public static void main(String[] args) {
            new Child2().display();
        }
}
