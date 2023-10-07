package mergesort;

public class Main {
    public static void main(String... args) {
        int n = 10;
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
        Shuffle.shuffle(a);

        MergeSort.sort(a);

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
