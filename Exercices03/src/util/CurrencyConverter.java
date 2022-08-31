package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double conversion(double dollarPrice, double bought) {
		return dollarPrice * bought + (IOF * (dollarPrice * bought));
	}
	
	

}
