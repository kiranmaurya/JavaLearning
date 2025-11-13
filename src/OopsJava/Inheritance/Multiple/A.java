package OopsJava.Inheritance.Multiple;

public interface A {
    void a();
}
interface B{
    void b();
}
class C implements A,B{

    @Override
    public void a() {
        System.out.println(" A ");
    }

    @Override
    public void b() {
        System.out.println(" B ");
    }
}

class main{
    public static void main(String[] args) {
        C obj = new C();
        obj.a();  // Calls method from interface A
        obj.b();  // Calls method from interface B
    }
}