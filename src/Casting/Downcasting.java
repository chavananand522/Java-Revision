package Casting;

class Ac {
	void show() {
		System.out.println("Parent Class");
	}
}

class Bc extends Ac {
	void display() {
		System.out.println("Child Class");
	}
}

public class Downcasting {
	public static void main(String[] args) {

		Ac Obj1 = new Bc();
		Bc Obj2 = (Bc) Obj1;

		Obj1.show();
		Obj2.display();

	}
}
