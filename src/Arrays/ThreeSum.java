package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {

        int[] arr = {-1, 0, 1, 2, -1, -4};

        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < arr.length - 2; i++) {

            if (i > 0 && arr[i] == arr[i - 1])
                continue;
            List<List<Integer>> list = new ArrayList<>();
            getPairs(arr, -arr[i], i + 1, arr.length - 1, list);
            if (!list.isEmpty()) {
                res.addAll(list);
            }
        }

        System.out.println(res);
    }

    static void getPairs(int[] a, int t, int l, int r, List<List<Integer>> list) {

        int start = l;

        while (l < r) {

            if (l > start && a[l] == a[l - 1]) {
                l++;
                continue;
            }

            if (r < a.length - 1 && a[r] == a[r + 1]) {
                r--;
                continue;
            }

            if (a[l] + a[r] < t) {
                l++;
            } else if (a[l] + a[r] > t) {
                r--;
            } else {
                List<Integer> temp = new ArrayList<>();
                temp.add(-t);
                temp.add(a[l]);
                temp.add(a[r]);
                list.add(temp);
                l++;
                r--;
            }
        }
    }
}
