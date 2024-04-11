package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int target = 8;
        System.out.println(Arrays.toString(getPair(arr, target)));
    }

    static int[] getPair(int[] a, int t) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<a.length; i++) {
            int compliment = t - a[i];

            if(map.containsKey(compliment)) {
                return new int[] {map.get(compliment), i};
            }

            map.put(a[i], i);
        }

        return new int[0];
    }
}
