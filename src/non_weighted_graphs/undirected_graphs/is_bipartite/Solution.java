package non_weighted_graphs.undirected_graphs.is_bipartite;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
    private boolean[] marked;
    private int[] part;

    public boolean isBipartite(int[][] graph) {
        int v = graph.length;
        marked = new boolean[v];
        part = new int[v];
        for (int i = 0; i < v; i++) {
            part[i] = -1;
        }

        boolean ok = true;
        for (int i = 0; i < v; i++) {
            if (part[i] == -1) {
                boolean what = bfs_bip(graph, i);
                if (!what) {
                    ok = false;
                    break;
                }
            }
        }

        return ok;
    }

    private boolean bfs_bip(int[][] graph, int s) {
        boolean ok = true;
        Queue<Integer> q = new ArrayDeque<>();
        q.add(s);
        marked[s] = true;
        part[s] = 1;

        while (!q.isEmpty()) {
            int v = q.remove();
            for (int w : graph[v]) {
                if (!marked[w]) {
                    q.add(w);
                    marked[w] = true;
                    part[w] = (part[v] + 1) % 2;
                }
                else if (part[w] == part[v])
                    ok = false;
            }
        }

        return ok;
    }
}
