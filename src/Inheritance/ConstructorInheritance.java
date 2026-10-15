package Inheritance;

class Az {
	Az(){
		System.out.println("Parent Constructor");
	}
}

class Bz extends Az {
	Bz(){
		System.out.println("Child Constructor");
	}
}


public class ConstructorInheritance {

	public static void main(String[] args) {

		Bz obj = new Bz();


	}

}
