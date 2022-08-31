package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Contribuinte> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		Integer n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Tax payer #" + (i + 1) + " data:");
			System.out.print("Individual or company? (i/c) ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			Double ai = sc.nextDouble();
			switch (ch) {
			case 'i':
				System.out.print("Health expenditures: ");
				Double he = sc.nextDouble();
				list.add(new PessoaFisica(name, ai, he));
				break;
			case 'c':
				System.out.print("Number of employees: ");
				Integer ne = sc.nextInt();
				list.add(new PessoaJuridica(name, ai, ne));
			default:
			}
		}
		System.out.println();
		System.out.println("TAXES PAID: ");
		for (Contribuinte contribuinte : list) {
			System.out.println(contribuinte.getNome() + " $" + String.format("%.2f", contribuinte.imposto()));
		}
		double sum = 0.0;
		for (Contribuinte contribuinte : list) {
			sum += contribuinte.imposto(); 
		}
		System.out.println();
		System.out.printf("TOTAL TAXES: %.2f%n", sum );
	}
}
