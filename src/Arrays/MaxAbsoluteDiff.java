package Arrays;

public class MaxAbsoluteDiff {

    // | Ai - Aj | + | i - j |
    // find min and max for [Ai + i] & [Ai - i]
    public static void main(String[] args) {

        int[] arr = { 3, -2, 5, -4 };
        System.out.println(getMaxAbsDiff(arr));

    }

    static int getMaxAbsDiff(int[] a) {

        int minPos = Integer.MAX_VALUE, minNeg = Integer.MAX_VALUE, maxPos = Integer.MIN_VALUE, maxNeg = Integer.MIN_VALUE;

        for(int i=0; i<a.length; i++) {
            minPos = Math.min(minPos, a[i] + i);
            maxPos = Math.max(maxPos, a[i] + i);
            minNeg = Math.min(minNeg, a[i] - i);
            maxNeg = Math.max(maxNeg, a[i] - i);
        }

        return Math.max(Math.abs(maxPos - minPos), Math.abs(maxNeg - minNeg));
    }
}
