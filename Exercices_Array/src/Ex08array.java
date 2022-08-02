import java.util.Locale;
import java.util.Scanner;

public class Ex08array {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		double[] array = new double [n];
		double[] pares = new double [n];
		int count = 0;
		double sum=0;
		for(int i = 0 ; i < array.length ; i++) {
			System.out.print("Digite um numero: ");
			array[i] = sc.nextDouble();
			sc.nextLine();
			if(array[i] % 2 == 0) {
				count++;
				pares[i] = array[i];
				sum += pares[i];
			}
		}
		
		double avg = sum / count;
		
		if(avg > 0) {
		System.out.printf("MEDIA DOS PARES: %.1f%n", avg);
		}else {
			System.out.println("NENHUM NUMERO PAR");
		}
		sc.close();
	}

}
