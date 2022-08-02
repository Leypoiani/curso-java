package entities;

public class Account {

	private int accountNumber;
	private String holder;
	private double balance;
	private final double tax = 5.00;
	
	public Account(int acountNumber, String holder) {
		this.accountNumber = acountNumber;
		this.holder = holder;
	}

	public Account(int accountNumber, String holder, double initialDeposit) {
		super();
		this.accountNumber = accountNumber;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public double getBalance() {
		return balance;
	}

	public int getAcountNumber() {
		return accountNumber;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public void deposit(double value) {
		balance += value;
		
	}
	
	public void withdraw(double value) {
		balance -= (value + tax);
		
	}
	
	public String toString() {
		return "Account " 
				+ accountNumber
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f%n", balance);
	}
	
	
}
