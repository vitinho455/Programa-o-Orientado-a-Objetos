package aula_02_application;

import java.util.Scanner;

import aula_02_entities.Account;

public class Program_Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int account = sc.nextInt();
		
		System.out.println();

		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();

		sc.nextLine();
		System.out.println();		
		
		System.out.print("Is there na initial deposit? (y/n): ");
		char decision_initial_deposit = sc.next().charAt(0);
		
		System.out.println();
		
		if(decision_initial_deposit != 'y') {
			
			Account account1 = new Account(account,holder,0);
			
			System.out.print("Account Data: " + account1);
			
			System.out.println();
			
			System.out.print("Enter a deposit value: ");
			double deposit = sc.nextDouble();
			account1.deposit(deposit);
			
			System.out.println();
			
			System.out.print("Update Data: " + account1);
			
			System.out.println();
			
			System.out.print("Enter a whithdraw value: ");
			double whithdraw = sc.nextDouble();
			account1.withDraw(whithdraw);
			
			System.out.println();
			
			System.out.print("Update Data: " + account1);
			
			
		} else {
			
			System.out.print("Enter initial deposit value: ");
			double initial_deposit = sc.nextDouble();
			
			System.out.println();
			
			Account account1 = new Account(account,holder,initial_deposit);
			
			System.out.print("Account Data: " + account1);
			
			System.out.println();
			
			System.out.print("Enter a deposit value: ");
			double deposit = sc.nextDouble();
			account1.deposit(deposit);
			
			System.out.println();
			
			System.out.print("Update Data: " + account1);
			
			System.out.println();
			
			System.out.print("Enter a whithdraw value: ");
			double whithdraw = sc.nextDouble();
			account1.withDraw(whithdraw);
			
			System.out.println();
			
			System.out.print("Update Data: " + account1);
		}
		sc.close();
	}

}
