package entities;

public class OutsourcedEmployee extends Employee{
	
	protected Double additionalCharge;
	
	public OutsourcedEmployee() {
		super();
	}
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	public Double payment() {
		return  (double) (hours * valuePerHour) + additionalCharge;
	}
	
}
