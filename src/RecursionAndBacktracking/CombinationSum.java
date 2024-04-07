package RecursionAndBacktracking;

import java.util.*;

public class CombinationSum {

    public static void main(String[] args) {

        int[] nums = {8, 1, 3, 7, 2, 1, 5};

        List<List<Integer>> list = new ArrayList<>();


        find(nums, new ArrayList<Integer>(), nums.length, 0, 12, list);

        Set<List<Integer>> set = new TreeSet<>(new sortCombinationList());
        set.addAll(list);

        list = new ArrayList<>(set);

        list.forEach(System.out::println);


    }

    static void find(int[] candidates, List<Integer> list, int n, int index, int target, List<List<Integer>> res) {
        // Base conditions:
        if (index == n) {
            return;
        }

        for (int i = index; i < n; i++) {
            swap(candidates, index, i);
            list.add(candidates[index]);
            if (check(list, target)) {
                addToList(res, list);
            }

            find(candidates, list, n, index + 1, target, res);
            list.removeLast();
            swap(candidates, index, i);
        }
    }

    private static boolean check(List<Integer> list, int target) {

        int sum = 0;
        for(Integer a : list) {
            sum += a;
        }

        return sum == target;
    }

    private static void swap(int[] candidates, int i, int j) {
        int temp = candidates[i];
        candidates[i] = candidates[j];
        candidates[j] = temp;
    }

    static void addToList(List<List<Integer>> list, List<Integer> l) {
        List<Integer> l1 = new ArrayList<>(l);
        Collections.sort(l1);
        list.add(l1);
    }

}

class sortCombinationList implements Comparator<List<Integer>> {

    @Override
    public int compare(List<Integer> l1, List<Integer> l2) {

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


