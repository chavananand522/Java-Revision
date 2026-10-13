package NonAccessModifier;

abstract class Animal {
	abstract void sound();
}

class Dog extends Animal {
	void sound() {
		System.out.println("Dog Barks");
	}
}

public class AbstractKeyword {

	public static void main(String[] args) {

		Dog d = new Dog();
		d.sound();

	}

}
