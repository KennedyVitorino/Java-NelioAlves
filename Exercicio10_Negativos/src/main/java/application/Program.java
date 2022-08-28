package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)) {

            Locale.setDefault(Locale.US);

            System.out.print("Quantos numeros voce vai digitar? ");
            int n = sc.nextInt();

            int[] vet = new int[n];

            for (int i =0; i < vet.length; i++) {
                System.out.print("Digite um número: ");
                vet[i] = sc.nextInt();
            }

            System.out.println("NÚMEROS NEGATIVOS:");
            for (int j : vet) {
                if (j < 0) {
                    System.out.println(j);
                }
            }

        }
    }
}
