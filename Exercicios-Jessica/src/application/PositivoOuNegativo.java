package application;

import java.util.Scanner;

public class PositivoOuNegativo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Digite um número qualquer para verificar se ele é positivo "
				+ "ou negativo.");
		System.out.println("Digite (zero) para encerrar a aplicação.");
		
		int n = 0;
		 do {
			n = sc.nextInt();
			if (n < 0) {
				System.out.println("Número negativo.");
			} else if (n > 0) {
				System.out.println("Número positivo.");
			}

		} while (n != 0);
		 System.out.println("Aplicação encerrada.");
		 sc.close();
	}
}
