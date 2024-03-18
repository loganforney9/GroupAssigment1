package org.example.Codingtasks;

public class Task4 {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {22, 40, 90, 65},
                {15, 50, 33, 30}
        };
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= matrix.length; j++) {
                sum = sum+ matrix[i][j];


            }

        }
        System.out.print(sum);

    }
}

