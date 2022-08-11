import java.util.Locale;
import java.util.Scanner;

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
