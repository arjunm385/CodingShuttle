package Arrays;

import java.util.Arrays;
import java.util.Vector;

public class MissingAndRepeatingNumbers {

    public static void main(String[] args) {

        int[] a = {1, 1, 2, 3, 4, 6};

        System.out.println(findNumbers(a));
    }

    public static Vector<Integer> findNumbers(int[] a)
    {
        //You can code here

        int repeating = -1;
        int missing = -1;
        int pos = 1;

        Arrays.sort(a);

        for(int i = 0; i<a.length; i++) {

            if(repeating == -1 && i>0 && a[i] == a[i-1]) {
                repeating = a[i];
                continue;
            }
            if(missing == -1 && a[i] != pos) {
                missing = pos++;
            }
            pos++;
        }

        if(missing == -1) {
            missing = a.length;
        }

        Vector<Integer> vector = new Vector<>();
        vector.add(repeating);
        vector.add(missing);

        return vector;
    }
}
