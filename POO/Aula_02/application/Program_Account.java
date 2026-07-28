package application;

import java.util.Scanner;

import entities.Account;

public class Program_Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Account account1;
		
		System.out.print("Enter account number: ");
		int account = sc.nextInt();
		sc.nextLine();
		
		System.out.println();

		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();

		System.out.println();		
		
		System.out.print("Is there na initial deposit? (y/n): ");
		char decision_initial_deposit = sc.next().charAt(0);
		System.out.println();
		
		if(decision_initial_deposit == 'y') {
			
			System.out.println("Enter initial deposit value: ");
			double initial_deposit = sc.nextDouble();
			account1 = new Account (account, holder,initial_deposit);
			System.out.println("Account Data: " + account1);
			System.out.println();
		}else {
			account1 = new Account (account,holder,0);
			System.out.println("Account Data: " + account1);
			
			System.out.println();
		}
		
		System.out.println("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		account1.deposit(deposit);
		
		System.out.println();
		
		System.out.println("Updated account data: " + account1);
		
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account1.withDraw(withdraw);
		
		System.out.println();
		
		System.out.println("Updated account data: " + account1);
		
		}
	}


