package Arrays;

public class TrappingRainWater {

    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 5, 2, 1};

        System.out.println(trap(arr));
    }

    public static long trap(int[] h) {
        //You can code here

        if(h.length<2)
            return 0;

        int[] left = new int[h.length];
        int[] right = new int[h.length];

        int max = Integer.MIN_VALUE;

        for(int i=0; i<h.length; i++) {
            max = Math.max(max, h[i]);
            left[i] = max;
        }

        max = Integer.MIN_VALUE;

        for(int i=h.length-1; i>=0; i--) {
            max = Math.max(max, h[i]);
            right[i] = max;
        }

        long area = 0;

        for(int i=0; i<h.length; i++) {
            area += Math.min(left[i], right[i]) - h[i];
        }

        return area;
    }
}
