package com.zensar;

class Account {
	private int accountNumber;
	private String accountHolderName;
	private double accountBalance;

	public Account(int accountNumber, String accountHolderName, double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}

	public double getAccountBalance() {
		return this.accountBalance;
	}

}

class Saving extends Account {
	private double fixedDeposit;

	public Saving(int accountNumber, String accountHolderName, double accountBalance, double fixedDeposit) {
		super(accountNumber, accountHolderName, accountBalance);
		this.fixedDeposit=fixedDeposit;
	}

	public double getAccountBalance() {
		return super.getAccountBalance() + this.fixedDeposit;
	}
}

class Current extends Account {
	private double cashCredit;

	public Current(int accountNumber, String accountHolderName, double accountBalance, double cashCredit) {
		super(accountNumber, accountHolderName, accountBalance);
		this.cashCredit=cashCredit;
	}

	public double getAccountBalance() {
		return super.getAccountBalance() + this.cashCredit;
	}

}

public class AccountTest {

	public static void main(String[] args) {
		Account account[] = new Account[2];
		account[0] = new Saving(1234,"minne",25000.0,5000.0);
		account[1] = new Current(4567,"jack",20000.0,4000.0);
		double getAccountBalance = getAccountBalance(account);  
		System.out.println("totalAccountBalanceOfBank = " + getAccountBalance);
	}
		public static double getAccountBalance(Account[] a) {
			double getAccountBalance = 0.0;
			for(int i=0;i<a.length;i++) {
				getAccountBalance = getAccountBalance + a[i].getAccountBalance();
			}
			return getAccountBalance;
	}

}
