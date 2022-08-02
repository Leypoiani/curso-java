package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Is there a inicial deposit (y/n)? ");
		char initialDeposit = sc.next().charAt(0);
		
		Account ac;
		if(initialDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDepositValue = sc.nextDouble();
			ac = new Account(accountNumber, holder, initialDepositValue);
			
		}else {
			ac = new Account(accountNumber, holder);
		}
		
		System.out.println("Account data: " );
		System.out.println(ac);
		
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		ac.deposit(deposit);
		System.out.println();
		System.out.println("Update data: " );
		System.out.println(ac);
		
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		ac.withdraw(withdrawValue);
		System.out.println();
		System.out.println("Update data: " );
		System.out.println(ac);
		
		sc.close();
	}

}
