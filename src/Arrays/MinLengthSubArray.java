package Arrays;

public class MinLengthSubArray {

    public static void main(String[] args) {

        int[] a = {1, 2, 5, 6, 7, 2};
        int target = 8;

        System.out.println(minLenSubArray(a, a.length, target));
    }

    static int minLenSubArray(int[] a, int n, int target) {

        int l = 0, r = 0, minLen = Integer.MAX_VALUE, sum = a[r];

        while (r < n) {

            if (sum >= target) {
                minLen = Math.min(minLen, r - l + 1);
                sum -= a[l];
                l++;
            } else {
                r++;
                if (r < n)
                    sum += a[r];
            }
        }

        if(minLen == Integer.MAX_VALUE)
            minLen = 0;

        return minLen;
    }

}
