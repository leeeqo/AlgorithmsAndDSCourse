package weighted_graphs.MST;

import week2.min_spanning_trees.Edge;
import week2.min_spanning_trees.EdgeWeightedGraph;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class LazyPrimMST {
    private boolean[] marked;
    private Deque<Edge> mst;
    private PriorityQueue<Edge> pq;

    public LazyPrimMST(EdgeWeightedGraph G) {
        marked = new boolean[G.V()];
        mst = new ArrayDeque<>();
        pq = new PriorityQueue<>();

        visit(G, 0);

        while (!pq.isEmpty()) {
            Edge e = pq.poll();
            int v = e.either(), w = e.other(v);
            if (marked[v] && marked[w]) continue;
            mst.add(e);
            if (!marked[v]) visit(G, v);
            if (!marked[w]) visit(G, w);
        }
    }

    public Iterable<Edge> mst() {
        return mst;
    }

    private void visit(EdgeWeightedGraph G, int v) {
        marked[v] = true;
        for (Edge e : G.adj(v)) {
            if (!marked[e.other(v)])
                pq.add(e);
        }
    }
}
