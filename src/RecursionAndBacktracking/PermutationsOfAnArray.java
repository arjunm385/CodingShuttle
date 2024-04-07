package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PermutationsOfAnArray {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        List<List<Integer>> list = new ArrayList<>();

        findPermutations(nums, 0, nums.length - 1, list);

        Collections.sort(list, new sortArrayList());

        System.out.println(list);
    }

    static void findPermutations(int[] arr, int l, int r, List<List<Integer>> list) {
        //Base Case:
        if(l == r) {
            addToList(arr, list);
            return;
        }

        for(int i=l; i<=r; i++) {
            swap(arr, i, l);
            findPermutations(arr, l+1, r, list);
            swap(arr, i, l);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void addToList(int[] arr, List<List<Integer>> list) {
        List<Integer> l = new ArrayList<>();
        for(int a: arr) {
            l.add(a);
        }
        list.add(l);
    }
}

class sortArrayList implements Comparator<List<Integer>> {

    @Override
    public int compare(List<Integer> l1, List<Integer> l2) {
        for (int i = 0; i < l1.size(); i++) {
            if (l1.get(i) < l2.get(i))
                return -1;
        }
        return 1;
    }
}
