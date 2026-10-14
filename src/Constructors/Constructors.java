package Constructors;

class Student {

	int id;
	String name;
	int age;

//	1. No - argument constructors
	Student() {
		id = 101;
		name = "Anand";
		age = 21;
	}

//	2. Parameterized constructors
	Student(int i, String s, int j) {
		id = i;
		name = s;
		age = j;
	}

	void display() {
		System.out.println(id + " " + name + " " + age);
	}

}

public class Constructors {

	public static void main(String[] args) {

		Student s1 = new Student();
		Student s2 = new Student(102,"Aryan",20);
		s1.display();
		s2.display();


	}

}
