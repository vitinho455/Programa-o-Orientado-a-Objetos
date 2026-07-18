package exercicios_básicos;

import java.util.Scanner;

public class Day_Of_The_Week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Dias da semana:%n%n1 - Domingo%n2 - Segunda%n3 - Terça%n4 - Quarta%n5 - Quinta%n6 - Sexta%n7 - Sábado%n%n");
		
		System.out.println("Insira um valor de 1 a 7 para representar o dia da semana: ");
		int dia = sc.nextInt();
		
		switch (dia) {
		case 1:
			
			System.out.println("Dia da semana: Domingo");
			break;
		
		case 2:
			
			System.out.println("Dia da semana: Segunda");
			break;
		
		case 3:
			
			System.out.println("Dia da semana: Terça");
			break;
		
		case 4:
			
			System.out.println("Dia da semana: Quarta");
			break;
		
		case 5:
			
			System.out.println("Dia da semana: Quinta");
			break;
		
		case 6:
			
			System.out.println("Dia da semana: Sexta");
			break;
		
		case 7:
			
			System.out.println("Dia da semana: Sábado");
			break;

		default:
			
			System.out.println("Dia da semana: Valor inválido");
			break;
		}
		sc.close();
	}

}
