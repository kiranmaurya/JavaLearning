package oopsKeywords.FinalKeywords;

public class finalclass {
    void run() {
        System.out.println("Vehicle is running");
    }
}

// class Car extends Vehicle { ❌ Error: Cannot inherit from final class }

class FinalClassDemo {
    public static void main(String[] args) {
        finalclass v = new finalclass();
        v.run();
    }
}
