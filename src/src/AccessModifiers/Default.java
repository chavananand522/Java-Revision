package AccessModifiers;

class Student {
	int age = 21; // default

	void display() {
		System.out.println(age);
	}
}

public class Default {

	public static void main(String[] args) {

		Student s = new Student();
		s.display();

		Person p = new Person();		//accessing method of public.java class
		p.show();
	}

}
