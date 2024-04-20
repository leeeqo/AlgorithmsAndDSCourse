package algorithms.data.structures.non_weighted_graphs.undirected_graphs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String... args) {
        final List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            lst.add(i);
            System.out.println(lst.get(i));
        }

        System.out.println(1 & 1);
        System.out.println(0 & 1);
        System.out.println(1 & 0);
        System.out.println(0 & 0);
    }
}

