package application;

import java.util.Scanner;

public class VerificarSenha {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final String senha = "123ABC";
		
		System.out.println("Exercício para verificação de senha.");
		System.out.println();

		int i = 0;
		do {
			System.out.print("Entre com a senha: ");
			String s = sc.next();
			
			if (s.equals(senha)) {
				System.out.println("Acesso permitido.");
				i++;
			} else {
				System.out.println("Acesso negado | Tente novamente.");
				System.out.println();
			}
		}while (i == 0);
		sc.close();
	}
}
