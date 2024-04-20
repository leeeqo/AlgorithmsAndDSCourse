package algorithms.data.structures.non_weighted_graphs.directed_graphs.strongly_connected_components;

import algorithms.data.structures.non_weighted_graphs.directed_graphs.Digraph;
import algorithms.data.structures.non_weighted_graphs.directed_graphs.topological_sort.TopologicalSort;

public class KosarajuSharirSCC {
    private boolean[] marked;
    private int[] id;
    private int count;

    public KosarajuSharirSCC(Digraph G) {
        marked = new boolean[G.V()];
        id = new int[G.V()];
        count = 0;

        TopologicalSort tp = new TopologicalSort(G.reverse());
        for (int v : tp.reversePostOrder()) {
            if (!marked[v]) {
                dfs(G, v);
                count++;
            }
        }
    }

    public boolean stronglyConnected(int v, int w) {
        return id[v] == id[w];
    }

    private void dfs(Digraph G, int v) {
        marked[v] = true;
        id[v] = count;

        for (int w : G.adj(v)) {
            if (!marked[w]) {
                dfs(G, w);
            }
        }
    }
}
