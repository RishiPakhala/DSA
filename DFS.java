import java.util.*;
class DFS {
    static class Edge {
        int s;
        int d;
        Edge(int s,int d) {
            this.s=s;
            this.d=d;
        }
    }
    int v;
    ArrayList<Edge> graph[];
    DFS(int v) {
        this.v=v;
        this.graph=new ArrayList[v];
        for(int i=0;i<v;i++) {
            graph[i]=new ArrayList<Edge>();
        }

    }
    public void addEdge(int s,int d) {
        Edge edge=new Edge(s,d);
        graph[s].add(edge);
        Edge edge2=new Edge(d,s);
        graph[d].add(edge2);
    }
    public void dfs(int start,boolean[] visited) {
        
        visited[start]=true;
        System.out.print(start+" ");
        for(int i=0;i<graph[start].size();i++) {
            Edge e=graph[start].get(i);
            int dest=e.d;
            if(!visited[dest]) {
                dfs(dest,visited);
            }
        }
    }
    public static void main(String args[]) {
        DFS ob=new DFS(5);
        ob.addEdge(0,1);
        ob.addEdge(0,3);
        ob.addEdge(1,2);
        ob.addEdge(1,3);
        ob.addEdge(2,3);
        ob.addEdge(3,1);
        ob.addEdge(4,1);
        boolean visited[]=new boolean[5];
        ob.dfs(3,visited);
    }
}