
package Inheritance;

interface A {
    void show();
}

interface B {
    void display();
}

class C implements A, B {

    public void show() {
        System.out.println("show method");
    }

    public void display() {
        System.out.println("display method");
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.display();
    }
}
