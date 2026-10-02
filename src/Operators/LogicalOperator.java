package Operators;

public class LogicalOperator {

	public static void main(String[] args) {

		int age = 18;
		boolean isEligible = true;

		// Logical AND (&&)
		System.out.println(age >= 18 && isEligible);

		// Logical OR (||)
		System.out.println(age < 18 || isEligible);

		// Logical NOT (!)
		System.out.println(!(age <= 18));

	}

}
