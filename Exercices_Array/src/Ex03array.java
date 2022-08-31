import java.util.Locale;
import java.util.Scanner;

public class Ex03array {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		String[] menores = new String[n];
		double sum = 0, avg = 0, aux = 0, perc = 0;
		
		for(int i = 0 ; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("NOME: ");
			nome[i] = sc.next();
			System.out.print("IDADE: ");
			idade[i] = sc.nextInt();
			sc.nextLine();
			System.out.print("ALTURA: ");
			altura[i] = sc.nextDouble();
			sc.nextLine();
			
			sum += altura[i];
			
			if(idade[i] < 16) {
				aux++;
				menores[i] = nome[i];
			}
		}
		avg = sum/n;
		perc = (aux/n)*100;
		System.out.printf("Altura media: %.2f%n", avg);
		System.out.printf("Pessoas com mais de 16 anos: %.1f%%%n", perc);
		for(int i=0; i < menores.length ; i++) {
			if(menores[i] != null) {
				System.out.println(menores[i]);
			}
		}
		sc.close();
	}

}
