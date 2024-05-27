package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MaximumUnsortedSubArray {

    public static void main(String[] args) {
        List<Integer> list = List.of(229462, 879748, 524108, 109767, 416718, 58019, 469065, 89537, 651016, 913512, 398017, 57475, 836393, 857686, 712427, 276823, 803826, 905589);

        System.out.println(subUnsort(list));

    }

    public static List<Integer> subUnsort(List<Integer> A) {
        // You can code here
        List<Integer> list = new ArrayList<>();

        int s = -1;
        int e = -1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < A.size() - 1; i++) {
            if (A.get(i) > A.get(i + 1)) {
                s = i;
                break;
            }
        }

        for (int i = A.size() - 1; i > 0; i--) {
            if (A.get(i) < A.get(i - 1)) {
                e = i;
                break;
            }
        }

        if (s == -1 && e == -1) {
            list.add(-1);
            return list;
        }

        for (int i = s; i <= e; i++) {
            min = Math.min(min, A.get(i));
            max = Math.max(max, A.get(i));
        }

        for (int i = 0; i <= s; i++) {
            if (A.get(i) > min) {
                s = i;
                break;
            }
        }

        for (int i = A.size() - 1; i >= e; i--) {
            if (A.get(i) < max) {
                e = i;
            }
        }

        list.add(s);
        list.add(e);

        return list;
    }
}
