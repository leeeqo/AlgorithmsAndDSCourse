package quickselect;

public class QuickSelect {
    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo, j = hi + 1;
        while (true)
        {
            while (less(a[++i], a[lo]))
                if (i == hi) break;
            while (less(a[lo], a[--j]))
                if (j == lo) break;

            if (i >= j) break;
            exch(a, i, j);
        }

        exch(a, lo, j);
        return j;
    }

    public static Comparable select(Comparable[] a, int k) {
        Shuffle.shuffle(a);
        int lo = 0, hi = a.length - 1;
        while (hi > lo) {
            int j = partition(a, lo, hi);

            if (j < k) lo = j + 1;
            else if (j > k) hi = j - 1;
            else return a[k];
        }
        return a[k];
    }

    private static boolean less(Comparable v, Comparable w) {
        if (v.compareTo(w) == -1)
            return true;
        return false;
    }

    public static void exch(Comparable[] a, int v, int w) {
        Comparable temp = a[v];
        a[v] = a[w];
        a[w] = temp;
    }
}
