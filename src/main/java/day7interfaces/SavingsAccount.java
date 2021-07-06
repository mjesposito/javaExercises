package day7interfaces;

public class SavingsAccount implements BankAccount {

	String owner;
	double balance;
	double annualInterestRate;

	SavingsAccount(String nameOnAccount, double amount, double interestRate) {
		this.owner = nameOnAccount;
		this.balance = amount;
		this.annualInterestRate = interestRate;
	}

	@Override
	public void deposit(double amount) {
		if (amount >= 0) {
			this.balance += amount;
		} else {
			System.out.println("Invalid Amount");
		}

	}

	@Override
	public void withdraw(double amount) {
		if (amount > this.balance) {
			System.out.println("Insufficient Funds");
		} else {
			this.balance -= amount;
		}
	}

	public void depositMonthlyInterest() {
		double monthlyInterest = this.balance + this.balance * (this.annualInterestRate / 12);
		this.balance = monthlyInterest;
	}

}
