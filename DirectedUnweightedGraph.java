import java.util.ArrayList;

public class DirectedUnweightedGraph {
    static class Edge{
        int s,d;
        Edge(int s,int d){
            this.s=s;
            this.d=d;
        }
    }
    int v;
    ArrayList<Edge> graph[];
    DirectedUnweightedGraph(int v){
        this.v=v;
        this.graph=new ArrayList[v];
        for(int i=0;i<v;i++)
            graph[i]=new ArrayList<Edge>();
    }
    public void addEdge(int s,int d){
        Edge edge = new Edge(s,d);
        graph[s].add(edge);
    }
    public void printGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<v;i++){
            ArrayList<Edge> currList = graph[i];
            System.out.print("for "+i+" ");
            for(Edge e:currList){
                System.out.print("->"+e.d);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        DirectedUnweightedGraph ob = new DirectedUnweightedGraph(4);
        ob.addEdge(0,1);
        ob.addEdge(0,3);
        ob.addEdge(1,1);
        ob.addEdge(1,2);
        ob.addEdge(1,3);
        ob.addEdge(2,3);
        ob.addEdge(3,0);
        ob.addEdge(3,1);
        ob.printGraph(ob.graph);
    }
}    