package Packages;

class Student {
	int age = 21;
}

public class GarbageCollection {

	public static void main(String[] args) {

		Student s = new Student();

		System.out.println(s.age);
		s = null;      // Object becomes eligible for garbage collection

		System.gc();    // Request garbage collection

	}

}
