package AccessModifiers;

class Vehicles {
	protected int bikes = 75;
}

public class Protected {

	public static void main(String[] args) {
		Vehicles v = new Vehicles();
		System.out.println(v.bikes);
	}

}
