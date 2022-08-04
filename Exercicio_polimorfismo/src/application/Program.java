package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> listEmployee = new ArrayList<>();
		
		
		System.out.print("Enter the number of employees: ");
		Integer n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
					System.out.println("Employee #" + (i + 1) + " data: ");
					System.out.print("Outsourced? (y/n):");
					char out = sc.next().charAt(0);
					System.out.print("Name: ");
					sc.nextLine();
					String name = sc.nextLine();
					System.out.print("Hours: ");
					Integer hours = sc.nextInt();
					System.out.print("Value per hour: ");
					Double valuePerhours = sc.nextDouble();
					if(out == 'y') {
						System.out.print("Aditional charge: ");
						Double ac = sc.nextDouble();
						listEmployee.add(new OutsourcedEmployee(name, hours, valuePerhours, ac));
						
					}
					else {
						listEmployee.add(new Employee(name, hours, valuePerhours));
					}
				}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Employee employee : listEmployee) {
			System.out.println(employee.getName() + " - $" + String.format("%.2f", employee.payment()));
		}
		
		sc.close();
		
	}

}
