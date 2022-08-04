package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String cName = sc.nextLine();
		System.out.print("E-mail: ");
		String cEmail = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date bDate = sdf.parse(sc.next());
		
		Client client = new Client(cName, cEmail, bDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.print("How many items to this order? ");
		int orderQuantity = sc.nextInt();
		for(int i = 1 ; i <= orderQuantity ; i++) {
			sc.nextLine();
			System.out.println("Enter #"+i+" item data:");
			System.out.print("Product name: ");
			String pName = sc.nextLine();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			sc.nextLine();
			int quantity = sc.nextInt();
			
			Product product = new Product(pName, price);
			
			OrderItem oi = new OrderItem(quantity, price, product);
			
			order.addItem(oi);
		}
		sc.close();
		System.out.println();
		System.out.println(order);
		
		
		
	}

}
