package org.example.Codingtasks;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {22, 40, 90, 65},
                {15, 50, 33, 30}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= matrix.length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    System.out.print(matrix[i][j] + " ");
                }

            }
            System.out.println();
        }
    }


}

