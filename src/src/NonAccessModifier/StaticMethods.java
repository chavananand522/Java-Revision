package NonAccessModifier;

class College {
	static void details() {
		System.out.println("Static Method");
	}
}

public class StaticMethods {
	public static void main(String[] args) {
		College.details();

	}
}
