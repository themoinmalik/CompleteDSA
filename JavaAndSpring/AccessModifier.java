package src.JavaAndSpring;

public class AccessModifier {




    // A class with a protected member
    public class Parent {
        protected int protectedField;

        protected void protectedMethod() {
            System.out.println("This is a protected method");
        }
    }

    // Subclass in the same package
    public class Child extends Parent {
        public void accessProtectedMember() {
            System.out.println("Protected field value: " + protectedField);
            protectedMethod();
        }
    }

    // Unrelated class outside the package
    public class OutsideClass {
        public void accessProtectedMember() {
            // Cannot access protected members from unrelated classes outside the package
            // Uncommenting the lines below will result in a compilation error
            // Parent parent = new Parent();
            // System.out.println("Protected field value: " + parent.protectedField);
            // parent.protectedMethod();
        }
    }

}
