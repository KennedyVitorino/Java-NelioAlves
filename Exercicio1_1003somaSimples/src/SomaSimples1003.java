import java.util.Scanner;

/**
 * Faça um programa para ler dois valores inteiros, e depois mostrar 
 * a tela a soma desses números com uma mensagem explicativa, conforme exemplos. 
 */

public class SomaSimples1003 {

	public static void main(String[] args) {
	
		try (Scanner sc = new Scanner(System.in)) {

			int A, B, soma;

			A = sc.nextInt();
			B = sc.nextInt();

			soma = A + B;
			
			System.out.println("A SOMA É = " + soma);
		}
	}
}
