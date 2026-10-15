package Casting;

class A {
	void show() {
		System.out.println("Parent Class");
	}
}

class B extends A {
	void display() {
		System.out.println("Child Class");
	}
}

public class Upcasting {

	public static void main(String[] args) {

		A obj = new B();
		obj.show();

	}

}
