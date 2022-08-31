package entities;

import java.util.Date;

public class HourContract {
	
	private Date date;
	private Double valuePerHour;
	private Integer hours;
	
	public HourContract() {
		
	}

	public HourContract(Date date, Double valeuPerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valeuPerHour;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValeuPerHour() {
		return valuePerHour;
	}

	public void setValeuPerHour(Double valeuPerHour) {
		this.valuePerHour = valeuPerHour;
	}

	public Integer getHour() {
		return hours;
	}

	public void setHour(Integer hours) {
		this.hours = hours;
	}
	
	public double totalValue() {
		return valuePerHour * hours;
	}
}
