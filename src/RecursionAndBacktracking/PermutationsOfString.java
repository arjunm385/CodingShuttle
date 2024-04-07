package RecursionAndBacktracking;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PermutationsOfString {

    public static void main(String[] args) {

        String str = "AAC";

        Set<String> set = new TreeSet<>();

        permute(str.split(""), 0, "", set);

        System.out.println(set);
    }

    static void permute(String[] input, int index, String res, Set<String> set) {

        if(index == input.length) {
            set.add(res);
            return;
        }

        for(int i = index; i<input.length; i++) {
             swap(input, i, index);
            permute(input, index+1, res + input[index], set);
            swap(input, i, index);
        }

    }

    static void swap(String[] str, int i, int j) {
        String temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}
