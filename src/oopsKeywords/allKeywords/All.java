package oopsKeywords.allKeywords;

public interface All {

    void sound();  // public + abstract by default
}

// Abstract class (uses: abstract, protected, final, static)
abstract class Pet implements All {
    protected String name;
    static int totalPets = 0; // static variable shared by all objects

    // Constructor (uses: this keyword)
    Pet(String name) {
        this.name = name;
        totalPets++;
    }

    // Concrete method (normal method)
    void info() {
        System.out.println("I am a pet. My name is " + name);
    }

    // Abstract method (must be implemented by child class)
    public abstract void sound();

    // final method (cannot be overridden)
    public final void eat() {
        System.out.println(name + " is eating...");
    }
}

// Class Dog extends Pet and implements Animal (uses: extends, implements, super)
class Dog extends Pet {

    Dog(String name) {
        super(name); // calls parent (Pet) constructor
    }

    @Override
    public void sound() {
        System.out.println(name + " says: Woof Woof 🐶");
    }
}

// Class Cat extends Pet
class Cat extends Pet {

    Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + " says: Meow Meow 🐱");
    }
}

// Main class (uses: public, static, new, instanceof, return)
 class OOPsKeywordsDemo {
    public static void main(String[] args) {

        Dog dog = new Dog("Rocky");
        Cat cat = new Cat("Luna");

        dog.info();     // from Pet
        dog.sound();    // overridden
        dog.eat();      // final method

        System.out.println();

        cat.info();
        cat.sound();
        cat.eat();

        System.out.println("\nTotal Pets Created: " + Pet.totalPets); // static variable

        // instanceof keyword demo
        if (dog instanceof Pet) {
            System.out.println("Yes, dog is a Pet");
        }

        // Using return keyword in a method call
        System.out.println("Pet Type: " + getPetType(cat));
    }

    // Method using return keyword
    static String getPetType(Pet pet) {
        return pet.name + " is a " + pet.getClass().getSimpleName();
    }
}

