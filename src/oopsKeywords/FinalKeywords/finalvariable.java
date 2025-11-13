package oopsKeywords.FinalKeywords;

public class finalvariable {
    final int VALUE = 100;

    void show() {
        // VALUE = 200; ❌ Error — cannot change final variable
        System.out.println("Final value: " + VALUE);
    }

    public static void main(String[] args) {
        new finalvariable().show();
    }
}
