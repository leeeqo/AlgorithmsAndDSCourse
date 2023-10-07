package non_weighted_graphs.directed_graphs;

import non_weighted_graphs.Bag;

import java.util.Scanner;

public class Digraph {
    private final int V;
    private Bag<Integer>[] adj;

    public Digraph(int V) {
        this.V = V;

        adj = (Bag<Integer>[]) new Bag[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new Bag<Integer>();
        }
    }

    public Digraph(Scanner in) {
        String[] st = in.nextLine().split(" ");
        int n = Integer.parseInt(st[0]);
        V = Integer.parseInt(st[1]);

        adj = (Bag<Integer>[]) new Bag[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new Bag<Integer>();
        }

        for (int i = 0; i < n; i++) {
            st = in.nextLine().split(" ");
            addEdge(Integer.parseInt(st[0]) - 1, Integer.parseInt(st[1]) - 1);
        }
    }

    public int V() {
        return V;
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

    public Digraph reverse() {
        Digraph reversedG = new Digraph(V);
        for (int v = 0; v < V; v++) {
            reversedG.adj[v] = new Bag<>();
        }

        for (int v = 0; v < V; v++) {
            for (int w : adj[v]) {
                reversedG.addEdge(w, v);
            }
        }

        return reversedG;
    }
}
