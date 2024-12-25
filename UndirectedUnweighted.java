import java.util.ArrayList;
class UndirectedUnweighted {
    private int[][] myGraph;
    private int v;
    public UndirectedUnweighted(int v) {
        this.v=v;
        myGraph = new int[v][v];
    }
    public void addEdge(int s,int d,int wt) {
        myGraph[s][d]=wt;
        myGraph[d][s]=wt;

    }
    public void printGraph() {
        System.out.println("Adjacency Matrix:");
        for(int i=0;i<v;i++) {
            for(int j=0;j<v;j++) {
                System.out.print(myGraph[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        UndirectedUnweighted graph=new UndirectedUnweighted(4);
        graph.addEdge(0,1,1);
        graph.addEdge(0,2,1);
        graph.addEdge(1,3,1);
        graph.addEdge(2,3,1);
        graph.printGraph();
    }
}