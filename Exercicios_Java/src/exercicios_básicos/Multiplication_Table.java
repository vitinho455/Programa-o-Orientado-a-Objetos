package exercicios_básicos;

import java.util.Scanner;

public class Multiplication_Table {
	
	/*
	 * Exibição de tabuada usando o laço for
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o número para saber a tabuada: ");
		int x = sc.nextInt();
		
		for(int y = 1; y <= 10; y++) {
			
			System.out.printf("%d x %d = %d %n",x,y, (x*y));
		}
			sc.close();
	}

}
