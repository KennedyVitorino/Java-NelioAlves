package application;

import java.util.Scanner;

/**
 * @author Davyd
 *  Faça um programa para ler um ´numero inteiro N e uma matriz de ordem N
 *  contendo números inteiros. Em seguida, mostrar a diagonal principal e
 *  aquantidade e valores negativos da matriz
 */

public class Program {

    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)) {

            int n = sc.nextInt();
            int[][] mat = new int[n][n];

            for (int i = 0; i < mat.length ; i++) {
                for (int j = 0; mat[i].length < n; j++) {
                    mat[i][j] = sc.nextInt();
                }
            }

            System.out.println("Main diagonal:");
            for (int i = 0; i < mat.length; i++) {
                System.out.print(mat[i][i] + " ");
            }
            System.out.println();

            int count = 0;
            for (int[] ints : mat) {
                for (int anInt : ints) {
                    if (anInt < 0) {
                        count++;
                    }
                }
            }
            System.out.println("Negative numbers: " + count);

        }
    }
}
