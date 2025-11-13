package oopsKeywords.SuperKeywords;

public class Accessbyparent {
    String name = "Parent Class";
}

class Child1 extends Accessbyparent {
    String name = "Child Class";

    void show() {
        System.out.println("Child name: " + name);
        System.out.println("Parent name: " + super.name); // use super
    }

    public static void main(String[] args) {
        new Child1().show();
    }
}

