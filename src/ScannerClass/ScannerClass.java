package ScannerClass;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Youe Name: ");
		String name = sc.nextLine();

		System.out.println("Enter Youe Age: ");
		int age = sc.nextInt();

		System.out.println("Enter Youe Salary : ");
		double salary = sc.nextDouble();

		System.out.println("Enter Youe Grade : ");
		char Grade = sc.next().charAt(0);

		System.out.println("Are you Student : ");
		boolean student = sc.nextBoolean();

		System.out.println("\n--- Student Details ---");
		System.out.println("Name : " + name);
		System.out.println("Name : " + age);
		System.out.println("Name : " + salary);
		System.out.println("Name : " + Grade);
		System.out.println("Name : " + student);

		sc.close();

	}
}
