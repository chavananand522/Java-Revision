package Abstraction;

class School {

	 // Nested interface is implicitly static
    // It can use public, protected, private or default access
	interface Student {
		void study();
	}
}

class StudentDetails implements School.Student{
	@Override
	public void study() {
		System.out.println("Students are Studying!");
	}
}

public class InterfaceInsideClass {

	public static void main(String[] args) {

		School.Student ss = new StudentDetails();
		ss.study();
	}

}
