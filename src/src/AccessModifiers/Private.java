package AccessModifiers;

class School {
	private int students = 900;

	void classRoom() {
		System.out.println(students);
	}
}

public class Private {
	public static void main(String[] args) {

		School sc = new School();
		sc.classRoom();
	}

}
