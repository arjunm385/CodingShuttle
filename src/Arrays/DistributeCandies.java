package Arrays;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 3, 3, 4, 5 };

        System.out.println(distributeCandies(arr));
    }

    public static int distributeCandies(int[] candyType) {

        Set<Integer> set = new HashSet<>();

        for(int i: candyType)
            set.add(i);

        return Math.min(set.size(), candyType.length / 2);

    }
}
