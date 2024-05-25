package Arrays;

import java.util.Arrays;

public class minOperationMatrixEleEqual {

    public static void main(String[] args) {

        int[][] a = {
                {0, 2, 8},
                {8, 2, 0},
                {0, 2, 8}
        };

        int k = 2; //multiplier
        int n = a.length, m = a[0].length;

        System.out.println("min operations required is: " + minOperations(n, m, k, a));

    }

    public static int minOperations(int n, int m, int k, int[][] a) {
        //You Can Code Here

        int[] arr = new int[n*m];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(a[i][j]%k != 0)
                    return -1;
                arr[i*m+j] = a[i][j];
            }
        }

        Arrays.sort(arr);

        int median = arr.length/2, count = 0;

        for (int i : arr) {
            count += Math.abs(i - arr[median]) / k;
        }

        return count;
    }
}
