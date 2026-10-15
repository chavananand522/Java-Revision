package Inheritance;

class Vehicle {
	void runs(){
		System.out.println("Runs 90km per hr");
	}
}

class Shine extends Vehicle{
	void method () {
		System.out.println("shine is a vehicle");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {

		Shine s = new Shine ();
		s.runs();
		s.method();

	}

}
