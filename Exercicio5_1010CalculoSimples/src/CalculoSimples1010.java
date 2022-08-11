/**
 * Fazer um programa para ler o código de uma peça 1, o número de peças 1,
 * o valor unitário de cada peça 1, o código de uma peça 2, o número de
 * peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a
 * ser pago. 
 */

import java.util.Locale;
import java.util.Scanner;

public class CalculoSimples1010 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			Locale.setDefault(Locale.US);	

			int cod1, cod2, qte1, qte2;
			double pre1, pre2, total;

			cod1 = sc.nextInt();
			qte1 = sc.nextInt();
			pre1 = sc.nextDouble();

			cod2 = sc.nextInt();
      qte2 = sc.nextInt();
      pre2 = sc.nextDouble();

			total = pre1 * qte1 + pre2 * qte2;

			System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

		}
	}
}