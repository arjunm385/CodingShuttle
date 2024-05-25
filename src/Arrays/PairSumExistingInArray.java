package Arrays;

import java.util.*;

public class PairSumExistingInArray {

    public static void main(String[] args) {
        int[] arr = {1, 9, 10, 8, 2, 2, 10, 7, 9, 1};

        System.out.println(findPair(arr));
    }

    public static List<List<Integer>> findPair(int[] arr)
    {

        HashSet<Integer> set = new HashSet<>();

        for(int i: arr) {
            set.add(i);
        }

        //You can code here
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(set.contains(arr[i] + arr[j])) {
                    list.add(List.of(arr[i], arr[j]));
                }
            }
        }

        list.sort(new sortArrayList());

        return list;

    }
}

class sortArrayList implements Comparator<List<Integer>> {

    @Override
    public int compare(List<Integer> l1, List<Integer> l2) {
        for (int i = 0; i < l1.size(); i++) {
            if (l1.get(i) < l2.get(i)) {
                return -1;
            }
            else if(l1.get(i) > l2.get(i)) {
                return 1;
            }
        }
        return 0;
    }
}
