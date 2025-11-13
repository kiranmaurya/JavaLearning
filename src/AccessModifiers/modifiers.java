package AccessModifiers;

public class modifiers {
    public String pub = "Public";
    private String pri = "Private";
    protected String pro = "Protected";
    String def = "Default";
}
 class main{
    public static void main(String[] args) {
        modifiers m  = new modifiers();
        System.out.println(m.pub);
       // System.out.println(m.pri);  show Error because access only inside the class
        System.out.println(m.pro);
        System.out.println(m.def);
    }
}



