package Arrays;

public class MaxChunksToMakeSorted {

    public static void main(String[] args) {

        int[] arr = {3, 5, 2, 10, 11, 13};
        System.out.println(maxChunksToSorted(arr));

    }

    // 3, 2, 5, 4, 10, 11, 13

    public static int maxChunksToSorted(int[] arr) {
        //You can code here

        int[] temp = new int[arr.length];

        for(int i=0; i<arr.length; i++) {
            temp[i] = arr[i];
        }

        int count = 0;
        for(int i=0; i<arr.length; i++) {

        }

        return 0;
    }
}
