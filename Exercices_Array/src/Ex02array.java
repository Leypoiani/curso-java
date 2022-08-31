import java.util.Locale;
import java.util.Scanner;

public class Ex02array {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		double[] array = new double[n];
		double sum = 0, avg = 0;
		for(int i = 0 ; i < array.length ; i++) {
			System.out.print("Digite um numero: ");
			array[i] = sc.nextDouble();
			sum += array[i];
		}
		avg = sum / array.length;
		
		System.out.print("VALORES = ");
		for(int i = 0; i < array.length ; i++) {
			System.out.print(array[i]+"  ");
		}
		System.out.println();
		System.out.printf("SOMA= %.2f%n", sum);
		System.out.printf("MEDIA= %.2f%n", avg);
			
		sc.close();
	}

}
