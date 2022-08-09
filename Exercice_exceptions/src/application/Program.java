package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account data: ");
		System.out.print("Number: ");
		Integer numberAccount = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Initial balance: ");
		Double initialBalance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		sc.nextLine();
		Double withdrawLimit = sc.nextDouble();
		
		Account account = new Account(numberAccount, name, initialBalance, withdrawLimit);
		
		try {
		System.out.print("Enter amount for withdraw: ");
		account.withdraw(sc.nextDouble());
		}
		catch(DomainException e) {
			System.out.print("Withdrawal error: " + e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected error!");
		}
		
	}

}
