package algorithms.data.structures.non_weighted_graphs.undirected_graphs;

public interface Paths {
    boolean hasPathTo(int v);

    Iterable<Integer> pathTo(int v);
}
