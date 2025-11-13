package AccessModifiers.first;

public class Firstclass {

    private void privateMethod() {
        System.out.println("Private Method (first package)");
    }

    void defaultMethod() {
        System.out.println("Default Method (first package)");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method (first package)");
    }

    public void publicMethod() {
        System.out.println("Public Method (first package)");
    }

    public static void main(String[] args) {
        Firstclass obj = new Firstclass();
        obj.privateMethod();   // ✅ same class
        obj.defaultMethod();   // ✅ same class
        obj.protectedMethod(); // ✅ same class
        obj.publicMethod();    // ✅ same class
    }
}

