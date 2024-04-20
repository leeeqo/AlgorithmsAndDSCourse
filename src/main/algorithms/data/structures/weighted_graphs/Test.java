package algorithms.data.structures.weighted_graphs;

import java.util.PriorityQueue;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            pq.add(random.nextInt(100));
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(pq.poll());
        }
    }
}
