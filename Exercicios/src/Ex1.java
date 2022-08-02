import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int n1, n2;
		
		System.out.println("Digite dois n[umeros para serem somados.");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		int soma = n1 + n2;
		
		System.out.println("Soma = "+ soma);
		
	}

}
