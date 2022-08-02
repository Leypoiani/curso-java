import java.util.Locale;
import java.util.Scanner;

public class Ex01array {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o numero de elementos: ");
		int n = sc.nextInt();

		while (n > 10) {
			System.out.println("Numero maximo de elementos permitido = 10");
			System.out.println("Digite novamente: ");
			n = sc.nextInt();
		}
		double[] array = new double[n];
		double[] show = new double[n];
		int x = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("Digite o valor do elemento: ");
			sc.nextLine();
			array[i] = sc.nextDouble();
			if (array[i] < 0) {
				show[x] = array[i];
				x++;
			}
		}
		if (show.length > 0 && (show[0] != 0)) {
			System.out.println("Numero negativos: ");
			for (int i = 0; i < show.length; i++) {
				if (show[i] != 0) {
					System.out.println(show[i]);
				}
			}
		} else {
			System.out.println("Voce nao digitou numeros negativos! ");
		}
		sc.close();
	}
}