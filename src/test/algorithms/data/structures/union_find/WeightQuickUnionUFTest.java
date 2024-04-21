package algorithms.data.structures.union_find;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeightQuickUnionUFTest {
    int number;
    WeightQuickUnionUF qf;

    @BeforeEach
    public void init() {
        number = 10;
        qf = new WeightQuickUnionUF(number);
    }

    @Test
    public void connectedTest() {
        qf.union(0, 5);
        qf.union(5, 6);

        qf.union(1, 2);
        qf.union(2, 7);

        qf.union(3, 8);
        qf.union(4, 9);
        qf.union(3, 4);

        assertTrue(qf.connected(1, 7));
        assertTrue(qf.connected(0, 6));
        assertTrue(qf.connected(3, 9));

        assertFalse(qf.connected(1, 6));
        assertFalse(qf.connected(1, 9));
        assertFalse(qf.connected(0, 9));
    }
}