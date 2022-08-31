import java.util.Locale;
import java.util.Scanner;

public class Ex04array {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
				
		double[] array = new double[n];
		double[] pares = new double[n];
		int count=0;
		
		for(int i = 0; i < array.length ; i++) {
			System.out.print("Digite um numero: ");
			array[i] = sc.nextDouble();
			sc.nextLine();
			if(array[i] % 2 == 0) {
				pares[i] = array[i];
				count++;
			}
		}
		System.out.println("NUMEROS PARES: ");
		for(int i = 0; i < pares.length ; i++) {
			if(pares[i] != 0) {
				System.out.print(pares[i] + "  ");
			}
		}
		System.out.println();
		System.out.println("QUANTIDADE DE PARES	: "+ count);
				
		sc.close();
		
	}

}
