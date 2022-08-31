package project;
import java.util.Scanner;

public class Class {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean ok = true;
		
		while(ok){
			System.out.print("Digite uma senha: ");
			
			if(scan.next().equals("123ABC")) {				
				ok = false;
				System.out.println("Acesso permitido");
			}else
				System.out.println("Acesso negado. Tente novamente!");
			
		}
		scan.close();
	}
}


