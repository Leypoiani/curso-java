package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
	
	public static void main(String[] args) {
		
		
		List <Account> list = new ArrayList<>();
		Account acc2 = new BusinessAccount(1001, "Bob", 0.0, 500.00);
		list.add(acc2);
		list.add(new SavingsAccount(1002, "Ana", 100.0, 0.01));
		list.add(new SavingsAccount(1003, "Pedro", 500.0, 0.01));
		list.add(new BusinessAccount(1004, "Bruno", 1000.0, 300.00));
		
		double sum = 0.0;
		
		for (Account account : list) {
			sum+= account.getBalance();
		}
		System.out.printf("Total balance: %.2f%n", sum); // soma do saldo de todas as contas antes de depositar
		
		for (Account account : list) {
			account.deposit(10); // depoitei 10 em cada conta
			System.out.printf("Update balance for account %d %.2f%n", account.getNumber(), account.getBalance());
		}
		
	}

}
