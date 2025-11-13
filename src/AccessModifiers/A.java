package AccessModifiers;

public interface A {

    void a();  // public + abstract by default
}

interface B {
    void b();  // public + abstract by default
}

class C implements A, B {

    // private method → accessible only inside class C
    private void privateMethod() {
        System.out.println("Private Method");
    }

    // default method → accessible only inside same package
    void defaultMethod() {
        System.out.println("Default Method");
    }

    // protected method → accessible in same package and subclasses
    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    // public methods (from interfaces)
    @Override
    public void a() {
        System.out.println("A (Public Interface Method)");
    }

    @Override
    public void b() {
        System.out.println("B (Public Interface Method)");
    }

    // main() inside C
    public static void main(String[] args) {
        C obj = new C();
        obj.a();               // ✅ accessible
        obj.b();               // ✅ accessible
        obj.privateMethod();   // ✅ accessible (same class)
        obj.defaultMethod();   // ✅ accessible (same class)
        obj.protectedMethod(); // ✅ accessible (same class)
    }
}

