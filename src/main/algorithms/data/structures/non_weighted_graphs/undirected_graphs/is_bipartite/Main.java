package algorithms.data.structures.non_weighted_graphs.undirected_graphs.is_bipartite;

public class Main {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //Graph G = new Graph(in);

        Solution solution = new Solution();
        boolean res = solution.isBipartite(new int[][]{{2,4},{2,3,4},{0,1},{1},{0,1},{7},{9},{5},{},{6}});
        System.out.println(res);
    }
}
