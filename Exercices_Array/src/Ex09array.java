import java.util.Locale;
import java.util.Scanner;

public class Ex09array {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		String oldder = " ";
		int aux=0;
		
		for (int i = 0; i < nome.length ; i++) {
			System.out.println("Dados da "+ (i+1) + "a pessoa: ");
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			sc.nextLine();
			
			if(idade[i] > aux) {
				aux = idade[i];
				oldder = nome[i];
			}
			
		}
		System.out.println("PESSOA MAIS VELHA: " + oldder);
		sc.close();
	}

}
