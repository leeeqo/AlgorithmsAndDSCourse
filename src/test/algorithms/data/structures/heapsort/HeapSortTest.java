package algorithms.data.structures.heapsort;

import algorithms.data.structures.shuffle.Shuffle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeapSortTest {
    int length;
    Integer[] array;

    @BeforeEach
    public void initArray() {
        length = 10;
        array = new Integer[length];

        for (int i = 0; i < length; i++) {
            array[i] = i;
        }

        Shuffle.shuffle(array);
    }

    @Test
    public void whenShuffledThenSorted() {
        HeapSort.sort(array);

        for (int i = 0; i < length; i++) {
            Assertions.assertEquals(i, array[i]);
        }
    }
}