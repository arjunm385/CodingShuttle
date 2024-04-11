package Arrays;

public class MaxAbsoluteDiffAdvanced {

    // | A1i - A1j | + | A2i - A2j | + | i - j |
    public static void main(String[] args) {

        int[] a1 = { 3, -2, 5, -4 };
        int[] a2 = { 3, -2, 5, -4 };
        System.out.println(getMaxAbsDiff(a1, a2));

    }

    static int getMaxAbsDiff(int[] a, int[] b) {

        int min1 = Integer.MAX_VALUE,
                min2 = Integer.MAX_VALUE,
                min3 = Integer.MAX_VALUE,
                min4 = Integer.MAX_VALUE,
                max1 = Integer.MIN_VALUE,
                max2 = Integer.MIN_VALUE,
                max3 = Integer.MIN_VALUE,
                max4 = Integer.MIN_VALUE;

        for(int i=0; i<a.length; i++) {
            // 1st scenario arr1[i] + arr2[i] + i
            min1 = Math.min(min1, a[i] + b[i] + i);
            max1 = Math.max(max1, a[i] + b[i] + i);
            // 2nd scenario arr1[i] + arr2[i] - i
            min2 = Math.min(min2, a[i] + b[i] - i);
            max2 = Math.max(max2, a[i] + b[i] - i);
            // 3rd scenario arr1[i] - arr2[i] + i
            min3 = Math.min(min3, a[i] - b[i] + i);
            max3 = Math.max(max3, a[i] - b[i] + i);
            // 4th scenario arr1[i] - arr2[i] - i
            min4 = Math.min(min4, a[i] - b[i] - i);
            max4 = Math.max(max4, a[i] - b[i] - i);
        }

        return Math.max(Math.max(max1 - min1, max2 - min2), Math.max(max3 - min3, max4 - min4));

    }


}
