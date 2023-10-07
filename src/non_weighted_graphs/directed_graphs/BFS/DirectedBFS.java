package non_weighted_graphs.directed_graphs.BFS;

import non_weighted_graphs.directed_graphs.Digraph;

import java.util.ArrayDeque;
import java.util.Queue;

public class DirectedBFS {
    private boolean[] marked;
    private int[] edgeTo;
    private int s;

    public DirectedBFS(Digraph G, int s) {
        this.s = s;
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];

        bfs(G, s);
    }

    private void bfs(Digraph G, int s) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(s);
        marked[s] = true;

        while (!q.isEmpty()) {
            int v = q.remove();
            for (int w : G.adj(v)) {
                if (!marked[w]) {
                    q.add(w);
                    marked[w] = true;
                    edgeTo[w] = v;
                }
            }
        }
    }
}
