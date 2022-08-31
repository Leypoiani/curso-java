import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int  qtd1, qtd2;
		double preco1, preco2, pay;
		
		
		qtd1 = sc.nextInt();
		preco1 = sc.nextDouble();
		
		qtd2 = sc.nextInt();
		preco2 = sc.nextDouble();
		pay = (preco1 * qtd1) + (preco2 * qtd2);
				
		System.out.printf("VALOR A PAGAR: %.2f%n", pay);
		
		sc.close();
	}

}
