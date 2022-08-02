import java.util.Locale;
import java.util.Scanner;

public class Ex06array {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		double[] A = new double[n];
		double[] B = new double[n];
		double[] sum = new double[n];
		
		System.out.println("Digite os valores do vetor A: ");
		for(int i = 0 ; i < A.length ; i++) {
			A[i] = sc.nextDouble();
			sc.nextLine();
		}
		System.out.println("Digite os valores do vetor B: ");
		for(int i = 0 ; i < B.length ; i++) {
			B[i] = sc.nextDouble();
			sc.nextLine();
		}
		System.out.println("VETOR RESULTANTE: ");
		for(int i = 0 ; i < B.length ; i++) {
			sum[i] = A[i] + B[i];
			System.out.printf("%.0f%n", sum[i]);
		}
		sc.close();
	}

}
