package NonAccessModifier;

class Outer {
	static int age = 21;

	static class Inner {
		void display() {
			System.out.println("Age:" + age);
			System.out.println("Static nested class");
		}
	}
}

public class StaticNestedClass {

	public static void main(String[] args) {

		Outer.Inner obj = new Outer.Inner();
		obj.display();

	}

}
