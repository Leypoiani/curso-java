package application;

import entities.Account;
import entities.SavingsAccount;

public class Program3 {

	public static void main(String[] args) {
		
		Account x = new Account(1020, "Alex", 1000.00);
		Account y = new SavingsAccount(1023, "Ana", 1000.00, 0.01);

		x.withdraw(100);
		y.withdraw(100);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}

}
