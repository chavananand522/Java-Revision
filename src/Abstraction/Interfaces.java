package Abstraction;

interface Payment {

	// Methods are public and abstract by default
	void pay();

	// Variables are public, static and final by default
	int amount = 1000;
}

//A class implements an interface using implements
class UPI implements Payment {

	@Override
	public void pay() {
		System.out.println("Payment Done using UPI");
	}

}

//A class can implement multiple interfaces
interface Receipt {
	void generateReceipt();
}

class OnlinePayment implements Payment, Receipt {

	@Override
	public void generateReceipt() {
		System.out.println("Receipt Generated!");
	}

	@Override
	public void pay() {
		System.out.println("Payment Done Successfully!");
	}

}

public class Interfaces {

	public static void main(String[] args) {

		Payment p = new UPI();
		p.pay();

		// Accessing public static final variable
		System.out.println("Amount:" + Payment.amount);

		OnlinePayment op = new OnlinePayment();
		op.pay();
		op.generateReceipt();

	}

}
