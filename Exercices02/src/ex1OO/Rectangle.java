package ex1OO;

public class Rectangle {

	public Double Width;
	public Double Height;
	
	public double area() {
		return Width * Height; 
	}
	
	public double perimeter() {
		return 2 * (Width + Height);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(Width, 2)+ Math.pow(Height, 2));
	}
	
	public String toString() {
		return "AREA = "
				+ String.format("%.2f%n", area())
				+ "PERIMETER = "
				+ String.format("%.2f%n", perimeter())
				+ "DIAGONAL = "
				+ String.format("%.2f%n", diagonal());
	}
}
