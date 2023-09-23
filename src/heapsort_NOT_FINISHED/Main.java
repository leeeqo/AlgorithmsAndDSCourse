package heapsort_NOT_FINISHED;

public class Main {
    public static void main(String[] args) {
        int n = 6;
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
        Shuffle.shuffle(a);

        HeapSort.sort(a);
        //Arrays.sort(a);

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
