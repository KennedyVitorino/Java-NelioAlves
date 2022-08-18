package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Employee;

public class Program {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {

			Locale.setDefault(Locale.US);

			Employee employee = new Employee();

			System.out.print("Name: ");
			employee.name = sc.nextLine();
			System.out.print("Gross salary:");
			employee.grossSalary = sc.nextDouble();
			System.out.print("Tax: ");
			employee.tax = sc.nextDouble();

			System.out.println();
			System.out.println("Employee: " + employee);
			System.out.println();
			System.out.println("Which percentage to increase salary? ");
			double percentage = sc.nextDouble();
			employee.increaseSalary(percentage);

			System.out.println();
			System.out.println("Updated data: " + employee);

		} 
	}
}
