package weighted_graphs.shortest_paths;

import week1.directed_graphs.topological_sort.TopologicalSort;
import week2.min_spanning_trees.DirectedEdge;
import week2.min_spanning_trees.EdgeWeightedDigraph;

public class AcyclicSP {
    private DirectedEdge[] edgeTo;
    private double[] distTo;

    public AcyclicSP(EdgeWeightedDigraph G, int s) {
        edgeTo = new DirectedEdge[G.V()];
        distTo = new double[G.V()];

        for (int v = 0; v < G.V(); v++) {
            distTo[v] = Double.POSITIVE_INFINITY;
        }
        distTo[s] = 0;

        TopologicalSort topologicalSort = new TopologicalSort(G);
        for (int v : topologicalSort.reversePostOrder()) {
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
        }
    }

    public DirectedEdge[] getEdgeTo() {
        return edgeTo;
    }

    public double[] getDistTo() {
        return distTo;
    }
}
