package Operators;

public class ArithematicOperators {

	public static void main(String[] args) {

		int a = 90;
		int b = 70;

		System.out.println("Result of a + b : " + (a + b)); // Addition
		System.out.println("Result of a + b : " + (a - b)); // Subtraction
		System.out.println("Result of a + b : " + (a * b)); // Multiplication
		System.out.println("Result of a + b : " + (a / b)); // Devision
		System.out.println("Result of a + b : " + (a % b)); // Modulus

		// ++ Increment
		System.out.println(a++); // Post
		System.out.println(++a); // Pre

		System.out.println(a--); // Post
		System.out.println(--a); // Pre

	}

}
