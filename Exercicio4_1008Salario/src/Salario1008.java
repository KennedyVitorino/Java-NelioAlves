import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa que leia o número de um funcionário, seu número de
 * horas trabalhadas, o valor que recebe por hora e calcula o salário
 * desse funcionário. A seguir, mostre o número e o salário do funcionário,
 * com duas casas decimais.
 */

public class Salario1008 {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {

			Locale.setDefault(Locale.US);

			int numero, horas;
			double valorHora, salario;

			numero = sc.nextInt();
			horas = sc.nextInt();
			valorHora = sc.nextDouble();

			salario = (double) valorHora * horas;

			System.out.println("NUMBER = " + numero);
			System.out.printf("SALARY = U$ %.2f%n", salario);

		}
	}
}
