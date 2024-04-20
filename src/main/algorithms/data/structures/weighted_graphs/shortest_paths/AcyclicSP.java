package algorithms.data.structures.weighted_graphs.shortest_paths;

import algorithms.data.structures.non_weighted_graphs.directed_graphs.topological_sort.TopologicalSort;
import algorithms.data.structures.weighted_graphs.DirectedEdge;
import algorithms.data.structures.weighted_graphs.EdgeWeightedDigraph;

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
