package quickselect;

public class Main {
    public static void main(String[] args) {
        int n = 1000000;
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
        Shuffle.shuffle(a);

        System.out.println(QuickSelect.select(a, 10));
    }
}
