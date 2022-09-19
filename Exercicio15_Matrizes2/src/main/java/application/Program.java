package application;

import java.util.Scanner;

/**
 * @author Davyd
 * Fazer um programa para ler dois números inteiros M e N, e depois ler uma matriz
 * de M linhas por N contendo números inteiros, podendo haver repetições. Em
 * seguida, ler um número inteiro X, mostrar os valores à esquerda, acima, à direita
 * e abaixo de X, quando houver, conforme exemplo.
 */

public class Program {

    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)) {

            int m = sc.nextInt();
            int n = sc.nextInt();
            int[][] mat = new int[m][n];

            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    mat[i][j] = sc.nextInt();
                }
            }

            int x = sc.nextInt();

            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    if (mat[i][j] == x) {
                        System.out.println("Position " + i + "," + j + ":");
                        if (j > 0) {
                            System.out.println("left: " + mat[i][j - 1]);
                        }
                        if (i > 0) {
                            System.out.println("left: " + mat[i - 1][j]);
                        }
                        if (j < mat[i].length - 1) {
                            System.out.println("left: " + mat[i][j + 1]);
                        }
                        if (i < mat.length - 1) {
                            System.out.println("left: " + mat[i + 1][j]);
                        }
                    }
                }
            }


        }
    }
}