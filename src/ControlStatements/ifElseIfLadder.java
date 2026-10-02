package ControlStatements;

public class ifElseIfLadder {

	public static void main(String[] args) {

		int marks = 76;

		if (marks > 90) {
			System.out.println("Very Good");
		} else if (marks > 75) {
			System.out.println("Good");
		}else if (marks >= 35){
			System.out.println("Average");
		}else {
			System.out.println("Bad");
		}

	}

}
