package testing;

class Parent {
    // Static variable
    static int staticVarParent = 10;

    // Instance variable
    int instanceVarParent = 20;

    // Static method
    static void staticMethodParent() {
        System.out.println("Static method in Parent");
    }

    // Instance method
    void instanceMethodParent() {
        System.out.println("Instance method in Parent");
    }
}

class Child extends Parent {
    // Static variable (shadows the parent's static variable)
    static int staticVarChild = 30;

    // Instance variable (shadows the parent's instance variable)
    int instanceVarChild = 40;

    // Static method (hides the parent's static method)
    static void staticMethodChild() {
        System.out.println("Static method in Child");
    }

    // Instance method (overrides the parent's instance method)
    @Override
    void instanceMethodParent() {
        System.out.println("Instance method in Child");
    }
}

public class Main {
    public static void main(String[] args) {
        // Accessing static variables and methods through class names
        System.out.println(Parent.staticVarParent);   // Output: 10
        Parent.staticMethodParent();                   // Output: Static method in Parent

        System.out.println(Child.staticVarChild);     // Output: 30
        Child.staticMethodChild();                     // Output: Static method in Child

        // Using references and objects
        Parent parentRef = new Parent();
        Parent childRef = new Child();

        // Accessing instance variables and methods
        System.out.println(parentRef.instanceVarParent);     // Output: 20
        parentRef.instanceMethodParent();                     // Output: Instance method in Parent

        System.out.println(childRef.instanceVarParent);      // Output: 20 (inherited from Parent)
        childRef.instanceMethodParent();                      // Output: Instance method in Child (overridden)

        // Note: Instance variables are not polymorphic, and their values are determined by the reference type.
        // However, instance methods are polymorphic, and the method from the actual object's class is invoked.
    }
}
