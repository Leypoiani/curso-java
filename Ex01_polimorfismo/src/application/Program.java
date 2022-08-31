package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		Integer n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Product #" + (i + 1) + " data: ");
			System.out.print("Common, used or imported? (c/u/i) ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			sc.nextLine();
			Double price = sc.nextDouble();

			switch (type) {
			case 'c':
				Product p = new Product(name, price);
				list.add(p);
				break;
			case 'u':
				System.out.print("Manufacture date: ");
				Date md = sdf.parse(sc.next());
				Product pu = new UsedProduct(name, price, md);
				list.add(pu);
				break;
			case 'i':
				System.out.print("Customs fee: ");
				Double cf = sc.nextDouble();
				Product pi = new ImportedProduct(name, price, cf);
				list.add(pi);
			default:
			}
		}
		System.out.println("PRICE TAGS: ");
		for (Product product : list) {
			System.out.println(product.priceTag());
		}
	}
}
