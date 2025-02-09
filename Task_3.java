import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        int[][] matrix = {
            {12, 13, 15, 16},
            {11, 110, 121, 17},
            {17, 18, 100, 21}
        };

        int evenSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    matrix[i][j] /= 2;
                }
            }
        }

        System.out.println("Odd numbers in the matrix:");
        for (int[] row : matrix) {
            for (int num : row) {
                if (num % 2 != 0) {
                    System.out.print(num + " ");
                }
            }
        }
        System.out.println();

        for (int[] row : matrix) {
            for (int num : row) {
                if (num % 2 == 0) {
                    evenSum += num;
                }
            }
        }

        System.out.println("Sum of updated even numbers: " + evenSum);
    }
}