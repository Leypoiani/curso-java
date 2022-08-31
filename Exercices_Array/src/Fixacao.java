import java.util.Locale;
import java.util.Scanner;

public class Fixacao {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many room will be rented? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Rent[] rooms = new Rent[10];
		
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Rent# " + i + ": ");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.next();
			System.out.println("Room: ");
			int roomNumber = sc.nextInt();
			sc.nextLine();
			
			Rent rent = new Rent(name, email); // instanciação
			rooms[roomNumber] = rent; // atribuição do objeto à posição solicitada 
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i = 0; i < 10; i++) {
			if(rooms[i] != null) {
				System.out.println(i + ": " + rooms[i]);
			}
			sc.close();
		}
	}

}
