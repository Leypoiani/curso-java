package ex1OO;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Rectangle X = new Rectangle();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height: ");
		X.Width = sc.nextDouble();
;		X.Height = sc.nextDouble();

		System.out.println(X);
		
		sc.close();
		
	}

}
