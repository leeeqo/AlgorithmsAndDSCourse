package algorithms.data.structures.quickselect;

import algorithms.data.structures.shuffle.Shuffle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSelectTest {
    int length;
    Integer[] array;

    @BeforeEach
    public void initArray() {
        length = 1000;
        array = new Integer[length];

        for (int i = 0; i < length; i++) {
            array[i] = i;
        }

        Shuffle.shuffle(array);
    }

    @Test
    public void testQuickSelect() {
        for (int i = 0; i < length; i++) {
            assertEquals(i, QuickSelect.select(array, i));
        }
    }
}