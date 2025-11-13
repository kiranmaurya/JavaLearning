package OopsJava.Inheritance.Hierachical;

public class parent {
    void show(){
        System.out.println("Parent ");
    }
}
class child1 extends parent{
    void show(){
        System.out.println("First child ");
    }
}
class child2 extends parent{
    void show(){
        System.out.println("Second child ");
    }
}
class main{
    public static void main(String[] args) {
        parent p = new parent();
        parent c1 = new child1();
        parent c2 = new child2();
        p.show();
        c1.show();
        c2.show();
    }
}
