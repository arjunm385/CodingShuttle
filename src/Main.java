import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Integer> list = new ArrayList<>();

        list.add(1);

        list.sort(Comparator.comparingInt(a -> a));
        Set<List<Integer>> set = new TreeSet<>(new sortArrayList());

        set.stream().collect(Collectors.toList());

        System.out.println(list);
    }
}

class sortArrayList implements Comparator<List<Integer>> {

    @Override
    public int compare(List<Integer> l1, List<Integer> l2) {
        for (int i = 0; i < l1.size(); i++) {
            if (l1.get(i) < l2.get(i))
                return -1;
        }
        return 1;
    }
}