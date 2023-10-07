package weighted_graphs;

import non_weighted_graphs.Bag;

import java.util.HashSet;
import java.util.Set;

public class EdgeWeightedGraph {
    private final int V;
    private final Bag<Edge>[] adj;

    public EdgeWeightedGraph(int V) {
        this.V = V;
        adj = (Bag<Edge>[]) new Bag[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new Bag<Edge>();
        }
    }

    public void addEdge(Edge e) {
        int v = e.either();
        int w = e.other(v);
        adj[v].add(e);
        adj[w].add(e);
    }

    public Iterable<Edge> adj(int v) {
        return adj[v];
    }

    public Iterable<Edge> edges() {
        Set<Edge> set = new HashSet<>();
        for (int v = 0; v < V; v++) {
            for (Edge e : adj[v]) {
                set.add(e);
            }
        }
        return set;
    }

    public int V() {
        return V;
    }

    public int E() {
        int count = 0;
        for (int v = 0; v < V; v++) {
            count += adj[v].size();
        }
        return count / 2;
    }
}
