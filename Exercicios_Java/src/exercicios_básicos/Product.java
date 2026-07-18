package exercicios_básicos;

public class Product {

	/*
	Programa para teste de utilização da saida de dados utilizando o printf e os placehoulders
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30; 
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Product: ");
		System.out.printf("%s, wich price is $ %.2f", product1,price1);
		System.out.println();
		System.out.printf("%s, wich price is $ %.2f", product2,price2);
		System.out.println();
		System.out.println();
		System.out.print("Record: ");
		System.out.printf("%d years old, code %d and gender: %s", age, code, gender);
		System.out.println();
		System.out.printf("Measue with eight decimal places: % .8f", measure);
		System.out.println();
		System.out.printf("Rouded (three decimal places): %.3f", measure);
		System.out.println();
		System.out.printf("US decimal point: %.3f", measure);
	}

}
