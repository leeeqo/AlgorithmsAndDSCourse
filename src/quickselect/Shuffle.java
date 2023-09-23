package quickselect;

import java.util.Random;

public class Shuffle {
    public static void shuffle(Comparable[] array) {
        shuffle(new Random(), array);
    }

    private static void shuffle(Random random, Comparable[] array) {
        int count = array.length;
        for (int i = count; i > 1; i--) {
            swap(array, i - 1, random.nextInt(i));
        }
    }

    private static void swap(Comparable[] array, int v, int w) {
        Comparable temp = array[v];
        array[v] = array[w];
        array[w] = temp;
    }
}
