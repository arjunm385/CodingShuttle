package Arrays;

import java.util.Arrays;

public class MatrixTranspose {

    public static void main(String[] args) {

        int[][] matrix = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};

        Arrays.stream(matrix).forEach(m -> System.out.println(Arrays.toString(m)));

        rotate(matrix);

        System.out.println("-----------------------------------------------------");

        Arrays.stream(matrix).forEach(m -> System.out.println(Arrays.toString(m)));

    }

    public static void rotate(int[][] matrix) {

        int n = matrix.length;

        for (int k = 0; k < n / 2; k++) {
            for (int i = k; i < n - 1 - k; i++) {

                int x = k, y = i;
                int temp = matrix[x][y];

                for (int j = 0; j < 4; j++) {

                    int val = matrix[y][n - x - 1];
                    matrix[y][n - x - 1] = temp;
                    temp = val;

                    int tx = x;
                    x = y;
                    y = n - tx - 1;
                }
            }
        }

    }
}
