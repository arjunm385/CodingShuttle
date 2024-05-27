package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerContainingOneTwoAndThree {

    public static void main(String[] args) {

        int[] arr = {321, 123, 89, 32, 11};
        System.out.println(find123Digits(arr, arr.length));
    }

    public static List<Integer> find123Digits(int[] arr, int n) {

        //You can code here

        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        for(int i: arr) {
            if(digitsFound(i)) {
                list.add(i);
            }
        }
        return list;
    }

    static boolean digitsFound(int num) {

        boolean one = false, two = false, three = false;

        while(num>0) {

            int digit = num%10;

            if(digit == 1) {
                one = true;
            }
            else if(digit == 2) {
                two = true;
            }
            else if(digit == 3) {
                three = true;
            }

            num /= 10;
        }

        return one && two && three;
    }
}
