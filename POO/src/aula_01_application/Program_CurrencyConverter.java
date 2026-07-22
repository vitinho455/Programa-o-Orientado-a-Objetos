package aula_01_application;

import java.util.Scanner;

import aula_01_entities.CurrencyConverter;

public class Program_CurrencyConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				
		System.out.print("What is the dollar price? ");
		double Dollar_Value = sc.nextDouble();
		
		System.out.println();
		
		System.out.print("How many dollars will be bought? ");
		double Dollar_Purchased = sc.nextDouble();
		
		double result = CurrencyConverter.DollarToReal(Dollar_Value, Dollar_Purchased);
		
		System.out.println();
		
		System.out.print("Amount to be paid in reais: " + String.format("%.2f", result));
		
		
	}

}
