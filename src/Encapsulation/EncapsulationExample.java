package Encapsulation;

class Student {

// Data Hiding
	private int id;
	private String name;
	private double fees;

	// Controlled Access
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

// Security: getter allows fees to be read through a public method
	public double getFees() {
		return fees;
	}

	// Security: validation prevents negative fees from being assigned
	public void setFees(double fees) {
		if (fees > 0) {
			this.fees = fees;
		} else {
			System.out.println("Fees cannot be Negative");
		}
	}

}

public class EncapsulationExample {

	public static void main(String[] args) {

		Student s = new Student();

// Controlled Access: values are modified through setter methods
		s.setId(101);
		s.setName("Dipak");

		// Security: invalid negative fees are rejected by validation
		s.setFees(-32000);

		// Controlled Access: values are read through getter methods
		System.out.println("Id: " + s.getId());
		System.out.println("Name: " + s.getName());
		System.out.println("Fees: " + s.getFees());

	}

}
