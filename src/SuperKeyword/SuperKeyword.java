package SuperKeyword;

class A {
	int num = 10;

	A() {
		System.out.println("Parent Constructor");
	}

	void display() {
		System.out.println("Parent Method");
	}
}

class B extends A {
	int num = 20;

	B() {
		super(); // 1. Call parent class constructor
		System.out.println("Child Constructor");
	}

	void show() {
		System.out.println("Parent Variable: " + super.num); // 2. Access parent variable
		System.out.println("Child Variable: " + num);
		super.display(); // 3. Call parent class method
	}

}

public class SuperKeyword {

	public static void main(String[] args) {

		B obj = new B();
		obj.show();
	}

}
