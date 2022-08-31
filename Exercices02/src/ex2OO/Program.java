package ex2OO;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee X = new Employee();
		System.out.println("Enter the employee data: ");
		X.name = sc.nextLine();
		X.grossSalary = sc.nextDouble();
		X.tax = sc.nextDouble();
		
		System.out.println("Employee: "+ X);
		
		System.out.println("Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		X.increaseSalary(percentage);
		
		System.out.println("Update data: "+ X);
		
		sc.close();
		
	}

}
