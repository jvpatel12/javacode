package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AdjacencyMatrix {

    static class Edge {
        int src;
        int dest;
        int w;

        public Edge(int s, int d,int w) {
            this.src = s;
            this.dest = d;
            this.w=w;
        }
    }

  

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Adding edges correctly to respective source vertices
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 3));

        graph[1].add(new Edge(1, 0, 2));
        graph[1].add(new Edge(1, 3, 5));

        graph[2].add(new Edge(2, 0, 3));
        graph[2].add(new Edge(2, 4, 7));

        graph[3].add(new Edge(3, 1, 5));
        graph[3].add(new Edge(3, 5, 9));

        graph[4].add(new Edge(4, 2, 7));
        graph[4].add(new Edge(4, 6, 4));

        graph[5].add(new Edge(5, 3, 9));
        graph[5].add(new Edge(5, 6, 6));

        graph[6].add(new Edge(6, 4, 4));
        graph[6].add(new Edge(6, 5, 6));

    }

    public static void bfs(ArrayList<Edge>[] graph,int V){
        Queue<Integer> q=new LinkedList<>();
        boolean[] vs=new boolean[V];

        q.add(0);
        while (!q.isEmpty()){
           int cur=q.remove();
           if(vs[cur] == false){
            System.out.println(cur+",");
            vs[cur] = true;

            for(int i=0;i<graph[cur].size();i++){
                Edge e =graph[cur].get(i);
                q.add(e.dest);
            }
           }

        }   
        
    }
    public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[]){
        System.out.println(curr + " ");
        vis[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(vis[e.dest]==false){
            dfs(graph, e.dest, vis);
        }
    }
    }
    
//O(V^V) exponential time complecity
    public static void printAllPath(ArrayList<Edge> graph[], boolean vis[] , int curr, String path ,int tar){
        if(curr == tar){
            System.out.println(path);
            return;
        }
        for(int i = 0 ; i<graph[curr].size();i++){
            Edge e  = graph[curr].get(i);
            if(!vis[e.dest]){
                vis[curr] = true;
                printAllPath(graph,vis,e.dest,path+e.dest,tar);
                vis[curr] = false;
            }
        }
    }
    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);

        // Printing all destinations connected to vertex 2
        // System.out.print("Edges from vertex 2: ");
        // for (int i = 0; i < graph[2].size(); i++) {
        //     Edge e = graph[2].get(i);
        //     System.out.print(e.dest + ","+e.w+" ");
        // }

        // bfs(graph, V);
        // System.out.println();
       // dfs(graph, V);

        //boolean vis[] = new boolean[V];

        // dfs(graph, 0, vis);
        // System.out.println();

        int src=0;
        int tar=5;
        printAllPath(graph,new boolean[V],src,"0",tar);
    }
}
