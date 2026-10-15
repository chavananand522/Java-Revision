package Casting;

class Ad {

}

class Bd extends Ad {

}

public class InstanceOfOperator {

	public static void main(String[] args) {

		Ad obj = new Bd();

		System.out.println(obj instanceof Ad);
		System.out.println(obj instanceof Bd);

	}

}
