package non_weighted_graphs.directed_graphs.topological_sort;

import non_weighted_graphs.directed_graphs.Digraph;
import weighted_graphs.DirectedEdge;
import weighted_graphs.EdgeWeightedDigraph;

import java.util.ArrayDeque;
import java.util.Deque;

public class TopologicalSort {
    private boolean[] marked;
    private Deque<Integer> reversePost;

    public TopologicalSort(Digraph G) {
        marked = new boolean[G.V()];
        reversePost = new ArrayDeque<>();

        for (int v = 0; v < G.V(); v++) {
            if (!marked[v])
                dfs(G, v);
        }
    }

    private void dfs(Digraph G, int v) {
        marked[v] = true;
        for (int w : G.adj(v)) {
            if (!marked[w])
                dfs(G, w);
        }
        reversePost.push(v);
    }

    public TopologicalSort(EdgeWeightedDigraph G) {
        marked = new boolean[G.V()];
        reversePost = new ArrayDeque<>();

        for (int v = 0; v < G.V(); v++) {
            if (!marked[v])
                dfs(G, v);
        }
    }

    private void dfs(EdgeWeightedDigraph G, int v) {
        marked[v] = true;
        for (DirectedEdge e : G.adj(v)) {
            int w = e.to();
            if (!marked[w])
                dfs(G, w);
        }
        reversePost.push(v);
    }

    public Iterable<Integer> reversePostOrder() {
        return reversePost;
    }
}
