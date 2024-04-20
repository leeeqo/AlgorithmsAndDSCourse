package heapsort;

public class HeapSort {
    public static void sort(Comparable[] pq) {
        int N = pq.length;

        for (int k = N/2; k >= 1; k--) {
            sink(pq, k, N);
        }
        while (N > 1) {
            exch(pq, 1, N);
            sink(pq, 1, --N);
        }
    }

    private static void sink(Comparable[] pq, int k, int N) {
        while (2*k <= N) {
            int j = 2*k;
            if (j < N && less(pq, j, j + 1)) j++;
            if (!less(pq, k, j)) break;
            exch(pq, k, j);
            k = j;
        }
    }

    private static boolean less(Comparable[] pq, int v, int w) {
        return pq[v].compareTo(pq[w]) < 0;
    }

    private static void exch(Comparable[] pq, int v, int w) {
        Comparable temp = pq[v];
        pq[v] = pq[w];
        pq[w] = temp;
    }
}

