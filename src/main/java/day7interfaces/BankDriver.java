package day7interfaces;

public class BankDriver {

	public static void main(String[] args) {
		CheckingAccount checking = new CheckingAccount("Jess", 392);
		SavingsAccount savings = new SavingsAccount("Jess", 392, .06);

		BankAccount checking1 = new CheckingAccount("Harry", 1400);

		// checking1.processCheck error: BankAccount doesn't have method

		System.out.println("Checking: " + checking.balance);
		checking.processCheck(200);
		System.out.println("Checking: " + checking.balance);

		System.out.println("Savings: " + savings.balance);
		savings.depositMonthlyInterest();
		System.out.println("Savings: " + savings.balance);
	}

}
