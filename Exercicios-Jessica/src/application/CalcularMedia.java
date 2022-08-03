package application;
import java.util.Locale;
import java.util.Scanner;

public class CalcularMedia {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Exercício de calculo de média: ");
		System.out.println();
		System.out.print("Quantas notas você vai digitar? ");
		int n = sc.nextInt();
		double soma = 0;
		System.out.print("Entre com o nome do aluno: ");
		sc.nextLine();
		String nome = sc.nextLine();
		for(int i = 0 ; i <  n; i++) {
			System.out.print("Entre com a " + (i+1) + "ª nota: ");
			soma += sc.nextDouble();
		 }
		double media = soma /n;
		 
		sc.close();
		System.out.println("Aluno: " + nome + " - Média: "+ media);
		}
		
}
