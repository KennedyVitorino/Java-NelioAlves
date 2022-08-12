import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Quantos números você vai digitar: ");
			int n = sc.nextInt();
			
			int soma = 0;  // contador
			for (int i = 0; i < n; i++) {
				System.out.print("Número: ");
				int x = sc.nextInt();  // Lendo dados digitados
				soma = soma + x;
			}

			System.out.println("SOMA: " + soma);

		}
	}
}
