
package MiniProjects;

import java.util.Scanner;

public class ATMSimulationSystem {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double balance = 10000.00; // Store the initial account balance
		int pin = 1234; // Store the ATM PIN

		// Variables for user input and menu selection
		int enteredPin;
		int choice;

		// Count incorrect PIN attempts
		int attempts = 0;

		// Array to store transaction amounts (Maximum 100 transactions)
		double[] transactions = new double[100];
		// Array to store transaction types (Maximum 100 transaction types)
		String[] transactionTypes = new String[100];

		int transactionCount = 0; // total number of transactions

		System.out.println("Welocme to ATM\n");

		// Allow the user a maximum of 3 login attempts
		while (attempts < 3) {
			System.out.println("Enter your ATM Pin: ");
			enteredPin = sc.nextInt();

			// Check whether the entered PIN matches the original PIN
			if (enteredPin == pin) {
				System.out.println("Login Successful!");
				break;
			} else {
				attempts++;
				System.out.println("Incorrect Pin!");
				if (attempts < 3) {
					System.out.println("Attempts Remaining: " + (3 - attempts));
				}
			}
		}

		// Lock access if all 3 attempts are incorrect
		if (attempts == 3) {
			System.out.println("Your accout in locked.");
			sc.close();
			return; // Exit the main method
		}

		do {
			System.out.println("\n ==========ATM MENU=========");
			System.out.println("1.Check Balnace");
			System.out.println("2.Deposit Money");
			System.out.println("3.Withdraw Money");
			System.out.println("4.Transaction History");
			System.out.println("5.Change Pin");
			System.out.println("6.Exit");

			System.out.print("Enter Your Choice: ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Available Balance: Rs. " + balance);
				break;

			case 2:
				System.out.println("Enter deposit Amount: Rs.");
				double deposit = sc.nextDouble();

				if (deposit <= 0) {
					System.out.println("Invalid deposit amount!");
					continue;
				}

				// Add the deposit amount to the balance
				balance += deposit;

				// Store the transaction if array space is available
				if (transactionCount < transactions.length) {

					transactions[transactionCount] = deposit;
					transactionTypes[transactionCount] = "Deposit";

					// Move to the next available array position
					transactionCount++;
				}

				System.out.printf("Deposit successful! Balance: Rs. %.2f%n", balance);
				break;

			case 3:
				System.out.println("Enter Withdrawl amount: Rs.");
				double withdraw = sc.nextDouble();

				if (withdraw <= 0) {
					System.out.println("Invalid Withdrawl amount!");
					continue;
				}

				if (withdraw > balance) {
					System.out.println("Insufficient balance!");
				} else {

					// Subtract the withdrawal amount from balance
					balance -= withdraw;

					// Store the transaction if array space is available
					if (transactionCount < transactions.length) {
						transactions[transactionCount] = withdraw;
						transactionTypes[transactionCount] = "Withdrawal";
						// Increase the transaction counter
						transactionCount++;
					}
					System.out.println("Please collect your cash.");
					System.out.println("Remaining Balance: Rs. " + balance);
				}
				break;

			case 4:
				System.out.println("\n =======Transaction History=======");
				if (transactionCount == 0) {
					System.out.println("No transactions available.");
				} else {
					for (int i = 0; i < transactionCount; i++) {
						System.out.println((i + 1) + ". " + transactionTypes[i] + ": Rs. " + transactions[i]);
					}
				}
				break;

			case 5:
				System.out.println("Enter current Pin: ");
				int currentPin = sc.nextInt();

				if (currentPin == pin) {
					System.out.println("Enter new 4-digit PIN: ");
					int newPin = sc.nextInt();

					if (newPin >= 1000 && newPin <= 9999) {
						pin = newPin;
						System.out.println("Pin changed Successfully!");
					} else {
						System.out.println("Pin must be 4 digits.");
					}
				} else {
					System.out.println("Incorrect Current PIN!");
				}
				break;

			case 6:
				System.out.println("Thank You for using ATM!");
				break;

			default:
				System.out.println("Invalid choice! Please try agian letter.");
			}

		} while (choice != 6);

		sc.close();
	}
}
