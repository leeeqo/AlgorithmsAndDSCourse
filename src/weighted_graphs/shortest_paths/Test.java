package weighted_graphs.shortest_paths;

import weighted_graphs.DirectedEdge;
import weighted_graphs.EdgeWeightedDigraph;

public class Test {
    public static void main(String[] args) {
        EdgeWeightedDigraph G = new EdgeWeightedDigraph(8);
        createEWDFromCourse(G);

        //DijkstraSP shortestPath = new DijkstraSP(G, 0);
        //double[] distTo = shortestPath.getDistTo();
        //DirectedEdge[] edgeTo = shortestPath.getEdgeTo();

        AcyclicSP acyclicSP = new AcyclicSP(G, 0);
        double[] distTo = acyclicSP.getDistTo();
        DirectedEdge[] edgeTo = acyclicSP.getEdgeTo();

        System.out.println(0 + "\t" + distTo[0] + "\t" + "--");
        for (int v = 1; v < G.V(); v++) {
            System.out.println(v + "\t" + distTo[v] + "\t\t" + edgeTo[v].from()
                                    + "->" + edgeTo[v].to());
        }
    }

    private static void createEWDFromCourse(EdgeWeightedDigraph G) {
        G.addEdge(new DirectedEdge(0, 1, 5));
        G.addEdge(new DirectedEdge(0, 4, 9));
        G.addEdge(new DirectedEdge(0, 7, 8));

        G.addEdge(new DirectedEdge(1, 2, 12));
        G.addEdge(new DirectedEdge(1, 3, 15));
        G.addEdge(new DirectedEdge(1, 7, 4));

        G.addEdge(new DirectedEdge(2, 3, 3));
        G.addEdge(new DirectedEdge(2, 6, 11));

        G.addEdge(new DirectedEdge(3, 6, 9));

        G.addEdge(new DirectedEdge(4, 5, 4));
        G.addEdge(new DirectedEdge(4, 6, 20));
        G.addEdge(new DirectedEdge(4, 7, 5));

        G.addEdge(new DirectedEdge(5, 2, 1));
        G.addEdge(new DirectedEdge(5, 6, 13));

        G.addEdge(new DirectedEdge(7, 2, 7));
        G.addEdge(new DirectedEdge(7, 5, 6));
    }
}
