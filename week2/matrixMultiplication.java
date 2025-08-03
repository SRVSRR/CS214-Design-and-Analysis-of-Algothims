package week2;

import java.util.Scanner;

public class matrixMultiplication {

    // Static method to perform matrix multiplication
    public static void matrixMulti(int n, int[][] A, int[][] B, int[][] C) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of matrix (n x n): ");
        int n = input.nextInt();

        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[][] C = new int[n][n];

        System.out.println("Enter matrix A:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                A[i][j] = input.nextInt();

        System.out.println("Enter matrix B:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                B[i][j] = input.nextInt();

        matrixMulti(n, A, B, C);

        System.out.println("Result of A x B (matrix C):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(C[i][j] + " ");
            System.out.println();
        }

        input.close();
    }
}
