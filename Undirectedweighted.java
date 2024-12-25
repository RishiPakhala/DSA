import java.util.ArrayList;
public class Undirectedweighted {
    static class Edge {
        int s,d,wt;
        Edge(int s,int d,int wt) {
            this.s=s;
            this.d=d;
            this.wt=wt;
        }
    }
    int v;
    ArrayList<Edge> graph[];
    Undirectedweighted(int v){
        this.v=v;
        this.graph=new ArrayList[v];
        for(int i=0;i<v;i++)
            graph[i]=new ArrayList<Edge>();
    }
    public void addEdge(int s,int d,int wt) {
        Edge edge1=new Edge(s,d,wt);
        graph[s].add(edge1);
        Edge edge2=new Edge(d,s,wt);
        graph[d].add(edge2);
    }
    public void printGraph() 
    {
        for(int i=0;i<v;i++) {
            System.out.print("Vertex: "+i+":");
        for(Edge edge:graph[i]) 
        {
            System.out.print("-> ("+edge.d+", weight: "+edge.wt+")");
        }
        System.out.println();
    }
    }
    public static void main(String args[]) {
        Undirectedweighted graph=new Undirectedweighted(4);
        graph.addEdge(0,1,10);
        graph.addEdge(0,2,0);
        graph.addEdge(1,2,5);
        graph.addEdge(2,3,2);
        graph.printGraph();
    }
}