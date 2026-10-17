package Abstraction;

interface University {
	interface Exam {
		void condutExam();
	}
}

class College implements University.Exam {

	@Override
	public void condutExam() {
		System.out.println("Exam is Conducted!");
	}

}

public class InterfaceInsideInterface {

	public static void main(String[] args) {

		University.Exam ue = new College();
		ue.condutExam();
	}

}
