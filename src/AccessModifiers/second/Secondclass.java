package AccessModifiers.second;

import AccessModifiers.first.Firstclass;

public class Secondclass {

    public static class SecondClass extends Firstclass {
        public static void main(String[] args) {
            Firstclass obj1 = new Firstclass();

            // obj1.privateMethod();   ❌ Not accessible (private)
            // obj1.defaultMethod();   ❌ Not accessible (different package)
            // obj1.protectedMethod(); ❌ Not accessible via object (different package)
            obj1.publicMethod();      // ✅ Accessible (public)

            // ✅ Access protected method through inheritance
            SecondClass obj2 = new SecondClass();
            obj2.protectedMethod();// ✅ Accessible (because subclass)
        }
    }
}

