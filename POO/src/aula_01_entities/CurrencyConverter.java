package aula_01_entities;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	public double Dollar_Value,Dollar_Purchased;
	
	public static double DollarToReal(double Dollar_Value, double Dollar_Purchased) {
		
		return Dollar_Value * Dollar_Purchased * (1.0 + IOF);
	}
	
}
