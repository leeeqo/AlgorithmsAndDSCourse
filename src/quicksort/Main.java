package quicksort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String... args) {
        int n = 1000000;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
        //Shuffle.shuffle(a);

        //QuickSort.sort(a);
        Arrays.sort(a);

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
