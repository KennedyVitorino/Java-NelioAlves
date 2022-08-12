import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			Locale.setDefault(Locale.US);

			double largura = sc.nextDouble();
			double comprimento = sc.nextDouble();
			double metroQuadrado = sc.nextDouble();

			double area = largura * comprimento;
			double preco = area * metroQuadrado;

			System.out.printf("AREA = %.2f%n" , area);
			System.out.printf("AREA = %.2f%n", preco);
			
		}
	}
}
