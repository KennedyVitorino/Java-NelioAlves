package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)) {

            Locale.setDefault(Locale.US);

            System.out.println("Qual tamanho terá o vetor?");
            int n = sc.nextInt();
            double[] vector = new double[n];

            System.out.println("Digite os elementos do vetor: ");
            for (int i = 0; i < n; i++) {
                vector[i] = sc.nextDouble();
            }

            double sum = 0.0;
            for (int i = 0; i < n; i++) {
                sum += vector[i];
            }
            double avg = sum / n;

            System.out.printf("AVERAGE HEIGHT: %.2f%n" + avg);

        }
    }
}
