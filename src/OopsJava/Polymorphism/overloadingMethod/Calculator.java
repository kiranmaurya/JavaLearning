package OopsJava.Polymorphism.overloadingMethod;

public class Calculator {
    int add(int a ,int b){
        return a + b;
    }
    double add(double a, double b){
        return a + b;
    }
}

class main{
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(" Addtion of Integer : "+ c.add(5,6));
        System.out.println(" Addtion of Double : " + c.add(6.5,6.6));
    }
}
