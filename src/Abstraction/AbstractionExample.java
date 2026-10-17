package Abstraction;

abstract class Vehicle {

	// Showing essential feature
	abstract void start();

	  // Hiding implementation details
	void stop() {
		System.out.println("Vehicle Stopped");
	}
}

class Car extends Vehicle {
	void start() {
		System.out.println("Car Starts With a Key");
	}
}

public class AbstractionExample {
	public static void main(String[] args) {

        // We cannot create an object of abstract class
        // Vehicle v = new Vehicle(); // Error

		Car c = new Car();
		c.start();

		c.stop();

	}
}
