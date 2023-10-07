package weighted_graphs;

public class Edge implements Comparable<Edge> {
    private final int v, w;
    private final int weight;

    public Edge(int v, int w, int weight) {
        this.v = v;
        this.w = w;
        this.weight = weight;
    }

    public int either() {
        return v;
    }

    public int other(int vertex) {
        if (vertex == v) return w;
        else             return v;
    }

    @Override
    public int compareTo(Edge o) {
        if (this.weight < o.weight)      return -1;
        else if (this.weight > o.weight) return 1;
        else                             return 0;
    }

    public int weight() {
        return weight;
    }

    public String toString() {
        return String.format("%d-%d %d", v, w, weight);
    }
}
