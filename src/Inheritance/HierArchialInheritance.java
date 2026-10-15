package Inheritance;

class Animals {
	void eat() {
		System.out.println("Animal");
	}
}

class Cats extends Animals {
	void eat() {
		System.out.println("Cat");
	}
}

class Dog extends Animals {
	void eat() {
		System.out.println("Dog");
	}
}

class Cow extends Animals {
	void eat() {
		System.out.println("Cow");
	}
}

public class HierArchialInheritance {

	public static void main(String[] args) {

		Cats c = new Cats();
		c.eat();
		Dog d = new Dog();
		d.eat();
		Cow c1 = new Cow();
		c1.eat();

	}

}
