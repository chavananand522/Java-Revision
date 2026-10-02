package ControlStatements;

public class NestedIfStatement {

	public static void main(String[] args) {

		int age = 20;
		boolean hasId = true;

		if (age >= 20) {
			if (hasId) {
				System.out.println("You Can Enter");
			}
		}
	}
}
