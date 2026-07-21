package aula_01_application;

import java.util.Scanner;

import aula_01_entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		Double price = sc.nextDouble();
		
		System.out.print("Quantity in Stock: ");
		int quantityStock = sc.nextInt();
		
		System.out.println("Product data: " + product);
		
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		int addQuantity = sc.nextInt();
		
		product.AddProduct(addQuantity);
		
		System.out.printf("Update data: "+ product);
	
		System.out.println();
		
		System.out.println("Enter the number of products to be remove from stock: ");
		int removeQuantity = sc.nextInt();
		
		product.RemoveProducts(removeQuantity);
		
		System.out.println("Update data: " + product);

		sc.close();
	}

}
