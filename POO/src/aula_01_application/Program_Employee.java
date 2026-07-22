package aula_01_application;

import java.util.Scanner;

import aula_01_entities.Employee;

public class Program_Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		
		System.out.println();
		
		System.out.print("Gross salary: ");
		employee.GrossSalary = sc.nextDouble();
		
		System.out.println();
		
		System.out.print("Tax: ");
		employee.Tax  = sc.nextDouble();
		
		employee.NetSalary();
		
		System.out.println();
		
		System.out.print("Employee: " + employee);
		
		System.out.println();
		
		System.out.print("Which percentage to increase salary?: ");
		double percentage = sc.nextDouble();
		
		System.out.println();
		
		employee.IncreaseSalary(percentage);
		
		
		System.out.print("Update data: " + employee);
		
	}

}
