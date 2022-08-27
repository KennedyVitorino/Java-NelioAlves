package application;

import java.util.Locale;
import java.util.Scanner;
import util.Calculator;

public class Program {

    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)) {

           Locale.setDefault(Locale.US);

           System.out.println("enter radius: ");
           double radius = sc.nextDouble();

           double c = Calculator.circumference(radius);
           double v = Calculator.volume (radius);

           System.out.printf("Circumference: %.2f%n", c);
           System.out.printf("Volume: %.2f%n", v);
           System.out.printf("PI: %.2f%n", Calculator.PI);

        }
    }
}
