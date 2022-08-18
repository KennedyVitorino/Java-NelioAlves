package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
	
		try(Scanner sc = new Scanner(System.in)) {

			Locale.setDefault(Locale.US);
			
			// Leitura dos dados da classe Product
			Product product = new Product();
			System.out.println("Enter product data: ");
			System.out.print("Name: ");
			product.name = sc.nextLine();
			System.out.print("Price: U$ "); 
			product.price = sc.nextDouble();
			System.out.println("quantity in stock: ");
			product.quantity = sc.nextInt();

			// Print provisório para verificar se o programa está rodando
			System.out.println();
			
			// Adicionando produtos ao stock
			System.out.print("Enter the numter of produtcs to be added in stock: ");
			int quantity = sc.nextInt();
			product.addProducts(quantity); // att da quantidade dentro do obj product
			
			System.out.println();
			System.out.println("Update data: " + product);
			
			// Removendo produtos do stock 
			System.err.println();
			System.out.print("Enter the numter of produtcs to be removed from stock: ");
			quantity = sc.nextInt();
			product.removeProducts(quantity);
			
			System.out.println();
			System.out.println("Update data: " + product);


		}
	}
}
