package NonAccessModifier;

class Deepak {
	static {
		System.out.println("Staic block");
	}
}

public class StaticBlock {

	public static void main(String[] args) throws ClassNotFoundException {

		System.out.println("Main Method");
		Class.forName("NonAccessModifier.Deepak");

	}

}
