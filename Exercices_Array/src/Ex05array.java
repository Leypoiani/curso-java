import java.util.Locale;
import java.util.Scanner;

public class Ex05array {
	
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
				
		double[] array = new double[n];
		double maior=0;
		int posicao=0;
		
		for(int i = 0 ; i < array.length ; i++) {
			System.out.print("Digite um numero: ");
			array[i] = sc.nextDouble();
			if(array[i] > maior) {
				maior = array[i];
				posicao = i;
			}
		}
		System.out.printf("MAIOR VALOR: %.1f%n", maior);
		System.out.println("POSICAO DO MAIOR VALOR: " + posicao);
		
		sc.close();
	}

}
