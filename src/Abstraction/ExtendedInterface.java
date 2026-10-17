package Abstraction;

interface Animal {
	void eat();
}

interface Dog extends Animal {
	void bark();
}

class Puppy implements Dog, Animal {

	@Override
	public void eat() {
		System.out.println("Animals are Eating");

	}

	@Override
	public void bark() {
		System.out.println("Dog is Barking");

	}
}

public class ExtendedInterface {

	public static void main(String[] args) {
		Puppy p = new Puppy();
		p.bark();
		p.eat();
	}

}
