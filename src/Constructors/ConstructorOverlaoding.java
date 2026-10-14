package Constructors;

class Employee {
    int id;
    String name;

    // No-args Constructor
    Employee() {
        id = 101;
        name = "Dipak";
    }

    // Constructor with 1 parameter
    Employee(int i) {
        id = i;
        name = "Dipak";
    }

    // Constructor with 2 parameters
    Employee(int i, String s) {
        id = i;
        name = s;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class ConstructorOverlaoding {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee(102);
        Employee e3 = new Employee(103, "Anand");

        e1.display();
        e2.display();
        e3.display();
    }
}