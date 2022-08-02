package ex3OO;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student x = new Student();
		
		System.out.println("Enter of the three notes for known the situation.");
		x.name = sc.nextLine();
		x.grade1 = sc.nextDouble();
		x.grade2 = sc.nextDouble();
		x.grade3 = sc.nextDouble();
		
		System.out.println(x.situation());
		
		sc.close();
	}

}
