package ScannerClass;

public class BreakStatement {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 7) {
				System.out.println("Breaked the Loop : " + i);
				break;
			}
			System.out.println(i);
		}
	}
}
