package Arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK {

    public static void main(String[] args) {

        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;

        System.out.println(lenOfLongSubarr(arr, arr.length, k));
    }

    public static int lenOfLongSubarr (int[] A, int N, int K) {
        //Complete the function

        Map<Integer, Integer> map = new HashMap<>();
        int length = 0;
        int cs = 0;
        for (int i=0; i<N; i++) {
            cs += A[i];
            if(cs == K)
                length = Math.max(length, i+1);

            if(map.containsKey(cs - K))
                length = Math.max(length, i-map.get(cs-K));

            if(!map.containsKey(cs))
                map.put(cs, i);
        }

        return length;
    }
}
