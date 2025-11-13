package OopsJava.Abstraction.Interface;

public interface Vehicle {
    void start();
}
class car implements Vehicle{
    public void start(){
        System.out.println("Car Starts");
    }
}
class main{
    public static void main(String[] args) {
        Vehicle v =  new car();
        v.start();
    }
}