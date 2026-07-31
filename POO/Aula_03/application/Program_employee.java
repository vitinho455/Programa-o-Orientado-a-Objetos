package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Program_employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		List<Employee> list_employee = new ArrayList<>();
	
		System.out.println("How many employees will be registered? ");
		int x = sc.nextInt();
		
		for (int i = 0; i < x; i++) {
			
			System.out.print("Employee: " + i + ": ");
			
			System.out.println();
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			System.out.println();
			
			System.out.print("Name :");
			String name = sc.nextLine();
			
			System.out.println();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			Employee employee = new Employee(id,name,salary);
			
			list_employee.add(employee);
			
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int search_id = sc.nextInt();
		
	}

}