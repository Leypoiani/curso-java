package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] arg) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> employee = new ArrayList<>();

		System.out.print("How many employees will be rergistred? ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {

			System.out.println();
			System.out.println("Employee #" + (i + 1) + ": ");
			System.out.print("Id: ");
			Integer id = (sc.nextInt());
			sc.nextLine();
			while (hasId(employee, id)) { // validação para ver se o id ja existe
				System.out.println("Is already taken! Try again: ");
				id = (sc.nextInt());
				sc.nextLine();
			}

			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			sc.nextLine();

			Employee x = new Employee(id, name, salary);
			employee.add(x);
		}

		System.out.println("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		sc.nextLine();

		// Employee x = employee.stream().filter(x -> x.getId() ==
		// idSalary).findFirst().orElse(null);
		// maneira de buscar com instrução de alto nível

		Integer posi = position(employee, idSalary); // utilizando uma classe que procura o elemento no array
		if (posi == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble();
			sc.nextLine();
			employee.get(posi).increaseSalary(percent);
		}

		System.out.println();
		System.out.println("List of employees: ");
		for (Employee x : employee) {
			System.out.print(x);
		}

		sc.close();
	}

	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
