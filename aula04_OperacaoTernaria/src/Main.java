public class Main {
	public static void main(String[] args) {

		double preco = 43.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

		System.out.printf("Preco: R$%.2f%n", preco);
    System.out.printf("desconto: R$%.2f%n", desconto);

	}
}
