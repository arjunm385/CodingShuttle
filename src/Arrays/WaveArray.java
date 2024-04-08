package Arrays;

import java.util.Arrays;

public class WaveArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,7};

        waveArrayLexo(arr);
//        waveArrayNotLexo(arr);
        System.out.println(Arrays.toString(arr));

    }

    // it will take O(n*log n)
    static void waveArrayLexo(int[] arr) {

        Arrays.sort(arr);
        for(int i=1; i<arr.length; i+=2) {
            swap(arr, i, i-1);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //Alternate Approach....Will not give results in Lexographic order but O(n)
    static void waveArrayNotLexo(int[] arr) {
        for(int i=1; i<arr.length; i+=2) {
            if(arr[i]>arr[i-1]) {
                swap(arr, i, i-1);
            }
            if(i<arr.length-1 && arr[i]>arr[i+1]) {
                swap(arr, i, i+1);
            }
        }
    }
}
