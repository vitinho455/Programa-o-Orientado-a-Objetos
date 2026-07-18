package exercicios_básicos;

import java.util.Scanner;

public class Sum_of_Integer_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int x = 1;
		
		while(x != 0) {
		
			System.out.println("Insira um número: ");
			x = sc.nextInt();
			
			sum += x;
		}
		sc.close();
		System.out.printf("%d", sum);
	}

}
