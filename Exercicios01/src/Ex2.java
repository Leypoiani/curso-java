import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double area, raio;
		final double pi = 3.14159;
		System.out.println("Digite o valor do raio.");
		raio = sc.nextInt();
		
		area = pi * (Math.pow(raio, 2));
		
		System.out.printf("A = %.4f%n", area);
		
		sc.close();
		
	}

}
