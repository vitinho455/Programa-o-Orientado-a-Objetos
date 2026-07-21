package aula_01_entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	/*
	public Product(String name, Double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	*/
	
	public Double TotalValueInStock() {
		return quantity * price;
	}
	
	public void AddProduct(int quantity) {
		this.quantity += quantity;
	}
	
	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString(){
		
		return name + ", $ " 
		+ String.format("%.2f", price) 
		+ quantity 
		+ " units, Total: $ " 
		+ String.format("%.2f", TotalValueInStock());
		
	}
	
	
}
