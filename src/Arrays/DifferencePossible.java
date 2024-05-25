package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DifferencePossible {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 6, 8, 8, 8};

        System.out.println(diffPossible(arr, 2));
    }

    public static boolean diffPossible(int[] arr, int k)
    {
        //You Can Code Here

        Set<Integer> set = new HashSet<>();

        for(int i: arr) {
            if(set.contains(i)){
                return true;
            }
            set.add(i+k);
        }

        return false;
    }
}
