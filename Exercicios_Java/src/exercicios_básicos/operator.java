package exercicios_básicos;

import java.util.Scanner;

public class operator {
	
	/*
	Uma operadora de telefonia cobra R$ 50.00 por um plano básico que
dá direito a 100 minutos de telefone. Cada minuto que exceder a
franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
quantidade de minutos que uma pessoa consumiu, daí mostrar o valor
a ser pago.
	
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double plan_Basic_Value = 50.00;
		int plan_Basic_Minutes = 100;
		double total = plan_Basic_Value;
		
		System.out.println("Insira a quantidade de minutos consumido: ");
		int quantity_Consumed = sc.nextInt();
		
		if(quantity_Consumed > plan_Basic_Minutes) {
			
			total += (quantity_Consumed - plan_Basic_Minutes) * 2.00;
			
			System.out.printf("Valor a pagar: %.2f", total);
			
		} else {
			
			System.out.printf("Valor a pagar: %.2f", total);
			
		}
		
		sc.close();
	}

}
