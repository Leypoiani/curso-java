import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int cod1, qtd1, cod2, qtd2;
		double preco1, preco2, pay;
		
		cod1 = sc.nextInt();
		qtd1 = sc.nextInt();
		preco1 = sc.nextDouble();
		cod2 = sc.nextInt();
		qtd2 = sc.nextInt();
		preco2 = sc.nextDouble();
		pay = (preco1 * qtd1) + (preco2 * qtd2);
				
		System.out.printf("VALOR A PAGAR: %.2f%n", pay);
	}

}
