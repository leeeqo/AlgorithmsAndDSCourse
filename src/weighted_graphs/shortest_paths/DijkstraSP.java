package weighted_graphs.shortest_paths;

import week2.min_spanning_trees.DirectedEdge;
import week2.min_spanning_trees.EdgeWeightedDigraph;

import java.util.TreeMap;

public class DijkstraSP {
    private DirectedEdge[] edgeTo;
    private double[] distTo;
    private TreeMap<Integer, Double> pq;

    public DijkstraSP(EdgeWeightedDigraph G, int s) {
        edgeTo = new DirectedEdge[G.V()];
        distTo = new double[G.V()];
        pq = new TreeMap<>();

        for (int v = 0; v < G.V(); v++) {
            distTo[v] = Double.POSITIVE_INFINITY;
        }
        distTo[s] = 0.0;

        pq.put(s, 0.0);
        while (!pq.isEmpty()) {
            int v = pq.pollFirstEntry().getKey();
            for (DirectedEdge e : G.adj(v)) {
                relax(e);
            }
        }
    }

    private void relax(DirectedEdge e) {
        int v = e.from(), w = e.to();
        if (distTo[w] > distTo[v] + e.weight()) {
            distTo[w] = distTo[v] + e.weight();
            edgeTo[w] = e;
            pq.put(w, distTo[w]);
        }
    }

    public double[] getDistTo() {
        return distTo;
    }

    public DirectedEdge[] getEdgeTo() {
        return edgeTo;
    }
}
