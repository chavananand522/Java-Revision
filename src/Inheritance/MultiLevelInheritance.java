package Inheritance;

class Animal {
	void drinks() {
		System.out.println("Animal is eating");
	}
}

class Cat extends Animal {
	void eat() {
		System.out.println("Cat class");
	}
}

class SmallCat extends Cat {
	void run() {
		System.out.println("small cat class");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {

		SmallCat c = new SmallCat();
		c.eat();
		c.drinks();
		c.run();

	}

}
