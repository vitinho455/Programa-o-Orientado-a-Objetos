package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program_Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list_employee = new ArrayList<>();
	
		System.out.print("How many employees will be registered? ");
		int x = sc.nextInt();
		
		for (int i = 0; i < x; i++) {
			
			System.out.println("Employee #" + (i + 1) + ": ");
						
			System.out.print("Id:");
			int id = sc.nextInt();

			sc.nextLine();
			
			System.out.print("Name:");
			String name = sc.nextLine();
			
			
			System.out.print("Salary:");
			double salary = sc.nextDouble();
			
			Employee employee = new Employee(id,name,salary);
			
			list_employee.add(employee);
			
		}
		
		System.out.print("Enter the employee id that will have salary increase :");
		int search_id = sc.nextInt();
		
		boolean found = false;
		
		for (Employee employee : list_employee) {
			
			if(employee.getId() == search_id) {
				
				System.out.println("Enter the percentage: ");
				double percentage = sc.nextDouble();
				employee.increaseSalary(percentage);				
				found = true;
				break;			
			} 
			
		}
		
		if(!found) {
			
			System.out.println("This id does not exist!");
		}
				
		for (Employee employee : list_employee) {
		
			System.out.println(employee);
		}
		

		sc.close();
	}

}