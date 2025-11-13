package OopsJava.Polymorphism.overridingMethod;

public class Animal {
    void sound(){
        System.out.println(" Aniaml makes sound");
    }
}
class dog extends Animal{
    @Override
    void sound(){
        System.out.println(" Dog barks");
    }
}
class main{
    public static void main(String[] args) {
        Animal a = new dog();
        a.sound();
    }
}
