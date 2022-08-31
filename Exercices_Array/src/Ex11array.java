import java.util.Locale;
import java.util.Scanner;

public class Ex11array {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		double[] altura = new double[n];
		String[] genero = new String[n];
		double menor=10, maior=0, soma=0, media=0;
		int cont=0, homens=0;
		
		for(int i = 0; i < n ; i++) {
			System.out.print("Altura da "+(i+1)+"ª pessoa: ");
			altura[i] = sc.nextDouble();
			sc.nextLine();
			System.out.print("Genero da "+(i+1)+"ª pessoa: ");
			genero[i] = sc.nextLine();
			if(altura[i] > maior) {
				maior = altura[i];
			}else if(altura[i]< menor) {
				menor = altura[i];
			}
			if(genero[i].equals("F")) {
				soma += altura[i];
				cont++;
			}else {
				homens++;
				
			}
		}
		media = soma/cont;
		System.out.println("Menor altura: " + menor);
		System.out.println("Maior altura: " + maior);
		System.out.printf("Media das altuas das mulheres: %.2f%n", media);
		System.out.println("Número de homens: "+ homens);
		sc.close();
	}

}
