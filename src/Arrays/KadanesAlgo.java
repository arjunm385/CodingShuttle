package Arrays;

public class KadanesAlgo {

    public static void main(String[] args) {

        int[] arr = {2, -3, -1, 4};
        //        10, 15, 20, 25, 33, 35, 42, 51
        int k = 15;

        System.out.println(lenOfLongSubarr(arr, arr.length, k));
    }

    public static int lenOfLongSubarr (int[] A, int N, int K) {
        //Complete the function

        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i: A) {
            cs += i;
            ms = Math.max(ms, cs);
            if(cs<0)
                cs = 0;
        }

        return ms;
    }
}
