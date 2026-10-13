package Packages;

class Aryan {
	protected void finalize ( ) throws Throwable{
		System.out.println("Finalize method called");
	}
}

public class FinalizeMethod {

	public static void main(String[] args) {

		Aryan s = new Aryan ();
		s= null;

		System.gc();

		System.out.println("Main method");
	}

}
