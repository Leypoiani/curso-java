import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 
		
		  //entrada de dados
		Scanner sc = new Scanner (System.in);
		
		String s1, s2, s3;
		
		
		sc.nextLine(); //quebra de linha pendente 
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		 
		sc.close();
		
	}

}
