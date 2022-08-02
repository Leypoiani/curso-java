import java.util.Locale;
import java.util.Scanner;

public class Ex10array {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos alunos serão digitados?");
		int n = sc.nextInt();
		sc.nextLine();
		double[] n1 = new double[n];
		double[] n2 = new double[n];
		String[] nome = new String[n];
		String[] aprovados = new String[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite o nome, primeira e segunda nota do " + (i+1) + "º aluno: ");
			nome[i] = sc.nextLine();
			n1[i] = sc.nextDouble();
			sc.nextLine();
			n2[i] = sc.nextDouble();
			sc.nextLine();
			
			if((n1[i] + n2[i]) / 2 >= 6) {
				aprovados[i] = nome[i];
			}
		}
		for(int i = 0 ; i< aprovados.length ; i++) {
			if(aprovados[i] != null) {
			System.out.println(aprovados[i]);
			}
		}
		sc.close();
	}

}
