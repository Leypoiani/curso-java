package entities;

import java.util.List;

public class Employee {

	private String name;
	private Double salary;
	private Integer id;
	
	public Employee(Integer id, String name, double salary) {
		this.name = name;
		this.salary = salary;
		this.id = id;
	}
	
	public Employee() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void increaseSalary(double percent){
		salary += (salary * percent / 100.0);
	}
	
	private static boolean hasId(List<Employee> employee, Integer id) {
		
		return false;
	}
	
@Override
	public String toString() {
		return id 
				+ ", " 
				+ name 
				+ ", " 
				+ String.format("%.2f%n", salary);
	}
	
	
	
}
