package Arrays;

import java.util.Arrays;

public class SpiralMatrix {

    public static void main(String[] args) {

        Arrays.stream(spiralOrderMatrix(3)).forEach(i -> System.out.println(Arrays.toString(i)));

    }

    public static int[][] spiralOrderMatrix(int n) {
        // You can code here

        int[][] arr = new int[n][n];

        int element = 1, left = 0, right = n-1, top = 0, bottom = n-1;

        while(element <= n*n) {

            //left --> right
            for(int i=left; i<=right; i++) {
                arr[top][i] = element++;
            }
            top++;

            //top --> bottom
            for(int i=top; i<=bottom; i++) {
                arr[i][right] = element++;
            }
            right--;

            //right --> left
            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    arr[bottom][i] = element++;
                }
                bottom--;
            }

            if(left<=right) {
                //bottom --> top
                for (int i = bottom; i >= top; i--) {
                    arr[i][left] = element++;
                }
                left++;
            }
        }

        return arr;
    }
}
