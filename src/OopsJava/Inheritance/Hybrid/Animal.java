package OopsJava.Inheritance.Hybrid;

public class Animal {
    void eat(){
        System.out.println("Aniaml is Eating");
    }
}
class dog extends Animal{
    void bark(){
        System.out.println("Dog sound is barking");
    }
}
interface playable{
    void play();
}
class petdog extends dog implements playable{
    public void play(){
        System.out.println("Playing with Owner");
    }
}
class main{
    public static void main(String[] args) {
        petdog p = new petdog();
        p.eat();
        p.bark();
        p.play();

    }
}
