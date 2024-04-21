package algorithms.data.structures.priorityQueue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MaxPQTest {
    int capacity;
    MaxPQ<Integer> pq;
    Random random;

    @Test
    public void testMaxPQOrderForRandomElements() {
        capacity = 100;
        pq = new MaxPQ<>(capacity);
        random = new Random();

        for (int i = 0; i < capacity; i++) {
            pq.insert(random.nextInt(100));
        }

        int deleted;
        for (int i = 0; i < capacity - 1; i++) {
            deleted = pq.delMax();

            assertTrue(deleted >= pq.max());
        }
    }
}