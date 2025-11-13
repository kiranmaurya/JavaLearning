package OopsJava.Inheritance.Single;

public class parent {
    void show(){
        System.out.println("Parent");
    }
}
 class child extends parent{
     void show(){
         System.out.println("Child");
     }
}
class main{
    public static void main(String[] args) {
        parent p = new parent();
        parent c = new child();
        p.show();
        c.show();
    }
}
