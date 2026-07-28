package application;

import java.util.Scanner;

import entities.Student;

public class Program_student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("How many rooms will be rented?");
		int x = sc.nextInt();
		sc.nextLine();
		
		Student[] student = new Student[x];
		System.out.println();
		
		for (int i = 0; i < student.length; i++) {
				
			System.out.println("Rent #" + (i + 1));
						
			System.out.print("Name: ");
			String name = sc.nextLine();
						
			System.out.print("Email: ");
			String email = sc.nextLine();
					
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println();

			student[i] = new Student(name,email,room);
			
		}
		sc.close();
		
		System.out.println("Busy Rooms: ");
		
		for (Student student2 : student) {
			System.out.println(student2);
		}
		
	}

}
