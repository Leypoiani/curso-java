package entities;

import java.sql.Date;

public class HourContract {
	
	private Date date;
	private Double valuePerHour;
	private Integer hours;
	
	public HourContract() {
		
	}

	public HourContract(Date date, Double valeuPerHour, Integer hour) {
		this.date = date;
		this.valuePerHour = valeuPerHour;
		this.hours = hour;
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

	public void setHour(Integer hour) {
		this.hours = hour;
	}
	
	public double totalValue() {
		return valuePerHour * hours;
	}
}
