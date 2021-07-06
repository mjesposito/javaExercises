package day7interfaces;

public class CheckingAccount implements BankAccount {
	String owner;
	double balance;
	double insufficientFundsFee = 50;

	CheckingAccount(String nameOnAccount, double amount) {
		this.owner = nameOnAccount;
		this.balance = amount;
	}

	@Override
	public void deposit(double amount) {
		if (amount >= 0) {
			balance += amount;
		} else {
			System.out.println("Invalid Amount");
		}

	}

	@Override
	public void withdraw(double amount) {
		if (amount > this.balance) {
			System.out.println("Insufficient Funds");
			System.out.println("$50 Fee taken from account");
			this.balance -= this.insufficientFundsFee;
		} else {
			this.balance -= amount;
		}

	}

	public void processCheck(double checkAmount) {
		this.deposit(checkAmount);
	}

}
