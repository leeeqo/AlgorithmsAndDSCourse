package weighted_graphs.MST;

import week2.min_spanning_trees.Edge;
import week2.min_spanning_trees.EdgeWeightedGraph;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class KruskalMST {
    private Deque<Edge> mst = new ArrayDeque<>();

    public KruskalMST(EdgeWeightedGraph G) {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        for (Edge e : G.edges()) {
            pq.add(e);
        }

        WeightQuickUnionUF uf = new WeightQuickUnionUF(G.V());
        while (!pq.isEmpty() && mst.size() < G.V() - 1) {
            Edge e = pq.poll();
            int v = e.either(), w = e.other(v);
            if (!uf.connected(v, w)) {
                uf.union(v, w);
                mst.add(e);
            }
        }
    }

    public Iterable<Edge> edges() {
        return mst;
    }
}
