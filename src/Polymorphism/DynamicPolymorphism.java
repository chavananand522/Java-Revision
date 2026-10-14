package Polymorphism;

class Animal {
	void barks() {
		System.out.println("Dog Barks");
	}
}

class Dog extends Animal {
	@Override
	void barks() {
		System.out.println("Dog is an Animal");
	}
}

public class DynamicPolymorphism {

	public static void main(String[] args) {

		Animal a = new Animal();
		Dog d = new Dog();

		d.barks();
		a.barks();

	}

}
