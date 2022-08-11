/**
 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar
 * o valor da área deste círculo com quatro casas decimais.
 */

import java.util.Scanner;
import java.util.Locale;

public class AreaDoCirculo1002 {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {

			Locale.setDefault(Locale.US);

			double R, A, pi = 3.14159;

			R = sc.nextDouble();

			A = pi * R * R;

			System.out.printf("A=%.4f%n", A);

		}
	}
}
