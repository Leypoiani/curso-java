package application;

import java.util.Scanner;

public class VerificarSenha {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Exercício para verificação de senha.");
		System.out.println();
		
		System.out.print("Entre com a senha: ");
		String s = sc.next();
		
		while (s.equals("123ABC")) {
			System.out.println("Acesso negado | Tente novamente.");
			System.out.println();
			System.out.print("Entre com a senha: ");
			s = sc.nextLine();
		}
		System.out.println("Acesso permitido.");
		sc.close();
	}
}
