package ScannerClass;

public class ContinueStatement {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 7) {
				System.out.println("Escaped Number is: " + i);
				continue;
			}
			System.out.println(i);
		}

	}

}
