package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {

        int[] arr = {2,7,11,15,2,7};
        int t = 9;

        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();

        getPairs(arr, t, 0, arr.length-1, list);

        System.out.println(list);

    }

    static void getPairs(int[] a, int t, int l, int r, List<List<Integer>> list) {

        while(l<r) {

            if(l>0 && a[l] == a[l-1]) {
                l++;
                continue;
            }

            if(r<a.length-1 && a[r] == a[r+1]) {
                r--;
                continue;
            }

            if(a[l] + a[r] < t) {
                l++;
            }
            else if(a[l] + a[r] > t) {
                r--;
            }

            else {
                List<Integer> temp = new ArrayList<>();
                temp.add(a[l]);
                temp.add(a[r]);
                list.add(temp);
                l++;
                r--;
            }
        }
    }
}
