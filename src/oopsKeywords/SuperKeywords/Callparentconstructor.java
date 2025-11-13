package oopsKeywords.SuperKeywords;

public class Callparentconstructor {
    Callparentconstructor() {
            System.out.println("Parent Constructor Called");
        }
    }

    class Child3 extends Callparentconstructor {
        Child3() {
            super(); // calls parent constructor
            System.out.println("Child Constructor Called");
        }

        public static void main(String[] args) {
            new Child3();
        }
}
