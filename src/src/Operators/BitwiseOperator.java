package Operators;

public class BitwiseOperator {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20 ;
		
		 // Bitwise AND
        System.out.println(a & b);

        // Bitwise OR
        System.out.println(a | b);

        // Bitwise XOR
        System.out.println(a ^ b);

        // Bitwise NOT
        System.out.println(~a);

        // Left Shift
        System.out.println(a << 1);

        // Right Shift
        System.out.println(a >> 1);

        // Unsigned Right Shift
        System.out.println(a >>> 1);

	}

}
