package application;

import java.util.Scanner;

import entities.Student;

public class Program_student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Student[] student = new Student[10];
		System.out.println();
		
		System.out.print("How many rooms will be rented?");
		int x = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= x; i++) {
				
			System.out.println("Rent #" + i);
						
			System.out.print("Name: ");
			String name = sc.nextLine();
						
			System.out.print("Email: ");
			String email = sc.nextLine();
					
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println();

			student[room] = new Student(name,email);
			
		}
		
		System.out.println("Busy Rooms: ");
		
		for (int i = 0; i < 10 ; i++) {
			if(student[i] != null) {
				System.out.println(i + ": " + student[i]);	
			}

			sc.close();
			
		}
	}

}
