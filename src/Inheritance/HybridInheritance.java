package Inheritance;

interface Ac{
	void show();
}

class Bc{
	void display() {
		System.out.println("Class B");
	}
}

class Cs extends Bc implements Ac{
	public void show () {
		System.out.println("Class C");
	}
}

public class HybridInheritance {

	public static void main(String[] args) {

		Cs obj = new Cs ();
		obj.display();
		obj.show();

	}

}
