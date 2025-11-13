package OopsJava.Abstraction.Abstract;

abstract class Animal {
    abstract void sound();
    void eat(){
        System.out.println("Aniaml eat food");
    }
}
class dog extends Animal{
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
class main{
    public static void main(String[] args) {
        Animal d = new dog();
        d.sound();
        d.eat();
    }
}
