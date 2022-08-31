import java.util.Locale;
import java.util.Scanner;

public class Ex07array {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		double[] array = new double[n];
		double sum=0, avg=0;
		double[] e = new double[n];
				
		for(int i = 0; i < array.length ; i++ ) {
			System.out.print("Digite um numero: ");
			array[i] = sc.nextDouble();
			sc.nextLine();
			sum += array[i];
		}
		avg = sum/n;
		for(int i = 0; i < array.length ; i++) {
			if(array[i] < avg) {
				e[i] = array[i];
			}
		}
		System.out.printf("MEDIA DO VETOR: %.3f%n", avg);
		System.out.println("ELEMNETOS ABAIXO DA MEDIA: ");
		for(int i = 0; i < e.length ; i++) {
			if(e[i] != 0) {
				System.out.printf("%.1f%n", e[i]);
			}
		}
		sc.close();
	}

}
