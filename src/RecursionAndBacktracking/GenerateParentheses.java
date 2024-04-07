package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public static void main(String[] args) {
        int n = 3;

        List<String> list = new ArrayList<>();

        generate("", 0, 0, n, list);

        System.out.println(list);
    }

    static void generate(String str, int o, int c, int n, List<String> list) {
        if(o == n && c == n) {
            list.add(str);
            return;
        }

        if(o < n) {
            generate(str + '(', o + 1, c, n, list); //Backtracking by maintaining the state of str
        }

        if(c < o) {
            generate(str + ')', o, c + 1, n, list);
        }
    }
}
