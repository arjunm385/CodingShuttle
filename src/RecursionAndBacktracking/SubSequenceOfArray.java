package RecursionAndBacktracking;

import java.util.*;

public class SubSequenceOfArray {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(9);
        arr.add(8);

        Set<ArrayList<Integer>> res = new TreeSet<>(new sortList());

        getSubArrays(arr, arr.size(), new ArrayList<Integer>(), 0, res);

        new ArrayList<>(res).forEach(System.out::println);
    }

    static void getSubArrays(ArrayList<Integer> arr, int n, ArrayList<Integer> list, int index, Set<ArrayList<Integer>> res) {
        // Base condition:
        if(index == n) {
            res.add(list);
            return;
        }
        ArrayList<Integer> l1 = new ArrayList<>(list);
        ArrayList<Integer> l2 = new ArrayList<>(list);

        getSubArrays(arr, n, l1, index + 1, res);
        l2.add(arr.get(index));
        getSubArrays(arr, n, l2, index + 1, res);

    }
}

class sortList implements Comparator<ArrayList<Integer>> {

    @Override
    public int compare(ArrayList<Integer> l1, ArrayList<Integer> l2) {

        if(l1.isEmpty())
            return -1;

        if(l2.isEmpty())
            return 1;

        int size = l1.size();
        if(l2.size()<l1.size())
            size = l2.size();

        for(int i=0; i<size; i++) {
            if(l1.get(i) != l2.get(i))
                return l1.get(i) - l2.get(i);
        }

        if(l1.size() < l2.size())
            return -1;
        else if(l2.size() < l1.size())
            return 1;
        else
            return 0;
    }
}
