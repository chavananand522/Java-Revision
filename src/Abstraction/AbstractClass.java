package Abstraction;

abstract class ATM {

	// Essential feature shown to the user
	abstract void withDrawMoney();
}

class SBI extends ATM {

	// Hiding implementation details
	@Override
	void withDrawMoney() {
		System.out.println("Money will Withdrawn From ATM");
	}

}

public class AbstractClass {

	public static void main(String[] args) {

		ATM a = new SBI ();
		a.withDrawMoney();
	}

}
