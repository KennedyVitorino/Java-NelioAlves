package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)) {

            Locale.setDefault(Locale.US);

            int n = sc.nextInt();
            Product[] vector = new Product[n];

            for (int i = 0; i < vector.length; i++) {
                sc.nextLine();
                String name = sc.nextLine();
                double price = sc.nextDouble();
                vector[i] = new Product(name, price);
            }

            double sum = 0.0;
            for (Product product : vector) {
                sum += product.getPrice();
            }

            double avg = sum / vector.length;
            System.out.printf("AVERAGE PRICE = %.2f%n$ ", avg);

        }
    }
}
