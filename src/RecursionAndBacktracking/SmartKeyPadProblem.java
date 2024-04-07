package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class SmartKeyPadProblem {

    public static void main(String[] args) {

        String input = "23558";

        String[] arr = {
                "",
                "",
                "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        List<String> list = new ArrayList<>();

        getWords(input, arr, 0, "", list);

        System.out.println(list);
    }

    static void getWords(String input, String[] arr, int index, String str, List<String> list) {
        // Base Condition
        if(index == input.length()) {
            list.add(str);
            return;
        }

        int pos = input.charAt(index) - '0';

        for(int i=0; i < arr[pos].length(); i++) {
            getWords(input, arr, index+1, str + arr[pos].charAt(i), list);
        }
    }
}
