package NonAccessModifier;

class Student {
	static int age = 21;
	String name = "Anand";
}

public class StaticVariables {

	public static void main(String[] args) {

		Student s1 = new Student();
		Student s2 = new Student();

		System.out.println(s1.name);
		System.out.println(s2.name);
		System.out.println(Student.age);
		System.out.println(Student.age);
	}

}
