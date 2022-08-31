package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.emums.Color;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		// pode criar variavel de tipo abstrato, depois acontece upcasting quando você insere
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Shape #"+ (i+1) + " data: ");
			System.out.print("Rectangle or Circle? (r/c)" );
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			switch (ch) {
			case 'r': 
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add (new Rectangle(color, width, height));
				break;
			case 'c':
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
				break;
			default:	
			}
			
		}
		System.out.println("Shape areas: ");
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		sc.close();
	}

}
