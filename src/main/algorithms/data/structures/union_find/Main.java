package algorithms.data.structures.union_find;

public class Main {
    public static void main(String[] args) {
        WeightQuickUnionUF qf = new WeightQuickUnionUF(10000);

        qf.union(0, 5);
        qf.union(5, 6);

        qf.union(1, 2);
        qf.union(2, 7);

        qf.union(3, 8);
        qf.union(4, 9);
        qf.union(3, 4);

        System.out.println(qf.connected(1, 7));
        System.out.println(qf.connected(0, 6));
        System.out.println(qf.connected(3, 9));

        System.out.println(qf.connected(1, 6));
        System.out.println(qf.connected(1, 9));
        System.out.println(qf.connected(0, 9));
    }
}
