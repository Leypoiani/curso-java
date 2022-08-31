package ex3OO;

public class Student {

	public String name;
	public Double grade1;
	public Double grade2;
	public Double grade3;
	
	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public double missingPoints() {
		return 60.00 - finalGrade(); 
	}
	
	public String situation() {
		if((grade1 + grade2 + grade3) > 60.00) {
			 return "FINAL GRADE = "
					+ String.format("%.2f%n",finalGrade())
					+ "PASS";
		}else
			return  "FINAL GRADE = "
					+ String.format("%.2f%n",finalGrade())
					+ "FAILED \n"
					+ "MISSING "
					+ String.format("%.2f",missingPoints())
					+ " POINTS";
	}
	
}
