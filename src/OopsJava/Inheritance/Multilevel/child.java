package OopsJava.Inheritance.Multilevel;

public class child {
    void show(){
        System.out.println("Child");
    }
}
class main{
    public static void main(String[] args) {
        child c = new child();
        parent p = new parent();
        grandparent g =  new grandparent();
        c.show();
        p.show();
        g.show();
    }

}

