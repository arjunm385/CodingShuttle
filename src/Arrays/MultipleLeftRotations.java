package Arrays;

import java.util.Arrays;

public class MultipleLeftRotations {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[] b = {2, 3};
        int n = arr.length;
        int m = b.length;

        int[][] res = new int[m][n];
        int[] t = new int[2*n];

        for(int i=0; i<n; i++) {
            t[i] = arr[i];
            t[i+n] = arr[i];
        }

        for(int i=0; i<m; i++) {
            rotateArray(res[i], t, b[i]);
        }

        Arrays.stream(res).forEach(i -> System.out.println(Arrays.toString(i)));

    }

    static void rotateArray(int[] a, int[] t, int k) {
        for(int i = 0; i<a.length; i++) {
            a[i] = t[i+k];
        }
    }
}
