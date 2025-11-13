package oopsKeywords.FinalKeywords;

public class finalmethod {
    final void display() {
        System.out.println("Parent display method");
    }
}

class Child extends finalmethod {
    // void display() { ❌ Error: Cannot override final method }
}

class FinalMethodDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display(); // calls parent method
    }
}
