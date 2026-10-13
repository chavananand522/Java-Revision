package TypeCasting;

public class Narrowing {

	public static void main(String[] args) {

		double a = 10.89383;
		float b = (float) a;

		float c = 8938.3f;
		long d = (long) c;

		long e = 73998984;
		int f = (int) e;

		int g = 83983;
		short h = (short) g;

		short i = 9389;
		byte j = (byte) i;

		System.out.println("Double : " + a);
		System.out.println("Float  : " + b);

		System.out.println();

		System.out.println("Float  : " + c);
		System.out.println("Long   : " + d);

		System.out.println();

		System.out.println("Long   : " + e);
		System.out.println("Int    : " + f);

		System.out.println();

		System.out.println("Int    : " + g);
		System.out.println("Short  : " + h);

		System.out.println();

		System.out.println("Short  : " + i);
		System.out.println("Byte   : " + j);
	}

}
